package person;

import java.util.Comparator;

public class CanBo implements Comparator<CanBo> {
    private String name;
    private String yearborn;
    private String gender;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, String yearborn, String gender, String address) {
        this.name = name;
        this.yearborn = yearborn;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearborn() {
        return yearborn;
    }

    public void setYearborn(String yearborn) {
        this.yearborn = yearborn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "fullname='" + name + '\'' +
                ", yearborn='" + yearborn + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'';
    }

    @Override
    public int compare(CanBo o1, CanBo o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
