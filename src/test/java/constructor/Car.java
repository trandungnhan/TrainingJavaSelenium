package constructor;

public class Car {

    static int count;

    String name;
    double price;


    public Car(){

    }
    public Car(String name){
        this.name = name;
    }

    public Car(String name, double price){
        this.name = name;
        this.price = price;
    }

    public static void getCount(){
        System.out.println("Count: " + count);
    }
    public static void setCount(int count){
        Car.count=count;
    }


    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args){
        Car defaultCar = new Car();
        defaultCar.name = "Honda";
        defaultCar.display();
        Car.setCount(5);
        Car.getCount();

        Car car = new Car("BMW");
        car.display();

        Car newCar = new Car("Civis",9999);
        newCar.display();

    }

}
