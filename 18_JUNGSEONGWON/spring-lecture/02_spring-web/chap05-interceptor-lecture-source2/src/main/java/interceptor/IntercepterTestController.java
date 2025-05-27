package interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntercepterTestController {
    @GetMapping({"/stopwatch"}) // 핸들러 메소드
    public String stopwatch() throws InterruptedException {
        System.out.println("Handler Method 호출 시점");
        Thread.sleep(1000);
        return "result";
    }
}
