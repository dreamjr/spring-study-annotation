package com.dreamjr.study.annotation.service;

import com.dreamjr.study.annotation.annotation.CustomServiceAnnotation;

@CustomServiceAnnotation("customAnnotationService")
public class CustomAnnotationServiceImpl implements CustomAnnotationService {

    @Override
    public String getName() {
        return "Custom-ServiceAnnotation";
    }
}
