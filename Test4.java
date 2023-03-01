package Homework1;
public class Test4 {
    public static void main(String[] args) {
        Home4.Complex c1 = new Home4.Complex(20,25);
        Home4.Complex c2 = new Home4.Complex(20,25);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}