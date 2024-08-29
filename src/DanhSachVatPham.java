import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    List<VatPham> arr;

    public DanhSachVatPham(){
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            VatPham vp;
            System.out.println("Ban Hay Chon Vat Pham Trong Danh Sach Vat Pham Duoi Day: ");
            System.out.println("1.Chiec Bua than");
            System.out.println("2.Bao Tay Sam set");
            System.out.println("3.Hon Da Kich No");
            System.out.println("4.Cay Riu Phep Thuat");
            System.out.println("5.Cay Gay Chien THan");

            int choose = sc.nextInt();
            if(choose == 1){
                vp = new ChiecBuaThan();
                this.arr.add(vp);
            }
            else if(choose == 2){
                vp = new BaoTaySamSet();
                this.arr.add(vp);
            }
            else if(choose == 3){
                vp = new HonDaKichNo();
                this.arr.add(vp);
            }
            else if(choose == 4){
                vp = new CayRiuPhepThuat();
                this.arr.add(vp);
            }
            else {
                vp = new CayGayChienThan();
                this.arr.add(vp);
            }

            System.out.println("Ban Co Muon Tiep Tuc: 1.CO 0.KHONG");
            int cons = sc.nextInt();

            if(cons == 0){
                flag = true;
            }
        }
    }

    public void xuat(){
        for(VatPham v : this.arr){
            v.xuat();
        }
    }

    public double VapPhamDatNhat(){
        double max = -1.0;

        for(int i = 0; i < this.arr.size(); i++){
            if(this.arr.get(i).SoVangQuyDoi() > max){
                max = this.arr.get(i).SoVangQuyDoi();
            }
        }
        return max;
    }

    public void DanhSachVatPhamDatNhat(){
        double max = this.VapPhamDatNhat();
        int flag = 0;
        System.out.println("Danh Sach Vat Pham Dat Nhat La: ");
        for(int i = 0; i < this.arr.size(); i++){
            if(this.arr.get(i).SoVangQuyDoi() == max){
//                System.out.println(this.arr.get(i).SoVangQuyDoi());
                this.arr.get(i).xuat();
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println("Khong co Vat Pham Nao Dat Nhat Ca!");
        }
    }

    public double SumVatPham(){
        double sum = 0.0;

        for(int i = 0; i < this.arr.size(); i++){
            sum = sum + this.arr.get(i).SoVangQuyDoi();
        }

        return sum;
    }

    public void Cau4(){
        Scanner sc = new Scanner(System.in);
        double sum = this.SumVatPham();

        System.out.println("Nhap So Su Vang ma Spon Nhat Duoc: ");
        double Spon = sc.nextDouble();

        if(Spon >= sum){
            System.out.println("Spon Co the Giai Cuu Dong Doi");
        }
        else {
            System.out.println("Thua ROi, Het Cuu!");
        }
    }
}
