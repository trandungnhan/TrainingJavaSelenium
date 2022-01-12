package inheriance;

public class Cat extends Animal{
//    void meow(){
//        System.out.println("meowing...");
//    }
    public void meow(){
        System.out.println("meowing...");
    }
//    @Override
//    void eat(){
//        System.out.println("eating fish");
//    }

    public void eat(){
        System.out.println("eating fish");
    }

//    @Override
//    void eat(String catMeal) {
//        System.out.println(catMeal + " eating cat meal...");
//    }
    public void eat(String catMeal) {
    System.out.println(catMeal + " eating cat meal...");
    }

    public static void main(String[] args){
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
        cat.eat("Banana");
    }
}
