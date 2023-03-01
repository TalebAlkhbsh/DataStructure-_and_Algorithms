public class Home4_1Test {public static void main(String[] args) {
    Home4_1<Integer>l=new Home4_1();
    System.out.println(l.isEmpty());
    System.out.println(l.size());
    l.addFirst(11);
    l.addLast(12);
    l.addLast(13);
    l.addFirst(10);
    while (!l.isEmpty()){
        System.out.print(l.removeFirst()+"\t");
    }
    System.out.println(l.size());
}
}
