package person;

import java.util.*;


public class QLCB extends CanBo {
    static Scanner input = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<CanBo> arrayList = new ArrayList<>();

    public static void addNhanVien() {
        System.out.println("adding new NhanVien");
        System.out.print("enter a name: ");
        String name = input.nextLine();
        System.out.print("Enter year of born: ");
        String yearborn = input.nextLine();
        System.out.print("enter gender: ");
        String gender = input.nextLine();
        System.out.print("enter address: ");
        String address = input.nextLine();
        arrayList.add(new NhanVien(name, yearborn, gender, address));
    }

    public static void addCongnhan() {
        System.out.println("adding new cong nhan");
        System.out.print("enter a name: ");
        String name = input.nextLine();
        System.out.print("Enter year of born: ");
        String yearborn = input.nextLine();
        System.out.print("enter gender: ");
        String gender = input.nextLine();
        System.out.print("enter address: ");
        String address = input.nextLine();
        System.out.print("enter rank: ");
        String career = input.nextLine();
        System.out.print("enter career: ");
        String rank = input.nextLine();
        arrayList.add(new CongNhan(name, yearborn, gender, address, career, rank));
    }

    public static void addKySu() {
        System.out.println("adding new ky su");
        System.out.print("enter a name: ");
        String name = input.nextLine();
        System.out.print("Enter year of born: ");
        String yearborn = input.nextLine();
        System.out.print("enter gender: ");
        String gender = input.nextLine();
        System.out.print("enter address: ");
        String address = input.nextLine();
        System.out.print("enter career: ");
        String career = input.nextLine();
        arrayList.add(new KySu(name, yearborn, gender, address, career));
    }

    public static void addPerson() {
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("Adding new");
            System.out.println("1.adding new Nhan vien");
            System.out.println("2.adding new cong nhan");
            System.out.println("3.adding new ky su");
            System.out.println("4.back");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    addNhanVien();
                    break;
                case 2:
                    addCongnhan();
                    break;
                case 3:
                    addKySu();
                    break;
                case 4:
                    checklist = -1;
                    break;
            }
        }
    }

    public void search() {
        System.out.print("enter name that you want search: ");
        String searchname = scanner.nextLine();
        int number = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(searchname)) {
                number = i;
                break;
            }
        }
        if (number >= 0) {
            System.out.println(arrayList.get(number));
        } else {
            System.out.println("not found " + searchname);
        }
    }

    public static void remove() {
        System.out.print("enter name that you want remove: ");
        String removename = scanner.nextLine();
        int number = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(removename)) {
                number = i;
                break;
            }
        }
        if (number >= 0) {
            arrayList.remove(number);
        } else {
            System.out.println("not found " + removename);
        }
    }

    public static void eidtName() {
        System.out.print("enter name that you want change: ");
        String changname = scanner.nextLine();
        int number = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(changname)) {
                number = i;
                break;
            }
        }
        if (number >= 0) {
            System.out.println("enter new information");
            System.out.print("enter a name: ");
            String name = scanner.nextLine();
            System.out.print("Enter year of born: ");
            String yearborn = scanner.nextLine();
            System.out.print("enter gender: ");
            String gender = scanner.nextLine();
            System.out.print("enter address: ");
            String address = scanner.nextLine();
            NhanVien nhanVien = new NhanVien(name, yearborn, gender, address);
            arrayList.set(number, nhanVien);
        } else {
            System.out.println("not found " + changname);
        }
    }

    public static void showNameByCareer() {
        System.out.print("enter career that you want find name: ");
        ArrayList<CanBo> canBos = new ArrayList<>();
        String findname = scanner.nextLine();
        for (CanBo element : arrayList) {
            if (((CongNhan) element).getCareer().equals(findname)) {
                canBos.add(element);
                if (((KySu) element).getCareer().equals(findname)) {
                    canBos.add(element);
                }
            }
            for (CanBo c : canBos) {
                System.out.println(c);
            }
        }

        public static void sort () {
            CanBo canBo = new CanBo();
            arrayList.sort(canBo);
        }

        public static void show () {
            for (CanBo c : arrayList) {
                System.out.println(c);
            }
        }
    }
