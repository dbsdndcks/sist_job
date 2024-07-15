package day0207;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA의 기본형 데이터 형을 읽거나 쓰기 위해서 제공되는 stream
 */
public class UseDataStream {

	public void writeData() throws IOException{
		 int i = 2024;
		 
		 DataOutputStream dos = null;
		 try {
			 dos = new DataOutputStream(new FileOutputStream("c:/E/dev/temp/data.txt"));
//			 dos.writeInt(i);
//			 dos.writeDouble(2024.02);
			 dos.writeUTF("오늘은 수요일입니다");
			 dos.flush();
		 }finally {
			if(dos != null) {dos.close();}
		}
	}
	public void readData() throws IOException{
		DataInputStream dis = null;
		try {
			 dis = new DataInputStream(new FileInputStream("c:/E/dev/temp/data.txt"));
//			 int readData = dis.readInt();
//			 System.out.println(readData);
//			 System.out.println(dis.readDouble());
			 System.out.println(dis.readUTF());
		 }finally {
			if(dis != null) {dis.close();}
		}
	}
	public static void main(String[] args) {
		UseDataStream ud = new UseDataStream();
		try {
			ud.writeData();
			System.out.println("쓰기 완료");
			ud.readData();
			System.out.println("읽기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
