package person;

public class NhanVien extends CanBo {
    public NhanVien(){}

    public NhanVien(String name, String yearborn, String gender, String address) {
        super(name, yearborn, gender, address);
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString() +
                '}';
    }
}
