public class HonDaKichNo extends VatPham{
    public HonDaKichNo(){
        this.ChiSoSucManh = 40;
        this.HeSo = 2.0;
        this.SoVang = 12;
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
        System.out.println("Hon Da Kich No ");
        System.out.println("Chi So Suc Manh: "+ this.ChiSoSucManh);
        System.out.println("He So: "+ this.HeSo);
        System.out.println("Suc Cong Pha: "+ this.SucCongPha());
        System.out.println("Tien Vang: "+ this.SoVangQuyDoi() + " Xu");
    }
}
