package com.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //handles request at path /hello instead of root 8080
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
//    // responds to get requests at /hello?coder=Launchcoder
    @GetMapping("hello")
    @ResponseBody
    public String helloRequest(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }

    @GetMapping("hello/{name}")
    @ResponseBody
        public String helloAgain(@PathVariable String name){
            return "Hello, " + name + "!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }


}
