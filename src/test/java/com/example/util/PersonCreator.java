package com.example.util;

import com.example.domain.Person;

public class PersonCreator {

    public static Person createPersonToBeSaved(){
        return new Person("Yasha");
    }

    public static Person createValidPerson(){
        return new Person(1L, "Yasha");
    }


    public static Person createValidUpdatePerson(){
        return new Person(1L,"Yasha");
    }

}
