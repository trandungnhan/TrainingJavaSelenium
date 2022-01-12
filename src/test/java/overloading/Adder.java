package overloading;

import org.checkerframework.checker.units.qual.A;

public class Adder {
    static  int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static String add(String a, int b){
        return a+b;
    }
//this method is not a correct overloaing method
//    static String add(int c, int d){
//        return String.valueOf(c+d);
//    }
    public static void main(String[] args){
        System.out.println(Adder.add(2,3));
        System.out.println(Adder.add("2",3));
        System.out.println(Adder.add(2,3,4));
    }
}
