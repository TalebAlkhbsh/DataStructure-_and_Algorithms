public class Home2arraycloning {
    public static void main(String[] args) {
        int a[] = {5, 4, 1};
        int b[] = a.clone();
        b[0]++;
        System.out.println("Contents of a[]");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nContents of b[]");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");


    }

}
