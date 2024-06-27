public class Encapsulation {

    public static void main(String[] args) {

        BankAcc b1 = new BankAcc();
        // b1.Accno=122322;
        b1.setname("anyy");
        b1.setAcc(1254932);
        System.out.println(b1.getname());
        System.out.println(b1.getAcc());

        // System.out.println("the name of acc holder is " + b1.name + " having acc no =
        // " + b1.Accno);
    }

}

// encapsulation
class BankAcc {
    // int Accno;
    private String name;
    private int Accno; // encapsulating

    // setter - setting the value in the form of integer
    void setAcc(int n) { //taking the input, using void because it has no return type. and declaring the value of vaariable
        this.Accno = n; //fake variable
    }

    // getter - getting the vale of that variable
    int getAcc() {
        return this.Accno;

    }
    void setname(String n){
        this.name=n;
    }
    String getname(){
        return this.name;
    }
}