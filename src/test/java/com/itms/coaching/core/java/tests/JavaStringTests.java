package com.itms.coaching.core.java.tests;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStringTests {
    @Test
    public void StringCharsTest(){
        char[] ch = {'j', 'a', 'v', 'a'};
        String s1 = new String(ch);
        String s2 = "java";
        String s3 = s2 + " new string";

        System.out.println(ch);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    @Test
    public void compareStringTest(){
        String s1 = "ITms";
        String s2 = "ITms";
        String s3 = new String("ITms");
        String s4 = "itms";
        String s5 = "coaching";

        System.out.println(s1.equals(s2)); // equals based on value
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equals(s5));
        System.out.println("----------");

        System.out.println(s1 == s2); //== based on reference (value and object)
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println("----------");

        System.out.println(s1.compareTo(s2)); // equals based on value
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
        System.out.println("----------");

//        Note:
//        digit: ==, !=
//        String: equals,
    }

    @Test
    public  void concatStringTest(){
        String s1 = 50.1 + "Welcome to " + "Java" + 50 + 10;
        System.out.println(s1);

        String s2 = "Welcome to ";
        String s3 = "Java";
        String s4 = s2.concat(s3);
        System.out.println(s4);
    }

    @Test
    public void stringBuilderTest(){
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("World");
        StringBuilder s3 = s1.append(s2);
        System.out.println(s3.toString());

        StringBuilder s4 = s1.append(s2).append(" ").append(50).append(" ").append("End");
        System.out.println(s4.toString());

    }

    @Test
    public void StringFormatTest(){
        String s1 = "Hello";
        String s2 = "World!";

        String s3 = String.format("%s %s: %d", s1, s2, 2022);
        String s4 = String.format("name: %s, dob: %s", "Tom", "01-01-2000");
        System.out.println(s3);
        System.out.println(s4);
    }

    @Test
    public void stringJoinTest(){
        String s1 = "Hello";
        String s2 = "World!";
        System.out.println(String.join("|", s1,s2, "Java"));

        StringJoiner s = new StringJoiner(";");
        s.add(s1);
        s.add(s2);
        s.add("Java");
        System.out.println(s.toString());
    }

    @Test
    public void listStringTest(){
        List<String> stringList = Arrays.asList("Hello", "World", "Java");
        String s = stringList.stream().collect(Collectors.joining("|"));
        System.out.println(s);
    }

    @Test
    public void subStringTest(){
        String s = "Hello World!";
        System.out.println(s.substring(6));
        System.out.println(s.substring(6, 12));

        int idx = s.indexOf("World!");
        System.out.println(idx);
        System.out.println(s.substring(idx,idx + "World!".length()));
        System.out.println("World!".length());
    }

    @Test
    public void splitStringTest(){
        String s = "Hello Java World!";
        String[] w = s.split(" ");
        System.out.println(Arrays.toString(w));
    }

    @Test
    public void verifyStringTest(){
        String s = "   ITMS Coaching Java   ";
        System.out.println(s.contains("Java"));
        System.out.println(s.startsWith("I"));
        System.out.println(s.endsWith("Java"));
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.trim().toUpperCase());
        System.out.println(s.trim().toLowerCase());


    }



}
