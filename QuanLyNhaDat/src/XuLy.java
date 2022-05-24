import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DanhSachNhaDat danhSach = new DanhSachNhaDat();
		
		boolean flag = true;
		
		do {
			inMenu();
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				
				
//				danhSach.dummyData();
				
				
				System.out.println("Chọn 1 để nhập giao dịch nhà: ");
				System.out.println("Chọn 2 để nhập giao dịch đất: ");
				int numb = Integer.parseInt(scan.nextLine());
				if(numb == 1) {
					NhaDat giaoDich = new GiaoDichNha();
					giaoDich.nhap(scan);
					danhSach.them(giaoDich);				
				}
				if(numb == 2) {
					NhaDat giaoDich = new GiaoDichDat();
					giaoDich.nhap(scan);
					danhSach.them(giaoDich);				
				}
				break;
			case 2:
				danhSach.xuat();
				
				
				break;
				
			case 3:
				danhSach.GDdat();
				danhSach.GDnha();
				int dat = danhSach.getTongGDdat();
				int nha = danhSach.getTongGDnha();
				System.out.println("Tổng giao dịch đất là : "+ dat);
				System.out.println("Tổng giao dịch nhà là: " + nha);
				break;
			case 4:
				danhSach.trungbinh();
				System.out.println("Trung bình thành tiền của giao dịch đất là: " + danhSach.getTbgdDat());
				break;
			
			case 5:
				danhSach.xuatGDthang9nam2013();
				break;
			case 0:
				flag = false;
				break;
			}
			
			
		}while(flag);
		

	}
	
	public static void inMenu() {
		System.out.println();
		System.out.println("1. Nhập danh sách giao dịch");
		System.out.println("2. Xuất danh sách giao dịch");
		System.out.println("3. In ra tổng số lượng cho từng loại giao dịch");
		System.out.println("4. Trung bình thành tiền của giao dịch đất");
		System.out.println("5. Xuất ra các giao dịch của tháng 9 năm 2013");
		System.out.println("0. Thoát khỏi chương trình");
		System.out.println();
	}
	
}
