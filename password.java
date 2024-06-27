import java.util.Scanner;

public record password() {
    public static void main(String[] args) {
        String pass = "abc@123";
        Scanner obj = new Scanner(System.in);
        
        int c = 3;
        while (c > 0) {
            System.out.println("Enter password: ");
            String pswd = obj.nextLine();
            if(pswd.equals(pass)){
                System.out.println("Welcome to Chintu Ice Creams\nselect\n1.Ice Creames\n2.Puff\n3.Cool Drinks\n4.buns");
                int op = obj.nextInt();
                if(op==1){
                    System.out.println("select\n1.Chocolate -- 30/-\n2.Strawberry -- 40/-\n3.Mango -- 35/-\n4.ButterScotch -- 60");
                    break;
                }
            }
            else{
                System.out.println("Incorrect Password\nplease try again later...");
                c -= 1;
            }
    }
    obj.close();
    if(c==0){
        System.out.println("CARD BLOCK FOR 24HRS.....");
    }
}
}