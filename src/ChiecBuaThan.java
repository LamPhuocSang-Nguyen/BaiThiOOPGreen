public class ChiecBuaThan extends VatPham{
    public ChiecBuaThan(){
        this.ChiSoSucManh = 25;
        this.HeSo = 2.0;
        this.SoVang = 10;
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
        System.out.println("Chiec Bua than ");
        System.out.println("Chi So Suc Manh: "+ this.ChiSoSucManh);
        System.out.println("He So: "+ this.HeSo);
        System.out.println("Suc Cong Pha: "+ this.SucCongPha());
        System.out.println("Tien Vang: "+ this.SoVangQuyDoi() + " Xu");
    }
}
