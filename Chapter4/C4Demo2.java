package Chapter4;

public class C4Demo2 {

    public static void main() {

        C4Demo3 demo = new C4Demo3();

        //demo.privateDemo();   //private methods are only accessible in the same clas
        demo.defaultDemo();     //C4Demo2 and C4Demo3 are in the same package so this is accessible
        demo.protectedDemo();


    }




}
