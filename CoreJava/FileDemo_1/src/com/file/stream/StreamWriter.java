package com.file.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamWriter {

	public static void main(String[] args) throws IOException {

		String data = "Hi to all";
		byte all[] = data.getBytes();

		String data1 = "abc";
		byte all1[] = data1.getBytes();

		FileOutputStream fou = new FileOutputStream("abc.txt",false);
		fou.write(all);
		fou.write(all1);
		fou.close();
		System.out.println("file creation done.");

		FileInputStream fip = new FileInputStream("abc.txt");

		int i = 0;
		while ((i = fip.read()) != -1) {
			System.out.print((char) i);
		}

		fip.close();
	}
}
