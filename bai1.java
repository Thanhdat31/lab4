package bai1;

import java.util.Scanner;
class ChuNhat {
     double rong, dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return (this.rong + this.dai) * 2;
    }

    public double getDienTich() {
        return this.rong * this.dai;
    }

    public void xuat() {
        System.out.println("Chiều rộng: " + this.rong);
        System.out.println("Chiều dài: " + this.dai);
        System.out.println("Diện tích: " + this.getDienTich());
        System.out.println("Chu vi: " + this.getChuVi());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    public void xuat() {
        System.out.println("Cạnh: " + this.rong);
        System.out.println("Diện tích: " + this.getDienTich());
        System.out.println("Chu vi: " + this.getChuVi());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều rộng và chiều dài của hình chữ nhật thứ nhất:");
        double rong1 = scanner.nextDouble();
        double dai1 = scanner.nextDouble();
        ChuNhat hcn1 = new ChuNhat(rong1, dai1);

        System.out.println("Nhập chiều rộng và chiều dài của hình chữ nhật thứ hai:");
        double rong2 = scanner.nextDouble();
        double dai2 = scanner.nextDouble();
        ChuNhat hcn2 = new ChuNhat(rong2, dai2);

        System.out.println("Nhập cạnh của hình vuông:");
        double canhVuong = scanner.nextDouble();
        Vuong hv = new Vuong(canhVuong);

        System.out.println("Thông tin của hình chữ nhật thứ nhất:");
        hcn1.xuat();

        System.out.println("Thông tin của hình chữ nhật thứ hai:");
        hcn2.xuat();

        System.out.println("Thông tin của hình vuông:");
        hv.xuat();

        scanner.close();
    }
}
