package com.StudentTeacher.STManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;

@RestController

public class StControllerLayer {

    @Autowired
    StServiceLayer stServiceLayer;


    @PutMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        String result = stServiceLayer.addStudent(student);
       return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PutMapping("/addTeacher")
    public ResponseEntity<String> addStudent(@RequestBody Teacher teacher){
        String result = stServiceLayer.addTeacher(teacher);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/get-Student-By-Id")
    public ResponseEntity<Student> getStudent(@RequestParam("id")int id){
        Student response = stServiceLayer.getStudent(id);

        return  new ResponseEntity<>(response,HttpStatus.OK);
    }
    @GetMapping("/get-teacher-By-Id")
    public ResponseEntity<Teacher> getTeacher(@RequestParam("id") int id){
        Teacher response = stServiceLayer.getTecaherByid(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @DeleteMapping("/delete-student-by-id")
    public ResponseEntity<String > removeStudent(@RequestParam("id") int id){
        String response = stServiceLayer.RemoveStudent(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @










}
