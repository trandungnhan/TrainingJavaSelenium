package inheriance;

public class Tester extends Employee {
//    int bug = 100;
    public int bug = 100;
    public static void main(String[] args){
        Tester tester = new Tester();
        tester.display();
        System.out.println(tester.bug);
    }
}
