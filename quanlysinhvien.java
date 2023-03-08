package bai4;
import java.util.*;
public class quanlysinhvien {


	public class SinhVien {
	    private String hoTen;
	    private String lop;
	    private double diem;
	    
	    public SinhVien(String hoTen, String lop, double diem) {
	        this.hoTen = hoTen;
	        this.lop = lop;
	        this.diem = diem;
	    }
	    
	    public String getHoTen() {
	        return hoTen;
	    }
	    
	    public String getLop() {
	        return lop;
	    }
	    
	    public double getDiem() {
	        return diem;
	    }
	}

	public class quanlysinhvien {
	    private ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
	    
	    public void nhapSinhVien() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so luong sinh vien: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print("Nhap ho ten sinh vien " + (i + 1) + ": ");
	            String hoTen = sc.nextLine();
	            
	            System.out.print("Nhap lop sinh vien " + (i + 1) + ": ");
	            String lop = sc.nextLine();
	            
	            System.out.print("Nhap diem sinh vien " + (i + 1) + ": ");
	            double diem = sc.nextDouble();
	            sc.nextLine();
	            
	            SinhVien sv = new SinhVien(hoTen, lop, diem);
	            dsSinhVien.add(sv);
	        }
	    
	    








