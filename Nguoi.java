package BTBN0;  

import java.util.Scanner;

public class Nguoi {
	private String ten, gioitinh, ngaysinh, diachi;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Nguoi(String ten, String gioitinh, String ngaysinh, String diachi) {
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}

	public Nguoi() {
	}

	public void Nhap() {

		Scanner a = new Scanner(System.in);
		// nhap ten nguoi// in ra ten nguoi
		System.out.println("Nhap ten");
		ten = a.nextLine();

		// nhap gioi tinh// in ra gioi tinh
		System.out.println("Nhap gioi tinh");
		gioitinh = a.nextLine();

		// nhap ngay sinh// in ra ngaysinh
		System.out.println("Nhap ngay sinh");
		ngaysinh = a.nextLine();

		// nhap diachi// in ra gioi tinh
		System.out.println("Nhap dia chi");
		diachi = a.nextLine();

	}

	public void In() {
		System.out.println("Ten la: " + ten);
		System.out.println("Gioi tinh la: " + gioitinh);
		System.out.println("Ngay sinh la: " + ngaysinh);           
		System.out.println("Dia chi la: " + diachi);
	}

	public static void main(String[] args) {
		Nguoi d = new Nguoi();
		d.Nhap();
		d.In();
	}

}
