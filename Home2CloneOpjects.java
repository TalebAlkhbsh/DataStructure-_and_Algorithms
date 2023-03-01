public class Home2CloneOpjects {
    private static int Student;

    public static class Student {
        String name;
        int  id;
    }


    public   static void main(String[] args) {
        Student[] arr = new Student[15];
        for (int i=0; i< arr.length;i++){
            arr[i] = new Student();
        }
        arr[0].name="Taleb";
        arr[0].id=1478;

        arr[1].name="Mater";

        System.out.println(arr[0].name);
        System.out.println(arr[0].id);
    }
}
