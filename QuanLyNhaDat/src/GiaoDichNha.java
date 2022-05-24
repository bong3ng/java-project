import java.util.Scanner;

public class GiaoDichNha extends NhaDat {
	private String loaiNha;
	
	
	

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public GiaoDichNha() {
		super();
	}

	public GiaoDichNha(String maGD, int ngay, int thang, int nam, int donGia, float dienTich, String loaiNha) {
		super(maGD, ngay, thang, nam, donGia, dienTich);
		this.loaiNha = loaiNha;
		
	}
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập loại nhà: ");
		this.loaiNha = scan.nextLine();
		
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t loại nhà: " + loaiNha);
	}
	
	public void giaTri() {
		this.thanhTien = 0;
		if(this.loaiNha.equalsIgnoreCase("cao cấp")) {
			this.thanhTien = dienTich*donGia;
			
		}
		if(this.loaiNha.equalsIgnoreCase("thường")) {
			this.thanhTien = dienTich*donGia*0.9f;
		}
	}
	
}
