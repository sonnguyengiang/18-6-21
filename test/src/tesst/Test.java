package tesst;

import java.util.ArrayList;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(3);
        ArrayList<Integer> arrayList1 = new ArrayList<>(2);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);

    }
}
