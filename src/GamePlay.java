public class GamePlay {
    private VatPham[] vatPham;
    public GamePlay(){
         vatPham =new VatPham[5];

        vatPham[0] = new ChiecBuaThan();
        vatPham[1] = new BaoTaySamSet();
        vatPham[2] = new HonDaKichNo();
        vatPham[3] = new CayRiuPhepThuat();
        vatPham[4] = new CayGayChienThan();
    }
    public void hienThiThongTinVatPham(){
        System.out.println("Thông tin các vật phẩm Spon cần thu hoạch:");
        for (VatPham vp: vatPham){
            System.out.println(vp.toString());
        }
    }

    public String TimVatPhamCanNhieuVangNhat(){
        double maxVangCan = 0;
        String tenVatPhamMaxVang ="";
        for (VatPham vp:vatPham){
            double soVangCan = vp.tinhTongSoVangCan();
            if(soVangCan> maxVangCan){
                maxVangCan = soVangCan;
                tenVatPhamMaxVang=vp.getTenVatPham();
            }
        }
        return tenVatPhamMaxVang + " với "+ maxVangCan+" vàng.";
    }

    public boolean kiemTraSponCoDuVang(double soVangThuDuoc){
        double tongVangCan = 0;
        for (VatPham vp: vatPham){
            double soVangCan = vp.tinhTongSoVangCan();

               tongVangCan += soVangCan;

        }
        return soVangThuDuoc >= tongVangCan;
    }
}
