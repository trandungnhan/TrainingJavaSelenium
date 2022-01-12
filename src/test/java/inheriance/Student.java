package inheriance;

import aggregation.Address;

public class Student {
    String id;
    String name;
    int age;

    Address address;

    public Student(String name) {
        this.name = name;
    }


    public Student(String id, String name, int age, Address address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student student = new Student("Nhan");
        student.display();

        Address address = new Address("40", "HCM", "LA", "VN");
        Student student1 = new Student("101","Nhan",20,address);
        String name = student1.toString();
        System.out.println(name);
    }
}


