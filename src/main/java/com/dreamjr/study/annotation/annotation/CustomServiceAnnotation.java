package com.dreamjr.study.annotation.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface CustomServiceAnnotation {

    // @AliasFor 줄을 주석 처리하더라도 bean name이 잘 생성된다
    //   Spring에서는 @Component의 value 가 아니라
    //   실제 선언한 annotation(@CustomServiceAnnotation)의 value 값을 bean name으로 설정하는 것 같다
    @AliasFor(annotation = Component.class)
    String value() default "";
}
