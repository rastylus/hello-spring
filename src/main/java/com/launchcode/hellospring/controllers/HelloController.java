package com.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    //handle request at path http://localhost:8080/hello

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    //handle request at path //http://localhost:8080/goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    //handle requests of the form http://localhost:8080/hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //handle requests of the form http://localhost:8080/hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}







//package com.launchcode.hellospring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class HelloController {
//
//    //handles request at path /hello instead of root 8080
////    @GetMapping("hello")
////    @ResponseBody
////    public String hello() {
////        return "Hello, Spring!";
////    }
////    // responds to get requests at /hello?coder=Launchcoder
//    @GetMapping("hello")
//    @ResponseBody
//    public String helloRequest(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }
//
//    @GetMapping("hello/{name}")
//    @ResponseBody
//        public String helloAgain(@PathVariable String name){
//            return "Hello, " + name + "!";
//    }
//
//    @GetMapping("goodbye")
//    @ResponseBody
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//
//}
