package com.codelean.controller;

import com.codelean.service.StudentService;
import com.codelean.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("student/")
public class StudentController {

    private StudentService studentService = new StudentServiceImpl();

    //@Autowired
    //private StudentService studentService;

    @GetMapping("display")
    public ModelAndView listStudent(){
        ModelAndView modelAndView = new ModelAndView("student/list", "students", studentService.findAll());
        return modelAndView;
    }
}
