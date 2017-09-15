package com.example.traviscidemo;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yuzhou on 2017/9/15.
 */
@RestController
public class DemoController {

    public String get() {
        return "travis";
    }
}
