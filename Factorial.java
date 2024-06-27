public class Factorial {

    public static int factorial(int n){
        if (n == 0){//when n=0 condition become true 
        return 1;//as return value is 1 it multiply by 1 not 0 and exit the function
        }
        return n*factorial(n-1);//return i used to exit the function
    }
    public static void main(String[] args) {
    System.out.println(factorial(10));
}

}
