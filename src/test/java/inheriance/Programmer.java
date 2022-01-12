package inheriance;

public class Programmer extends  Employee {
//    int bonus = 10000;
    public int bonus = 10000;

    public  static void main(String[] args){
        Programmer programmer = new Programmer();
        programmer.display();
        System.out.println("Bonus: " + programmer.bonus);
        System.out.println("Salary: " + programmer.salary);
    }
}
