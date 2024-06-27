public class Encapsulation {


    public static void main(String[] args) {
        
        BankAcc b1 = new BankAcc();
        b1.Accno=122322;
        b1.name="anyy";

        System.out.println("the name of acc holder is " + b1.name + " having acc no = " + b1.Accno);
    }
    
}
//encapsulation
class BankAcc{
    int Accno;
    String name;

}