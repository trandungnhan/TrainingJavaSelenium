package com.itms.coaching.core.java.tests;

import aggregation.Address;
import inheriance.Employee1;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionTests {

    @Test
    public void listStringTest() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Mango");
        stringList.add("Banana");
        stringList.add("Apple");

        System.out.println(stringList);
        System.out.println("-----------");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println("-----------");
        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println("-----------");
        //Iterator
        Iterator iStr = stringList.iterator();
        while (iStr.hasNext()) {
            System.out.println(iStr.next());
        }
    }
    @Test
    public void sortListTest() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mango");
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("A");

        Collections.sort(stringList);
        System.out.println(stringList);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
    @Test
    public void employeeListTest(){
        Address address = new Address("99","HCM","LA","VN");
        Address address4 = new Address("99","HCM","LA","VN");
        Employee1 emp1 = new Employee1(1, "Tester", address);
        Employee1 emp2 = new Employee1(2, "Dev", address);
        Employee1 emp3 = new Employee1(3, "Dev", address);
        Employee1 emp4 = new Employee1(1, "Tester", address4);

        List<Employee1> employee = new ArrayList<>();
        employee.add(emp1);
        employee.add(emp2);


        //Iterator
        List<Employee1> employee1 = new ArrayList<>();
        employee1.add(emp1);
        employee1.add(emp2);

        System.out.println(employee1.contains(emp1));
//        System.out.println(employee1.contains(emp3));
        System.out.println(employee1.contains(emp4));

    }
}



