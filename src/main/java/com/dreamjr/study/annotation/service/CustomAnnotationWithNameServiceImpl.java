package com.dreamjr.study.annotation.service;

import com.dreamjr.study.annotation.annotation.CustomServiceAnnotationWithName;

@CustomServiceAnnotationWithName(withName = "customAnnotationWithNameService")
public class CustomAnnotationWithNameServiceImpl implements CustomAnnotationWithNameService {
    @Override
    public String getName() {
        return "Custom-Annotation-With-Name";
    }
}
