package BTBN0;

import java.util.Scanner;

import BTBN1.Giangvien;

public class Nhanvien extends Nguoi {

	private static int tienluong;
	private static int tongsogiolamviec;
	private String phongban;

	public Nhanvien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int getTienluong() {
		return tienluong;
	}

	public static void setTienluong(int tienluong) {
		Nhanvien.tienluong = tienluong;
	}

	public static int getTongsogiolamviec() {
		return tongsogiolamviec;
	}

	public static void setTongsogiolamviec(int tongsogiolamviec) {
		Nhanvien.tongsogiolamviec = tongsogiolamviec;
	}

	public String getPhongban() {
		return phongban;
	}

	public void setPhongban(String phongban) {
		this.phongban = phongban;
	}

	public Nhanvien(String ten, String gioitinh, String ngaysinh, String diachi, int tienluong, int tongsogiolamviec,
			String phongban) {
		super(ten, gioitinh, ngaysinh, diachi);
		this.tienluong = tienluong;
		this.tongsogiolamviec = tongsogiolamviec;
		this.phongban = phongban;
		// TODO Auto-generated constructor stub
	}

	public void Nhap() {

		Scanner a = new Scanner(System.in);
		super.Nhap();
		// nhap tien luong
		System.out.println("Nhap tien luong:");
		tienluong = a.nextInt();
		// nhap tong so gio lam
		System.out.println("Nhap so gio:");
		tongsogiolamviec = a.nextInt();
		// nhap phong ban
		System.out.println("Nhap phong ban:");
		phongban = a.nextLine();
	}

	public void In() {
		super.In();
		System.out.println("Tien luong: " + tienluong);
		System.out.println("So gio lam: " + tongsogiolamviec);
		System.out.println("Phong ban: " + phongban);
	}

	public double tThuong() {
		double thuong = 0;
		if (tongsogiolamviec >= 200) {
			thuong = tienluong * 0.2;

		} else if (tongsogiolamviec < 200 && tongsogiolamviec >= 100) {
			thuong = tienluong * 0.1;
		} else {
			thuong = 0;

		}
		return thuong;
	}
}
