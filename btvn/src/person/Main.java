package person;

import person.CanBo;
import person.CongNhan;
import person.QLCB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Manager person");
            System.out.println("1.add list person");
            System.out.println("2.search");
            System.out.println("3.remove by name");
            System.out.println("4.edit by name");
            System.out.println("5.show");
            System.out.println("6.sort");
            System.out.println("7.show names by industry");
            System.out.println("8.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    QLCB.addPerson();
                    break;
                case 2:
                    qlcb.search();
                    break;
                case 3:
                    QLCB.remove();
                    break;
                case 4:
                    QLCB.eidtName();
                    break;
                case 5:
                    QLCB.show();
                    break;
                case 6:
                    QLCB.sort();
                    break;
                case 7:
                    QLCB.showNameByCareer();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}

