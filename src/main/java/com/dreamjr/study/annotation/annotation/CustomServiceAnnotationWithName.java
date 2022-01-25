package com.dreamjr.study.annotation.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface CustomServiceAnnotationWithName {
    @AliasFor(annotation = Component.class)
    String value() default "";

    @AliasFor(annotation = Component.class, attribute = "value")
    String withName() default "";
}
