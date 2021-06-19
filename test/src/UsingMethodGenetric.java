import java.lang.reflect.Method;

public class UsingMethodGenetric {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{14, 12, 19, 41, 35, 16, 57, 18, 29};
        Double[] arr2 = new Double[]{1.0, 32.2, 43.45, 2.0, 1.23, 5.3, 6.1};
        String[] strings = new String[]{"one", "two", "three", "five"};
        Person[] people = new Person[]{new Person("hing"), new Person("arung"), new Person("minh")};

        //show danh sach cac phan tu int
        Genetric.sort(people);
        Genetric.showArray(people);
    }
}
