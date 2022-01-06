public class MyFunctions {
    public static void plus(int x, int y){
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);

        int z = x + y;
        System.out.println("Total:"+ z);
    }

    public static void main(String[] arg){
        int a = 10;
        int b = 20;

        int c = a+b;
        System.out.println(c);
        plus(a,b);

        int d = 15;
        System.out.println(a+d);
        plus(a,d);

        int e =100;
        System.out.println(c+e);
        plus(c,e);
    }
}
