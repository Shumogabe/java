package BTBN0;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so nguoi: ");
		int n = in.nextInt();
		Nhanvien[] nv = new Nhanvien[n];
		for (int i = 0; i < nv.length; i++) {
			in.nextLine();
			System.out.println("NV " + (i + 1) + ": ");
			nv[i] = new Nhanvien();
			nv[i].Nhap();

		}
		System.out.println("bang luong nhan vien: ");
		for (int i = 0; i < nv.length; i++) {
			System.out.println("Nhan vien: " + nv[i].getTen() + " -thuong: " + nv[i].tThuong());
		}
		// Tim va in ra thong tin mot ban ten "Hau"
		
		 System.out.println("----------------------------------------------"); for
		 (int i = 0; i < nv.length; i++) { if (nv[i].getTen().equals("Phuc")) { nv[i].In();
		 } }
		 
		// In ra ten nv co ten la....
		for (int i = 0; i < nv.length; i++) {
			if (nv[i].getTen().equals("Phuc")) {
				System.out.println("Nhan vien ten Phuc: " + nv[i].getTen());
			}
		}
		// In ra ten nv co luong tu 500 den 1000
		for (int i = 0; i < nv.length; i++) {
			if (nv[i].getTienluong() >= 500 && nv[i].getTienluong() <= 1000)
				System.out.println("Ten nhan vien co luong tu 500 den 1000: " + nv[i].getTen());
		}
		// Dem xem co bao nhieu nv gioi tinh nu
		int dem = 0;
		for (int i = 0; i < nv.length; i++) {
			if (nv[i].getGioitinh().equals("Nu")) {
				dem++;
			}
		}
		System.out.println("So nhan vien nu: " + dem);
		// Tinh luong trung binh cua nv co gioi tinh 'Nam'
		int luongtb = 0;
		int tong = 0;
		int dem1=0;
		for (int i = 0; i < nv.length; i++) {
			if (nv[i].getGioitinh().equals("Nam")) {
				dem1++;
				tong = tong + nv[i].getTienluong();
			}
		}
		luongtb = tong / dem1;
		System.out.println("luongtb: " + luongtb);
	}
}
