package com.toyproject.americano.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="TestClient", url="http://localhost:8080/user")
public interface TestClient {
    @GetMapping("/")
    String getTest();
}
