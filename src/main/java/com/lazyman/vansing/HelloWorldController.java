package com.lazyman.vansing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: APPLE
 * Date: 10/30/14
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }
}
