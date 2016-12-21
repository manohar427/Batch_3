package com.file;

import java.io.File;
import java.io.IOException;

public class FileManager {

	public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/dell/sdsasdadDesktop/Original/xyz.txt");
			boolean flag = file.createNewFile();
			if(flag){
				System.out.println("File created!");
			}else{
				System.out.println("File is not created");
			}
		
	}

}
