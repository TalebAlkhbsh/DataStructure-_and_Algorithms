import java.util.Arrays;

public class Home2Test {
    public static void main(String[] args) {

        int [] a={1,2,3};
        int [] b={1,2,4};
        if (Arrays.equals(a,b)){
            System.out.println("Equivalence");
        }else {
            System.out.println("Not Equivalence");
        }

    }
}
