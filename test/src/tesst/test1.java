package tesst;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class test1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("anh");
        list.add("minh");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
    }
}
