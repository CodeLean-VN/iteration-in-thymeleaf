package com.codelean.service;

import com.codelean.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{

    private static List<Student> students;

   static {
        students = new ArrayList<>();
        students.add(new Student("1", "kathy", "kathy@codelean.vn"));
        students.add(new Student("2", "john", "john@codelean.vn"));
        students.add(new Student("3", "james", "james@codelean.vn"));
        students.add(new Student("4", "bin", "bin@codelean.vn"));
        students.add(new Student("5", "bop", "bop@codelean.vn"));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
}
