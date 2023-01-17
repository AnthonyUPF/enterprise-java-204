package org.Lab2Sem2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private int age;
    private String occupation;

    public Person(String id, String name, int age, String occupation) {
        setId(id);
        setName(name);
        setAge(age);
        setOccupation(occupation);
    }

    public void setId(String id){
        if(id==null || id.isEmpty()){
            throw new IllegalArgumentException("Id cannot be null or empty");
        }
        this.id=id;
    }


    public void setName(String name) {
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Age cannot be a number less than zero");
        }
        this.age = age;
    }

    public void setOccupation(String occupation) {
        if(occupation==null || occupation.isEmpty()){
            throw new IllegalArgumentException("Occupation cannot be null or empty");
        }
        this.occupation = occupation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public void writeInformation() {
        try {
            FileWriter writer = new FileWriter(getName()+".txt");
            writer.write(toString());
            writer.close();
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}
