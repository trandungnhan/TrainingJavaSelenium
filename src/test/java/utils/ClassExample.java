package utils;

class ClassExample {
    public static void main(String args[]){
        Student st1 = new Student();
        st1.setRoll(1);
        st1.setName("Tester");
        st1.display();

        Student st2 = new Student();
        st2.setName("dev");
        st2.getName();
        st2.display();
        System.out.println(Student.getSchoolName());


    }
}
