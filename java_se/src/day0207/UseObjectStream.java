package day0207;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UseObjectStream {

	public void writeObject(UserData ud) throws	NotSerializableException, IOException {
		//1. 스트림 생성
		 ObjectOutputStream oos = null;
		 try {
			 oos = new ObjectOutputStream(new FileOutputStream("c:/E/dev/temp/obj.txt"));
		 
		//2. 입력받은 객체 쓰기
		 oos.writeObject(ud);
		 System.out.println("객체 쓰기 완료");
		  	//직렬화가 되지 않은 객체라면 NotSerializableException 이 throw된다 
		//3. 분출
		 oos.flush();
		 }
		 finally {
			 //4. 연결끊기
			 if(oos != null) {oos.close();}
		}
	}//writeObject
	
	
	public UserData readObject() throws IOException, ClassNotFoundException {
		UserData ud = null;
		//1. 객체를 읽어 들일 수 있는 스트림을 생성
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("c:/E/dev/temp/obj.txt"));
			ud = (UserData) ois.readObject();
		}
		finally {
			if(ois != null) {ois.close();}
		}
		//2. 객체 읽어 들인다.
		return ud;
	}//readObject
	
	
	public static void main(String[] args) {
		UseObjectStream uos = new UseObjectStream();
//		UserData ud = new UserData("윤웅찬",182.5,67.8);
//		try {
//			uos.writeObject(ud);
//		} catch (NotSerializableException e) {
//			System.out.println("객체 직렬화가 되지 않는 클래스. 스트림을 타고 jvm밖으로 나갈수 없다.");
//			e.printStackTrace();
//		}catch (IOException e) {
//		e.printStackTrace();
//		}
		try {
			UserData ud = uos.readObject();
			System.out.println(ud.getName() +"님의 키" + ud.getHeight() + "몸무게" + ud.getWeigth());
		} catch (ClassNotFoundException e) {
			System.err.println("파일에 객체가 없습니다");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
