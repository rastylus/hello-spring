package com.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //handles request at path /hello instead of root 8080
//    @GetMapping("hello")
//    public String hello() {
//        return "Hello, Spring!";
//    }


//    // responds to get requests at /hello?coder=Launchcoder
//    @GetMapping("hello")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("{name}")
        public String helloAgain(@PathVariable String name){
            return "Hello, " + name + "!";
    }

    @GetMapping("goodbye") //now lives at hello/goodbye after putting Request
    // mapping above controller class
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    @GetMapping("form") //    /hello/form
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action= 'hello' method='post'>" + //submits a request to
                // /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


}
