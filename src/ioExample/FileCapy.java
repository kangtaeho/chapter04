package ioExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCapy {

	public static void main(String[] args) {
		FileInputStream fis = null;// 파이널리를 참조하기 위해 try에서 빼놓음
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("lotto.jpg");
			fos = new FileOutputStream("lotto2.jpg");

			int data = 0;

			while ((data = fis.read()) != -1) { // fis에 에러 걸림

			}
			fis.close();// 파일을 잃고 열었으면 클로즈해아함
			fos.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다." + e);
		} catch (IOException e) {
			System.out.println("I/O오류" + e);
		} finally {

			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {

				System.out.println("I/O오류" + e);
			}
		}

	}

}
