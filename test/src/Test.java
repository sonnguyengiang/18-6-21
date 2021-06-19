import java.util.ArrayList;

public class Test extends Abstractclass {
    public static void main(String[] args) {
        Animal<String, String> one = new Animal<>("one", "1");
        Animal<String, String> dog = new Animal<>("dog", "cho");
        Animal<String, String> cat = new Animal<>("cat", "meo");

        Animal<String, Integer> xiaomi = new Animal<>("xiaomi note 9", 12);
        Person male = new Person("minh");
        Person femal = new Person("trang");
        Animal<Person, Person> ship = new Animal<>(male, femal);
        System.out.println(one.getKey() + " - " + one.getValue());
        System.out.print(dog.getKey() + " = " + dog.getValue());
    }


    @Override
    void abc() {

    }
}
