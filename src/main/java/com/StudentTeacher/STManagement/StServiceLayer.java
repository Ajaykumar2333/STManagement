package com.StudentTeacher.STManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StServiceLayer {

    @Autowired
    StRepositoryLayer stRepositoryLayer;

    public  String  addStudent(Student student){
        return stRepositoryLayer.addStudent(student);
    }
    public  String  addTeacher(Teacher teacher){
        return stRepositoryLayer.addTeacher(teacher);
    }

    public Student getStudent(int id){
        return stRepositoryLayer.getStudentById(id);
    }

    public Teacher getTecaherByid(int id){
        return  stRepositoryLayer.getTeacher(id);
    }

    public  String  RemoveStudent(int id){
        return stRepositoryLayer.deleteStudent(id);
    }

}
