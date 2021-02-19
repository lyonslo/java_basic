package java8cuorse.lesson2;

import java8cuorse.lesson3.Name;


public class Person {

    private Name personName;
    private static int personCounter;

    public Person(Name personNam){
        personName=personNam;

    }
    public Person(){

        personCounter++;
        /*
        empty on purpose - default constructor
         */
    }

    public String helloWorld(){
        return "HelloWorld";
    }
    public Name name(){
        return personName;
    }


    public String hello(String name) {
        return "Hello "+name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
