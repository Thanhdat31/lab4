package bai2va3;

public abstract class sinhvienpoly {
public String hovaten;
public String nganh;
public sinhvienpoly(String hovaten,String nganh) {
	this.hovaten = hovaten;
	this.nganh = nganh;
}
public abstract double getdiem();
public String gethocluc(){
	double diem = getdiem();
	if (diem < 5) {
		return "yếu";}
	else if (diem < 6.5) {
		return "khá";
	}
	else if (diem < 7.5)
	{
		return "giỏi";}
	else 
		return "xuất sắc";	
}
public void xuat()
{
	System.out.println("Họ và tên :"+this.hovaten);
	System.out.println("Ngành :"+this.nganh);
	System.out.println("diem :"+getdiem());
	System.out.println("Học lực :"+gethocluc());
}
}