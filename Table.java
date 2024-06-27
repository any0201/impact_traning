import java.util.Scanner;

public class Table {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();

        for (int i=1; i<=10;i++){
            System.out.println(num + "*" + i + " = " + num*i);
        }
       
    }
}
// write a program to requesting user a pass word 