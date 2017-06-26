package com.cisco.umbrella.tastle;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/foo")
    public FooResponse greeting() {
        return new FooResponse();
    }
}
