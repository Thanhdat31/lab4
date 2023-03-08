package bai2va3;

public class sinhvienbiz extends sinhvienpoly {
    public double diemMarketing;
    public double diemSales;

    public sinhvienbiz(String hovaten, String nganh, double diemMarketing, double diemSales) {
        super(hovaten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getdiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}


