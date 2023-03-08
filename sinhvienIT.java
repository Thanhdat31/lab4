package bai2va3;

public class sinhvienIT {
	public class SinhVienIT extends sinhvienpoly {
	    public double diemJava;
	    public double diemHTML;
	    public double diemCSS;

	    public SinhVienIT(String hovaten, String nganh, double diemJava, double diemHTML, double diemCSS) {
	        super(hovaten, nganh);
	        this.diemJava = diemJava;
	        this.diemHTML = diemHTML;
	        this.diemCSS = diemCSS;
	    }

	    public double getdiem() {
	        return (2 * diemJava + diemHTML + diemCSS) / 4;
	    }
	

	
