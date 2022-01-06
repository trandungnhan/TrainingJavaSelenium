public class JavaScopes {

    static String group = "0";
    public static void main(String[] arg) {
        // Demo variable scope in Java
//        System.out.println(group);
//        int studentAge = 10;
//        String group = "Good";
//        boolean studentAge;
//        if (studentAge >= 10) {
//            group = "1";
//        }

        // System.out.println(group);
        // for vong lap xac dinh
        //for (int i = 5; i <=10; i++) //i++ = i+1
//        for (int i = 0; i <=10; i = i + 2) //i++ = i+1
//        {
//            System.out.println(i);
//        }
//        System.out.println(group);
//        int age = 13; // infinite loop
//        while (age <= 19){
//            System.out.println("Teenager");
//        }
        // while vong lap khong xac dinh
        int age = 20; // infinite loop
        while (age <= 19) {
            System.out.println("Teenager " + age);
            age++; // age=age+1
        }
        System.out.println("----------------");
        age = 20;
        do{
            System.out.println("Teenager " + age);
            age = age+ 1;
        } while (age <= 19);
    }
}