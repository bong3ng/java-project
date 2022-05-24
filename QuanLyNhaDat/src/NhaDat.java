import java.util.Scanner;

public class NhaDat {
	protected String maGD;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected int donGia;
	protected float dienTich;
	protected float thanhTien;
	
	

	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	public float getThanhTien(float thanhTien) {
		return thanhTien;
	}
	public NhaDat() {
		
	}

	
	public NhaDat(String maGD, int ngay, int thang, int nam, int donGia, float dienTich) {
		this.maGD = maGD;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	
	
	public void nhap(Scanner scan) {
		System.out.println("Nhập mã giao dịch: ");
		this.maGD = scan.nextLine();
		System.out.println("Nhập ngày giao dịch:");
		this.ngay = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập tháng giao dịch:");
		this.thang = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập năm giao dịch: ");
		this.nam = Integer.parseInt(scan.nextLine());
		System.out.println("Đơn giá trên mỗi m2: ");
		this.donGia = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập diện tích: ");
		this.dienTich = Float.parseFloat(scan.nextLine());
	}
	
	public void xuat() {
		System.out.print("Mã giao dịch " + maGD + " giao dịch ngày " + ngay +"/"+ thang +"/" + nam + " có đơn giá là " + donGia + "-diện tích: " + dienTich);
	}
}
