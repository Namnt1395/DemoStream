package com.nguyenthanhnam.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MSinhVien {
	public void writeFile(String ten, String ngaySinh,
			String diemToan, String diemLy, String diemVan) {
		String content=ten +","+ngaySinh+","+diemToan+","+diemLy+","+diemVan+"\n";
		try {
			File file = new File("/DemoIOJava/src/resource/sinhvien.csv");
			OutputStream output = new FileOutputStream(file,true);
			output.write(content.getBytes());	
			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
