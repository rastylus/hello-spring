package com.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class HelloController {
    //handle request at path http://localhost:8080/hello

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    //handle request at path //http://localhost:8080/hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }

    //handle requests of the form http://localhost:8080/hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }

    //handle requests of the form http://localhost:8080/hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }

    //handles requests for http://localhost:8080/hello/form
//    @RequestMapping(name="form", method = RequestMethod.GET)
//    @RequestMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
//                "<input type = 'text' name = 'name' >" +
//                    "<select language = 'language' language=\"languages\" " +
//                    "id=\"language-select\">\n" +
//                    "<option value=\"\">--Please choose an " +
//                    "language--</option>\n" +
//                        "  <option>English</option>\n" +
//                        "  <option>French</option>\n" +
//                        "  <option>Spanish</option>\n" +
//                        "  <option>German</option>\n" +
//                        "  <option>Japanese</option>\n" +
//                        "  <option>Hindi</option>\n" +
//                     "</select>" +
//                "<input type = 'submit' value = 'Greet Me!' >" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//
//    }

//    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String hello(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }
    @GetMapping()
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post'>" +
                        "<input type = 'text' name = 'name' />" +
                        "<select name='lang' id=\"language-select\">\n" +
                "  <option value=\"\">--Please choose a " +
                "language--</option>\n" +
                "  <option value='en'>English</option>\n" +
                "  <option value='fr'>French</option>\n" +
                "  <option value='sp'>Spanish</option>\n" +
                "  <option value='ge'>German</option>\n" +
                "  <option value='hi'>Hindi</option>\n" +
                "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

//    @RequestMapping(value="hello", method = RequestMethod.POST)
    @PostMapping()
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String lang) {
        if (name == null || name.equals("")) {
            name = "World";
        }

        return createMessage(name, lang);

        // For a bonus mission, students can change this response text to look nicer.
        // This is subjective, but students should be modifying the HTML of the response string.
    }
//
    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("en")) {
            greeting = "Hello";
        }
        else if (l.equals("fr")) {
            greeting = "Bonjour";
        }
        else if (l.equals("sp")) {
            greeting = "Hola";
        }
        else if (l.equals("ge")) {
            greeting = "Hallo";
        }
        else if (l.equals("hi")) {
            greeting = "Namaste";
        }

        return greeting + ",  " + n + "!";
    }


}







//package com.launchcode.hellospring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@ResponseBody
//@RequestMapping("hello")
//public class HelloController {
//
//    //handles request at path /hello instead of root 8080
////    @GetMapping("hello")
////    public String hello() {
////        return "Hello, Spring!";
////    }
//
//
////    // responds to get requests at /hello?coder=Launchcoder
////    @GetMapping("hello")
////    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
////    public String helloWithQueryParam(@RequestParam String name) {
////        return "Hello, " + name + "!";
////    }
//
////    @GetMapping("{name}")
////        public String helloAgain(@PathVariable String name){
////            return "Hello, " + name + "!";
////    }
////
////    @GetMapping("goodbye") //now lives at hello/goodbye after putting Request
////    // mapping above controller class
////    public String goodbye() {
////        return "Goodbye, Spring!";
////    }
//
//    //    @GetMapping("form") //    /hello/form
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public static String helloForm() {
//
//        return "<html>" +
//                "<body>" +
//                "<form action= 'hello' method='post'>" +
//                "<input type='text' name='name'>" +
//                "<select name=\"languages\" id=\"language-select\">\n" +
//                "  <option value=\"\">--Please choose an " +
//                "language--</option>\n" +
//                "  <option value=\"en\">English</option>\n" +
//                "  <option value=\"fr\">French</option>\n" +
//                "  <option value=\"sp\">Spanish</option>\n" +
//                "  <option value=\"ge\">German</option>\n" +
//                "  <option value=\"ja\">Japanese</option>\n" +
//                "  <option value=\"hi\">Hindi</option>\n" +
//                "</select>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
//
//
////    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
////    public String helloWithQueryParam(@RequestParam String name) {
////        return "Hello, " + name + "!";
////    }
//
////    public static void createMessage() {
////        String lang;
////        String message = getMessage(String lang);
////        System.out.println(message);
////    }
//
//    public String helloPost(@RequestParam String name,
//                            @RequestParam String lang) {
//        if (name == null) {
//            name = "World";
//        }
//        return getMessage(name, lang);
//    }
//
//    public static String getMessage(String name, String lang) {
//
//        if (lang.equals("en")) {
//            return "Hello, " + name + "!";
//        } else if (lang.equals("fr")) {
//            return "Bonjour, " + name + "!";
//        } else if (lang.equals("sp")) {
//            return "¡Hola, " + name + "!";
//        } else if (lang.equals("ge")) {
//            return "Hallo, " + name + "!";
//        } else if (lang.equals("ja")) {
//            return "Kon'nichiwa, " + name + "!";
//        } else if (lang.equals("hi")) {
//            return "Namaste, " + name + "!";
//        }
//        return "Please select a language.";
//    }
////@RequestMapping(value="hello", method = RequestMethod.POST)
////@ResponseBody
////    public String helloPost(@RequestParam String name, @RequestParam String language) {
////    if (name == null) {
////        name = "World";
////    }
////}
//}
////
////    return createMessage(name, language);
//
//        // For a bonus mission, students can change this response text to look nicer.
//        // This is subjective, but students should be modifying the HTML of the response string.
////    }
////}
//
////    public static String createMessage(String n, String l) {
////        String greeting = "";
////
////        if (l.equals("english")) {
////            greeting = "Hello";
////        }
////        else if (l.equals("french")) {
////            greeting = "Bonjour";
////        }
////        else if (l.equals("italian")) {
////            greeting = "Bonjourno";
////        }
////        else if (l.equals("spanish")) {
////            greeting = "Hola";
////        }
////        else if (l.equals("german")) {
////            greeting = "Hallo";
////        }
////
////        return greeting + " " + n;
////    }
//
////}
