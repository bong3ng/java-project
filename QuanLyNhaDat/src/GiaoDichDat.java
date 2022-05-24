import java.util.Scanner;

public class GiaoDichDat extends NhaDat {
	private String loaiDat;
	

	
	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat() {
		super();
	}

	public GiaoDichDat(String maGD, int ngay, int thang, int nam, int donGia, float dienTich,String loaiDat) {
		super(maGD,ngay,thang,nam,donGia,dienTich);
		this.loaiDat = loaiDat;
		
	}
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập loại đất: ");
		this.loaiDat = scan.nextLine();
		
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t loại đất: " + loaiDat);
	}
	
	public void giaTri() {
		if (this.loaiDat.equalsIgnoreCase("A")) {
			this.thanhTien = dienTich*donGia*1.5f;
		}
		else {
			this.thanhTien = dienTich*donGia;
		}
	}
	

}
