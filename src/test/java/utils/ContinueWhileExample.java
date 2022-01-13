package utils;

public class ContinueWhileExample {
    public static void main(String[] args){
        int i=1;
        while(i<=10){
            if(i==5){
                i++;
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            i++;
        }

    }
}
