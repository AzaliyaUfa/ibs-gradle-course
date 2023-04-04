package com.course.submodule1.controllers;

import com.example.submodule2.Print;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class ExampleController {

    Print printName = new Print();

    @GetMapping
    public String example(){
        return "Hello " + printName.printName();
    }
}
