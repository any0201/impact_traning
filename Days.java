import java.util.Scanner;

public class Days {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int day = obj.nextInt();
        String dayname;
    
        if(day == 1){
            dayname = "MONDAY";
            System.out.println(dayname);
        }
        else  if(day == 2){
            dayname = "Tuesday";
            System.out.println(dayname);

        }
        else if(day==3){
            dayname = "WEDNESDAY";
            System.out.println(dayname);

        }
        else if(day==4){
            dayname = "THURSDAY";
            System.out.println(dayname);

        }
        else if(day==4){
            dayname = "FRIDAY";
            System.out.println(dayname);

        }
        else if(day==6){
            dayname = "SATURDAY";
            System.out.println(dayname);

        }
        else if(day==7){
            dayname = "SUNDAY";
            System.out.println(dayname);

        }
        else{
            System.out.println("Invalid input");
        }
    }

}
