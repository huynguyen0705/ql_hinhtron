public class Diem {
    int HoanhDo;
    int TungDo;
    public Diem(){

    }
    public Diem(int hoanhDo, int tungDo){
        HoanhDo = hoanhDo;
        TungDo = tungDo;
    }

    public int getHoanhDo() {
        return HoanhDo;
    }

    public void setHoanhDo(int hoanhDo) {
        HoanhDo = hoanhDo;
    }

    public int getTungDo() {
        return TungDo;
    }

    public void setTungDo(int tungDo) {
        TungDo = tungDo;
    }

    public void InDiem(){
        System.out.println("(" + getHoanhDo() + ", " + getTungDo() + ")");
    }
    public double TinhKhoangCach2Diem(Diem diem2){
        double khoangCach = Math.sqrt(Math.pow((HoanhDo - diem2.getHoanhDo()),2) + Math.pow(TungDo - diem2.getTungDo(),2));
        return khoangCach;
    }
}
