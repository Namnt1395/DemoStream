package com.nguyenthanhnam.entity;

public class ESinhVien {
	private String tenSinhVien;
	private String ngaySinh;
	private float diemToan;
	private float diemVan;
	private float diemLy;

	public ESinhVien(String tenSinhVien, String ngaySinh, float diemToan,
			float diemVan, float diemLy) {
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemLy = diemLy;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

}
