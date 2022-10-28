


public class Example extends Person {


    public Example(){
        System.out.println("print example");

    }
    public int run(int a, int b){
        int c=1000;
        System.out.println("run print");
        return c;
    }
    public static void main(String[] args){
        Person obj= new Person();
        obj.tester();
        obj.run(10,15);
        obj.age = 25;


    }




}







