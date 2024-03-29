package com.dreamjr.study.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class BService {

    public void bFeatureMethod(String param) {
        System.out.println(param);

    }
}
