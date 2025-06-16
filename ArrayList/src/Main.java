import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements
        list.add(9);
        list.add(2);
        list.add(5);
        System.out.println(list);

        //get elements
        System.out.println(list.get(0));

        //add elements in between
        list.add(1,6);
        System.out.println(list);

        //set elements
        list.set(2,7);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //sort
        Collections.sort(list);
        System.out.println(list);
    }
}