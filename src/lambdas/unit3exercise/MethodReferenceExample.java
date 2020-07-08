package lambdas.unit3exercise;

public class MethodReferenceExample {
    
    public static void main(String[]args){

        // the following 2 lines are the exact same
        Thread t = new Thread(()->printMessage());
        // this is a method reference lamba expression example
        Thread tt = new Thread(MethodReferenceExample::printMessage);
        t.start();
        tt.start();
    }

    public static void printMessage(){
        System.out.println("Hello World");
    }
}