package com.dreamjr.study.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class AService {

    public String AFeature(String response) {
        return "AFeature" + response;
    }
}
