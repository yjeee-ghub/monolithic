package com.example.ordersystem.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public String healthCheck() {
        //return "ok6";
        return "okokokokokokok"; //변경사항 확인을 위해서 return값 변경
    }
}
