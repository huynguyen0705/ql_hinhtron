import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap toa do cho hinh tron");
        System.out.println("Nhap hoanh do: ");
        int hoanhDo = scanner.nextInt();
        System.out.println("Nhap tung do: ");
        int tungDo = scanner.nextInt();
        Diem tamHinhTron = new Diem(hoanhDo,tungDo);
        System.out.println("Nhap ban kinh cho hinh tron: ");
        int banKinh = scanner.nextInt();
        HinhTron hinhTron = new HinhTron(banKinh, tamHinhTron);
        double chuVi = hinhTron.TinhChuVi();
        double dienTich = hinhTron.TinhDienTich();
        System.out.println("Chu vi hinh tron la: "+ chuVi);
        System.out.println("Dien tich hinh tron la: "+ dienTich);
    }
}