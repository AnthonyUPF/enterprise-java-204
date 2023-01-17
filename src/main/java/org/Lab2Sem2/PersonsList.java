package org.Lab2Sem2;


import java.util.List;

public class PersonsList {

    private static List<Person> persons;


    public PersonsList(List<Person> persons) {
        this.persons=persons;
    }

    public static Person findByName(String name){
        String[] arrayName=(name.trim()).split(" ");

        if(arrayName.length!=2){
            throw new IllegalArgumentException("The name parameter must be made up of first name and last name");
        }
        for (Person person: persons){
            if(name.equals(person.getName())){
                return  person;
            }
        }
        throw new IllegalArgumentException("The name does not exist in the persons list");
    }



}
