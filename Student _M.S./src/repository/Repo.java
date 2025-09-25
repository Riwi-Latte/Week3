package repository;

import java.util.ArrayList;

import models.Student;

public interface Repo<Param> {
    void save(Param p);
    Param findById(String id);
    void delete(String id);
    ArrayList<Student> findAll();
    void update(Param p);
}


