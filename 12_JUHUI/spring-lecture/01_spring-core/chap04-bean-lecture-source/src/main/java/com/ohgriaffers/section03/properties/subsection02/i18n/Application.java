package com.ohgriaffers.section03.properties.subsection02.i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Application {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ObjectInputFilter.Config.class);

    String error404KR = applicationContext.getMessage(
            "error.404", null, Locale.KOREA
    );
    String error500KR = applicationContext.getMessage(
            "error.500", new Object[] {"여러분", new Date() }, Locale.KOREA
    );

    String error404US = applicationContext.getMessage(
            "error.404", null, Locale.US
    );
    String error500US = applicationContext.getMessage(
            "error.500", new Object[] {"you", new Date() }, Locale.US
    );

        System.out.println(error404KR);
        System.out.println(error500KR);
        System.out.println(error404US);
        System.out.println(error500US);
}
