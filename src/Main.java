import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OurGenericList<Integer> list=new OurGenericList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        for(int x:list)
        {
            System.out.println(x);
        }

    }
}