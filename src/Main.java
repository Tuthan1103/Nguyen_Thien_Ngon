import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GamePlay gamePlay = new GamePlay();

        gamePlay.hienThiThongTinVatPham();

        String vatPhamMaxVang = gamePlay.TimVatPhamCanNhieuVangNhat();
        System.out.println("Vật phẩm cần nhiều vàng nhất: "+ vatPhamMaxVang);

        System.out.print("Số vàng mà Spon thu được: ");
        double soVangThuDuoc= sc.nextDouble();

        if(gamePlay.kiemTraSponCoDuVang(soVangThuDuoc)){
            System.out.println("Spon có thể giải cứu được đồng đội ");
        }else {
            System.out.println("Spon không thể giải cứu được đồng đội ");
        }
        sc.close();



    }
}