public class HinhTron {
    private Diem TamHinhTron;
    private int BanKinh;
    public HinhTron(){
        TamHinhTron = new Diem();
    }
    public HinhTron(int banKinh, Diem d){
        setBanKinh(banKinh);
        setTamHinhTron(d);
    }

    public Diem getTamHinhTron() {
        return TamHinhTron;
    }

    public void setTamHinhTron(Diem tamHinhTron) {
        TamHinhTron = tamHinhTron;
    }

    public int getBanKinh() {
        return BanKinh;
    }

    public void setBanKinh(int banKinh) {
        BanKinh = banKinh;
    }
    public double TinhChuVi(){
        double chuVi = 2 * Math.PI * getBanKinh();
        return chuVi;
    }
    public double TinhDienTich(){
        double dienTich = Math.PI * getBanKinh() * getBanKinh();
        return dienTich;
    }
}
