
package com.solvd.lab4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionRunner {

	
	public static void viewFile(String fileName) {
		File file = new File(fileName);
		
		FileInputStream fileInputStream = null;
		try {
		fileInputStream = new FileInputStream(file);
		fileInputStream.read();
		
	}catch(FileNotFoundException e) {
		System.out.println("File is missing: " +e.getMessage());
	}catch(IOException e) {
		System.out.println("Error reading for the file: " + e.getMessage());
	}finally {
		if(fileInputStream != null)
			try {
				fileInputStream.close();
			}catch(IOException e) {
				System.out.println("Closing of the stream caused error: " + e.getMessage());
			}
			
	}
	}
	
	public static void main(String[] args) {
		
		viewFile("/tmp.txt");

	}

}
