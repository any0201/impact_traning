public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Add(4.4,5.8));
    }
    public static int Add(int a,int b,int c) {
        return a+b+c;
    }
    public static int Add(int a,int b) {
        return a+b;
    }
    public static double Add(double a,double b) {
        return a+b;
    }
}
