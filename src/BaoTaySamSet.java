public class BaoTaySamSet extends VatPham{
    public BaoTaySamSet(){
        this.ChiSoSucManh = 30;
        this.HeSo = 1.0;
        this.SoVang = 7;
    }

    @Override
    public Double SucCongPha(){
        return (this.ChiSoSucManh * this.HeSo);
    }

    @Override
    public Double SoVangQuyDoi(){
        return (this.SucCongPha() * this.SoVang);
    }

    public void xuat(){
        System.out.println("########################################");
        System.out.println("Bao Tay Sam Set ");
        System.out.println("Chi So Suc Manh: "+ this.ChiSoSucManh);
        System.out.println("He So: "+ this.HeSo);
        System.out.println("Suc Cong Pha: "+ this.SucCongPha());
        System.out.println("Tien Vang: "+ this.SoVangQuyDoi() + " Xu");
    }
}
