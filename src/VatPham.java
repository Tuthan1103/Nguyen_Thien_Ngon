public class VatPham {
    private String tenVatPham;
    private int chiSoSM;
    private double heSoSM;
    private int SVQDTSCP;


    public VatPham(String tenVatPham,int chiSoSM, double heSoSM,int SVQDTSCP){
        this.tenVatPham=tenVatPham;
        this.chiSoSM=chiSoSM;
        this.heSoSM=heSoSM;
        this.SVQDTSCP=SVQDTSCP;
    }

    public int getSVQDTSCP() {
        return SVQDTSCP;
    }

    public void setSVQDTSCP(int SVQDTSCP) {
        this.SVQDTSCP = SVQDTSCP;
    }

    public double getHeSoSM() {
        return heSoSM;
    }

    public void setHeSoSM(double heSoSM) {
        this.heSoSM = heSoSM;
    }

    public int getChiSoSM() {
        return chiSoSM;
    }

    public void setChiSoSM(int chiSoSM) {
        this.chiSoSM = chiSoSM;
    }

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        this.tenVatPham = tenVatPham;
    }

    public double tinhSucCongPha(){
        return this.chiSoSM*this.heSoSM;
    }



    public double tinhTongSoVangCan(){
        return this.tinhSucCongPha()*this.SVQDTSCP;
    }


    @Override
    public String toString() {
        return  "Tên vật phẩm: " + tenVatPham +
                ", Chỉ số sức mạnh: " + chiSoSM +
                ", Hệ số sức mạnh: " + heSoSM +
                ", Sức công phá: " + tinhSucCongPha();
    }
}
