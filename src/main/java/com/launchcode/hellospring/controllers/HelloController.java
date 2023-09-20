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
//                "<label for=\"language-select\">Choose a language:</label>\n" +
//                "\n" +
                "<select name=\"languages\" id=\"language-select\">\n" +
                "  <option value=\"\">--Please choose an " +
                "language--</option>\n" +
                "  <option value=\"en\">English</option>\n" +
                "  <option value=\"French\">French</option>\n" +
                "  <option value=\"Spanish\">Spanish</option>\n" +
                "  <option value=\"German\">German</option>\n" +
                "  <option value=\"Japanese\">Japanese</option>\n" +
                "  <option value=\"Hindi\">Hindi</option>\n" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    public static String getMessage(String lang) {

        if (lang.equals("en")) {
            return " ";//+ name  + "!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("sp")) {
            return "¡Hola, le monde!";
        } else if (lang.equals("ge")) {
            return "Hallo, le monde!";
        } else if (lang.equals("ja")) {
            return "Kon'nichiwa, le monde!";
        } else if (lang.equals("hi")) {
            return "Namaste, le monde!";
        }
        return "Please select a language.";
    }

}
