package com.file.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferManager {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("pqr.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi to All");
		bw.write("\n");
		bw.write(" and every one");
		bw.close();

		FileReader fr = new FileReader("pqr.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);// 3//15
		}
		br.close();
	}
}
