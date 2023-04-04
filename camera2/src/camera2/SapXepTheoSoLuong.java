package camera2;

import java.util.Comparator;

public class SapXepTheoSoLuong implements Comparator<Hoadon> {

    @Override
    public int compare(Hoadon a1, Hoadon a2) {
        float sub = a1.getSoLuongNhapXuat() - a2.getSoLuongNhapXuat();
        if (sub < 0) {
            return -1;
        } else if (sub == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
