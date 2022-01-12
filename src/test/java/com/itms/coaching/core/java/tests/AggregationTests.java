package com.itms.coaching.core.java.tests;

import aggregation.Address;
import inheriance.Student;
import inheriance.Cat;
import inheriance.FrontEndProgrammer;
import inheriance.Programmer;
import inheriance.Tester;

import org.testng.annotations.Test;

public class AggregationTests {

    @Test
    public void aggregationTests(){
        System.out.println("This is a new TestNG test");
        Address address = new Address("41", "HCM", "HCM", "VN");
        Student student = new Student("1", "ITMS", 10, address);
        System.out.println(student.toString());
        System.out.println(address.toString());
    }
    @Test
    public void aggregationTests2(){
        System.out.println("This is a another TestNG test");
    }

    @Test
    public void aggregationTests3()
    {
        System.out.println("This is a cat");
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
        cat.eat("Tiger");
    }
    @Test
    public void aggregationTest4(){
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer();
        frontEndProgrammer.display();
        System.out.println("Bonus: " + frontEndProgrammer.bonus);
        System.out.println("Tech: " + frontEndProgrammer.tech);
    }
    @Test
    public void aggregationTest5(){
        Programmer programmer = new Programmer();
        programmer.display();
        System.out.println("Bonus: " + programmer.bonus);
        System.out.println("Salary: " + programmer.salary);
    }

    @Test
    public void aggregationTest6(){
        Tester tester = new Tester();
        tester.display();
        System.out.println(tester.bug);
    }
}
