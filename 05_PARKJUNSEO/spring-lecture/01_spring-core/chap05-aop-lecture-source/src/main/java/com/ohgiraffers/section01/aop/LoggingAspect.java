package com.ohgiraffers.section01.aop;

import org.aspectj.apache.bcel.generic.RET;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Aspect // Aspect (분리된 횡단 관심사) : Point-cut (삽입 시점) + Advice (부가 코드)
public class LoggingAspect {

    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void logPointcut() {}

    // Advice (부가코드)

    // Before : 핵심 기능 수행 전 동작
    @Before("LoggingAspect.logPointcut()")
    public void logBefore(JoinPoint joinPoint) {
        // JoinPoint : 포인트 컷으로 패치한 실행 시점으로 메소드명, 인수값 등의 정보에 접근 가능
        System.out.println("before joinPoint.getTarget()) : " + joinPoint.getTarget());
        System.out.println("before joinPoint.getSignature()) : " + joinPoint.getSignature());
        if(joinPoint.getArgs().length > 0) {
            System.out.println("before joinPoint.getArgs()[0] : " + joinPoint.getArgs()[0]);
        }
    }

    // After : 핵심 기능 수행 후 동작 -> 정상 수행 or 오류 발생 모두 수행
    @After("logPointcut()") // 같은 클래스인 경우 클래스명 생략 가능, 다른 패키지인 경우 패키지명까지 기술
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("after joinPoint.getTarget()) : " + joinPoint.getTarget());
        System.out.println("after joinPoint.getSignature()) : " + joinPoint.getSignature());
        if(joinPoint.getArgs().length > 0) {
            System.out.println("after joinPoint.getArgs()[0] : " + joinPoint.getArgs()[0]);
        }
    }

    // AfterReturning : 메소드 정상 수행 수 반환할 경우
    @AfterReturning(pointcut = "logPointcut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("after returning result : " + result);
        if (result instanceof Map) {
            ((Map<Long, MemberDTO>) result).put(100L, new MemberDTO(100L, "반환값 가공"));
        }
    }

    // AfterThrowing : exception 발생 후 동작
    @AfterThrowing(pointcut = "logPointcut()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println("after throwing exception : " + exception);
    }

    // Around : 핵심 기능 시작과 끝을 감싸고 동작
    @Around("logPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("====> around before : " + joinPoint.getSignature());

        Object result = joinPoint.proceed();    // 원본 조인 포인트를 실행하는 코드

        return result;
    }
}
