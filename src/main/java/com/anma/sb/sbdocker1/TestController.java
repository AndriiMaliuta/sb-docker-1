package com.anma.sb.sbdocker1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testPage() {
        return "{\"name\": \"Vasyl\"}";
    }
}
