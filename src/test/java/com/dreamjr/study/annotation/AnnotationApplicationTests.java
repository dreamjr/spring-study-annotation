package com.dreamjr.study.annotation;

import com.dreamjr.study.annotation.service.AnnotationService;
import com.dreamjr.study.annotation.service.CustomAnnotationService;
import com.dreamjr.study.annotation.service.CustomAnnotationServiceImpl;
import com.dreamjr.study.annotation.service.CustomAnnotationWithNameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AnnotationApplicationTests {

    @Autowired
    AnnotationService annotationService;

    @Autowired
    CustomAnnotationServiceImpl customAnnotationService;

    @Autowired
    CustomAnnotationWithNameService customAnnotationWithNameService;

    @Autowired
    private ApplicationContext context;

    @Test
    void serviceAnnotationTest() {
        assertThat(annotationService.getName()).isEqualTo("ServiceAnnotation");
    }

    @Test
    void customServiceAnnotationTest() {
        assertThat(customAnnotationService.getName()).isEqualTo("Custom-ServiceAnnotation");
    }

    @Test
    void getAnnotationServiceBeanTest() {
        AnnotationService annotationServiceLocal
                = (AnnotationService) context.getBean("annotationService");
        assertThat(annotationServiceLocal.getName()).isEqualTo("ServiceAnnotation");
    }

    @Test
    void getCustomServiceAnnotationBeanTest() {
        CustomAnnotationService customAnnotationServiceLocal
                = (CustomAnnotationService) context.getBean("customAnnotationService");
        assertThat(customAnnotationServiceLocal.getName()).isEqualTo("Custom-ServiceAnnotation");
    }

    @Test
    void getCustomServiceAnnotationWithNameBeanTest() {
        CustomAnnotationWithNameService customAnnotationWithNameServiceLocal =
                (CustomAnnotationWithNameService) context.getBean("customAnnotationWithNameService");
        assertThat(customAnnotationWithNameServiceLocal.getName()).isEqualTo("Custom-Annotation-With-Name");
    }

}
