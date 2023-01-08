package com.StudentTeacher.STManagement;


import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StRepositoryLayer {

    HashMap<Integer,Student> Smap = new HashMap<>();
    HashMap<Integer,Teacher> Tmap = new HashMap<>();


    public    String  addStudent(Student student){
        int key = student.getId();

        Smap.put(key,student);

        return "Added Succesfully";
    }

    public    String  addTeacher(Teacher teacher){
        int key = teacher.getId();

        Tmap.put(key,teacher);

        return "Added Succesfully";
    }

    public  Student getStudentById(int id){
        if(Smap.containsKey(id)){
            return Smap.get(id);
        }else{
        return null;
    }}

    public Teacher getTeacher(int id){
        if(Tmap.containsKey(id)){
            return Tmap.get(id);
        }
        else{
            return null;
        }
    }
    public String deleteStudent(int id){
        if(Smap.containsKey(id)){
            Smap.remove(id);
        }else{
            return "No matches";
        }
        return "Succesfully removed";
    }




}
