package utils;

public class ContinueDoWhileExample {
    public static void main(String[] args){
        int i=1;
        do{
            if(i==5){
                i++;
                continue;// it will skip the rest statement
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
