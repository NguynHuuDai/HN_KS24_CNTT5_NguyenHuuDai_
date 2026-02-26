import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bt2 {

    public static List<String> locVaSapXepThuoc(List<String> danhSachNhap) {

        ArrayList<String> danhSachKhongTrung = new ArrayList<>();

        for (String thuoc : danhSachNhap) {
            if (!danhSachKhongTrung.contains(thuoc)) {
                danhSachKhongTrung.add(thuoc);
            }
        }

        Collections.sort(danhSachKhongTrung);

        return danhSachKhongTrung;
    }

    public static void main(String[] args) {

        List<String> danhSachNhap = new ArrayList<>();
        danhSachNhap.add("Paracetamol");
        danhSachNhap.add("Ibuprofen");
        danhSachNhap.add("Panadol");
        danhSachNhap.add("Paracetamol");
        danhSachNhap.add("Aspirin");
        danhSachNhap.add("Ibuprofen");

        System.out.println("Input: " + danhSachNhap);

        List<String> ketQua = locVaSapXepThuoc(danhSachNhap);

        System.out.println("Output: " + ketQua);
    }
}