import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachVatPham ds = new DanhSachVatPham();
        ds.nhap();
        ds.xuat();
        ds.DanhSachVatPhamDatNhat();
        ds.Cau4();

        sc.close();
    }
}