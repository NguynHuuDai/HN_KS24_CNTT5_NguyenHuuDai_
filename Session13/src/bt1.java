import java.util.ArrayList;
import java.util.Iterator;

public class bt1 {
    public static void main(String[] args) {

        ArrayList<Double> danhSachNhietDo = new ArrayList<>();
        danhSachNhietDo.add(36.5);
        danhSachNhietDo.add(40.2);
        danhSachNhietDo.add(37.0);
        danhSachNhietDo.add(12.5);
        danhSachNhietDo.add(39.8);
        danhSachNhietDo.add(99.9);
        danhSachNhietDo.add(36.8);

        System.out.println("Danh sách ban đầu: " + danhSachNhietDo);

        Iterator<Double> iterator = danhSachNhietDo.iterator();
        while (iterator.hasNext()) {
            Double nhietDo = iterator.next();
            if (nhietDo < 34.0 || nhietDo > 42.0) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + danhSachNhietDo);

        double tong = 0;
        for (Double nhietDo : danhSachNhietDo) {
            tong += nhietDo;
        }

        double trungBinh = tong / danhSachNhietDo.size();

        System.out.printf("Nhiệt độ trung bình: %.2f\n", trungBinh);
    }
}