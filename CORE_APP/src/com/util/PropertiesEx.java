package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("src/com/util/jdbc.properties");
		p.load(fis);
		System.out.println(p);
		
		/*FileOutputStream fos=new FileOutputStream("src/com/util/io.txt");
		
		
		fos.write(98);
		
		fos.flush();
		
		fos.close();*/
		
	}

}
