package inheriance;

public class Animal {
    void eat(){
        System.out.println("eating...");
    }
    void eat(String meal){
        eat();
        System.out.println(meal + "...");
    }
}
