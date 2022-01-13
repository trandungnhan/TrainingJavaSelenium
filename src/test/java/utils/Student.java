package utils;

public class Student {
    private static String schoolName = "ITMS";
    public static int count = 0;
    private int roll;
    private String name;

    public Student () {
        count++;
    }
    public static String getSchoolName(){
        return schoolName;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setName(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public void setName(int name){
        this.name = String.valueOf(name);
    }
    public void display(){
        System.out.println("Count: " + count);
        System.out.println("Roll no: " + roll);
        System.out.println("Student name: " + name);
    }
}
