package day0103;


/**
 * main method arguments 입려과 사용에 관한 대한 연습.
 * 
 * 실행 ) java day0103.TestArguments 값 값 값...
 */
public class TestArgument {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(Integer.parseInt(args[1])+Integer.parseInt(args[2]));

	}

}
