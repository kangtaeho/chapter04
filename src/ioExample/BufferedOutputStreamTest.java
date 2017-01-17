package ioExample;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		
		FileOutputStream fos =null;
		BufferedOutputStream  bos = null;
		
		try{
			fos = new FileOutputStream("1234.txt");
			bos = new BufferedOutputStream(fos);
		
		for(int i ='0'; i<'9'; i++){
			bos.write(i);
			bos.flush(); //강제로 버퍼를 비움
		}		
		}catch(FileNotFoundException e){
			System.out.println("파일열기 실패:"+ e);
		}catch(IOException e){
		System.out.println("파일열기 실패:"+ e);
		
		}finally{
			
			//	bos.close();
			
		}

	}

}
