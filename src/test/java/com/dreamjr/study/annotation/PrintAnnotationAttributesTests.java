package com.dreamjr.study.annotation;

import com.dreamjr.study.annotation.annotation.CustomServiceAnnotation;
import com.dreamjr.study.annotation.annotation.CustomServiceAnnotationWithName;
import com.dreamjr.study.annotation.service.CustomAnnotationServiceImpl;
import com.dreamjr.study.annotation.service.CustomAnnotationWithNameServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.stereotype.Component;

public class PrintAnnotationAttributesTests {
    @Test
    void displayAnnotationsCustomServiceAnnotation() {
        System.out.println("=========================================================");

        AnnotationAttributes aa = AnnotatedElementUtils.getMergedAnnotationAttributes(CustomAnnotationServiceImpl.class
                , CustomServiceAnnotation.class);
        System.out.println(aa);

        AnnotationAttributes bb = AnnotatedElementUtils.getMergedAnnotationAttributes(CustomAnnotationServiceImpl.class
                , Component.class);
        System.out.println(bb);

        System.out.println("=========================================================");
    }

    @Test
    void displayAnnotationsCustomServiceAnnotationWithName() {
        System.out.println("=========================================================");

        AnnotationAttributes aa = AnnotatedElementUtils.getMergedAnnotationAttributes(CustomAnnotationWithNameServiceImpl.class
                , CustomServiceAnnotationWithName.class);
        System.out.println(aa);

        AnnotationAttributes bb = AnnotatedElementUtils.getMergedAnnotationAttributes(CustomAnnotationWithNameServiceImpl.class
                , Component.class);
        System.out.println(bb);

        System.out.println("=========================================================");
    }
}
