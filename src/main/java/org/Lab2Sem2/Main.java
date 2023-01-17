package org.Lab2Sem2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("id","Fernando Pozo",29,"student");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person);
        Person person1=(new PersonsList(persons)).findByName("Fernando Pozo");

        System.out.println(person1.getName());
    }
}