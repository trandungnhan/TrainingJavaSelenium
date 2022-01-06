public class MyFirstJavaProgram {
    public static void main(String[] arg){
        int studentAge = 10; //Age -> kieu Camel
        float studentMark = 2.5f;
        double studentBudget = 1893.5;
        boolean isActive = true;

        System.out.println(studentAge);
        System.out.println(studentMark);

        System.out.println("Welcome to IMTS Coaching");
        System.out.print("New line");
        System.out.print("In the same line");
        System.out.println("In a new line");

        String studentName = "ITMS Coaching";
        System.out.println("Welcome to IMTS Coaching" + " " + studentName);
        System.out.println("Welcome to IMTS Coaching" + " " + studentAge);
        System.out.println(String.format("Welcome to IMTS Coaching class - %s - Selenium Automation", studentAge));
        System.out.println("Welcome to IMTS Coaching class -"  + studentAge + "- Selenium Automation");

        int a =10;
        int b =20;
        int c = a+b;
        int d = a-b;

        if (isActive){
            System.out.println("Student is Active");
        }
//        if (studentMark >= 3){
//            System.out.println("Passed");
//        } else {
//            System.out.println("Failed");
//        }
        if (studentMark >= 4){
            System.out.println("Excellent");
        } else  if (studentMark >= 3){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}