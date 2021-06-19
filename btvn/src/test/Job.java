package test;

import java.util.ArrayList;

public class Job {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("New York");
        arrayList.add("Atlanta");
        arrayList.add("Dallas");
        arrayList.add("Madison");
        int a = 0;

        System.out.println(arrayList.get(1).equals("Atlanta"));
        if (arrayList.get(1).equals("Atlanta")){
            a = 2;
        }
        System.out.println(arrayList);
    }
}
