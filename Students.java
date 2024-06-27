public class Students {
    String name;
    int age;
    int rollno;

    void study(){
        System.out.println("student is studying");
    }
    void exam(){
        System.out.println("student is giving exam");
    }
    
     //CONSTRUCTOR 
    Students(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    

    public static void main(String[] args) {
        Students s1 = new Students("Any", 21, 120);
        System.out.println(s1.name + " " + s1.age + " " + s1.rollno + " ");
        s1.study();
        s1.exam();
    }

    
}
