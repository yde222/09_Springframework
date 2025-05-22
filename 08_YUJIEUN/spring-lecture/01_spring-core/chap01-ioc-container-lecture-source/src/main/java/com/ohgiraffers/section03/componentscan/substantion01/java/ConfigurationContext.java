package com.ohgiraffers.section03.componentscan.substantion01.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationContextJava")
/*@ConponnentScan : Componnent Scan과 관련된 설정을 기입하여 basePackages를 기입하지 않으면
* default는 현재 패키지 기준으로 Scan이 수행된다.*/
@ComponentScan(basePakage = "com.ohgiraffers")
public class ConfigurationContext {
}
