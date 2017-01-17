package ioExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) {
		FileReader fr= null;
		FileInputStream fis = null;
		
		try{
			int count = 0;
			fr = new FileReader("test.txt");
			int data=-1;
			while((data=fr.read())== (-1)){
				count++;
				System.out.println((char) data);
			}
		System.out.println("\n 읽은 횠수 : "+count);
		System.out.println("\n==========");	
		
		//바이트 단위로 읽음
		fis = new FileInputStream("text.txt");
		
		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
		}catch(IOException e){
			System.out.println("파일");
		}finally{
//			try{
//				if(fr != null){
//					
//				}
//			//}catch(IOException e){
//				
//			//}
		}

	}

}
