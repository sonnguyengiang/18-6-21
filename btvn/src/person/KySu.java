package person;

import test.Job;

public class KySu extends CanBo{
    private String career;
    public KySu() {}
    public KySu(String name, String yearborn, String gender, String address, String career) {
        super(name, yearborn, gender, address);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                "career='" + career + '\'' +
                '}';
    }
}
