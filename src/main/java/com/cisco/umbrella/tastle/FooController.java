package com.cisco.umbrella.tastle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @RequestMapping("/foo")
    public FooResponse greeting() {
        return new FooResponse();
    }
}
