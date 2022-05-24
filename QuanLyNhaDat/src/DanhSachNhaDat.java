import java.util.ArrayList;

public class DanhSachNhaDat {
	private ArrayList<NhaDat> list;
	private int tongGDdat;
	private int tongGDnha;
	private float tbgdDat;
	

	public ArrayList<NhaDat> getList() {
		return list;
	}



	public void setList(ArrayList<NhaDat> list) {
		this.list = list;
	}



	public int getTongGDdat() {
		return tongGDdat;
	}



	public int getTongGDnha() {
		return tongGDnha;
	}
	
	


	public float getTbgdDat() {
		return tbgdDat;
	}



	public DanhSachNhaDat() {
		list = new ArrayList<NhaDat>();
		
	}
	public void xuat() {
		for (NhaDat gd: list) {
			gd.xuat();
		}
	}
	
	
	public void GDdat() {
		this.tongGDdat = 0;
		for (NhaDat gd : list) {
			if (gd instanceof GiaoDichDat) {
				this.tongGDdat++;
				
			}
		}
	}
	public void GDnha() {
		this.tongGDnha = 0;
		for (NhaDat gd : list) {
			if (gd instanceof GiaoDichNha) {
				this.tongGDnha++;
			}
		}
	}
	
	public void trungbinh() {
		int count = 0;
		int sum = 0;
		for(NhaDat gd : list) {
			if(gd instanceof GiaoDichDat) {
				((GiaoDichDat) gd).giaTri();
				count++;
				sum+= gd.thanhTien;
				
			}
		}
		if (count!= 0) {
			this.tbgdDat = sum/count;
		}
	}
	
	public void them(NhaDat gd) {
		this.list.add(gd);
	}
	
	public void xuatGDthang9nam2013() {
		if(list.size() != 0) {
			for(NhaDat gd : list) {
				if(gd.thang == 9 && gd.nam == 2013) {
					gd.xuat();
				}
			}
		}else {
			System.out.println("Không có giao dịch trong tháng 9 năm 2013");
		}
	}
	
	
	
	public void dummyData() {
		NhaDat giaodich;
		giaodich = new GiaoDichNha("456zz45",6,8,2021,3000,100,"cao cấp");
		list.add(giaodich);
		
		
		giaodich = new GiaoDichDat("456c45",6,9,2013,8000,200,"A");
		list.add(giaodich);
		
		
		giaodich = new GiaoDichDat("45sdfg645",6,8,2013,13000,400,"B");
		list.add(giaodich);
		
		
		giaodich = new GiaoDichNha("45sdf645",21,9,2013,73000,50,"thường");
		list.add(giaodich);
		
		
		
		giaodich = new GiaoDichNha("456sxcvs45",6,8,2021,20000,23.5f,"C");
		list.add(giaodich);
	}
}
