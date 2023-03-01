import java.util.Arrays;

public class Home2copy2array {
    public static void main(String[] args) {
        int [] firstArray= {4,1,5,3};
        int [] secondArray= {5,2,4,6,5,7};
        int  thr= firstArray.length;
        int  fo= secondArray.length;
        int[] three=new int[thr+fo];
        System.arraycopy(firstArray,0,three,0,thr);
        System.arraycopy(secondArray,0,three,thr,fo);
        System.out.println(Arrays.toString(three));


    }
}
