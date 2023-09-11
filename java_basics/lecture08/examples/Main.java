package lecture08.examples;

public class Main {
    public static void main(String[] args) {
//        ClassExample myObject = new ClassExample();
//        System.out.println(myObject.attr2);

        System.out.println(ClassExample.attr);
        ClassExample.printHello();

        ClassExample myObject2 = new ClassExample();
        myObject2.printHelloOfObject();
    }
}
