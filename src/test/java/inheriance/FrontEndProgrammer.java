package inheriance;

public class FrontEndProgrammer extends Programmer {
//    String tech = "HTML";
    public String tech = "HTML";
    public static void main(String[] args){
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer();
        frontEndProgrammer.display();
        System.out.println("Bonus: " + frontEndProgrammer.bonus);
        System.out.println("Tech: " + frontEndProgrammer.tech);
    }

}
