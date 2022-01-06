package com.itms.coaching.core.java.examples;
class StudentH{
    public int getId() {
        return id = 774;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getName() {
        return name = "Anna";
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String nameSchool = "Max";
    public  static int nameId = 334;

    void displayInformation(){
        System.out.println(id +" "+ name);
    }
    public static String getNameSchool(){
        return nameSchool;
    }
    public static int getNameId(){
        return nameId;
    }

    int rollno;
    public int getRoll() {
        return rollno;
    }

    int roll;
    public void setRoll(int roll) {
        this.roll = roll;
    }
}

//public class ClassSample {
//    public static void main (String arg[]){
//        StudentG s1 = new StudentG();
//        // s1.insertRecord(778,"anna");
//        String name = s1.getName();
//        int id = s1.getId();
//        System.out.println(name);
//        System.out.println(id)
//        ;
//        //s1.disPlayInformation();
//        System.out.println("");
//        System.out.println(StudentG.getNameId());
//        System.out.println(StudentG.getNameSchool());
//    }
//}
public class ClassSample {
    public static void main(String arg[]) {
        StudentH s1 = new StudentH();
        StudentH s2 = new StudentH();
        StudentH student3 = new StudentH();
        s1.insertRecord(111, "Rayan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
        student3.displayInformation();
        student3.insertRecord(113, "coaching");
        student3.displayInformation();

        StudentH student4 = new StudentH();
        student4.id = 456;
        student4.name = "itms";
        student4.displayInformation();

//        StudentH student5 = new StudentH(789, "testing");
//        student5.displayInformation();
    }
}