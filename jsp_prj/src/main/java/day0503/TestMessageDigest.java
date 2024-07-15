package day0503;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.codec.binary.Base64;

import kr.co.sist.util.cipher.DataDecrypt;
import kr.co.sist.util.cipher.DataEncrypt;

public class TestMessageDigest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "a";
		
		//1.MessageDigest생성
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			//암호화 알고리즘에 의한 암호화 수행
			md.update(msg.getBytes());
			
			byte[] temp = md.digest();
			System.out.println(new String(temp));
			Base64 base = new Base64();
			String cipherText = new String(base.encode(temp));
			System.out.println(cipherText);
			
			//sist_utill 패키지에서 제공하는 암호화 사용
			String p_t = "test";
			String c_t = DataEncrypt.messageDigest("SHA-512", p_t);
			System.out.println("일반문자열 : " + p_t);
			System.out.println("암호화문자열 : " + c_t);
			
			//복호화가 가능한 암호화
			String name = "김동섭";
			String key = "CY9rzUYh03PK3k6DJie09g==";
			try {
				//암호화
				DataEncrypt de = new DataEncrypt(key);
				String encrypText = de.encryption(name);
				System.out.println("암호화 문자열 : " + encrypText);
				
				//복호화
				DataDecrypt dd = new DataDecrypt(key);
				String decrypText = dd.decryption(encrypText);				
				System.out.println("복호화 문자열 : " + decrypText );
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (GeneralSecurityException e) {
				e.printStackTrace();
			}
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace(); 
		}
		
	}
}
