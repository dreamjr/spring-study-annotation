package com.dreamjr.study.annotation.service;

import org.springframework.stereotype.Service;

@Service("annotationService")
public class AnnotationServiceImpl implements AnnotationService{
    @Override
    public String getName() {
        return "ServiceAnnotation";
    }
}
