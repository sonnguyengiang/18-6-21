package person;


public class CongNhan extends  CanBo{
    private String rank;
    private String career;

    public CongNhan(){}

    public CongNhan( String career, String rank) {
        this.rank = rank;
        this.career = career;
    }

    public CongNhan(String name, String yearborn, String gender, String address, String rank, String career) {
        super(name, yearborn, gender, address);
        this.rank = rank;
        this.career = career;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString() +
                "rank='" + rank + '\'' +
                ", career='" + career + '\'' +
                '}';
    }
}
