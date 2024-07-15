package day0116;

public class UserStudentVO {

	public static void main(String[] args) {
		StudentVO[]studentVO = new StudentVO[3];
		studentVO[0] = new StudentVO(5, "윤웅찬1", 95, 100);
		studentVO[1] = new StudentVO(10, "윤웅찬2", 0, 100);
		studentVO[2] = new StudentVO(10, "윤웅찬3", 5, 100);
		System.out.println(studentVO[0].getName());
		System.out.println(studentVO[1].getName());
		System.out.println(studentVO[2].getName());
		studentVO[0].setName("아아");
		studentVO[1].setName("이이");
		studentVO[2].setName("스크림스크림");
		System.out.println(studentVO[0].getName());
		System.out.println(studentVO[1].getName());
		System.out.println(studentVO[2].getName());
		
		for(StudentVO st : studentVO) {
			System.out.println(st.getName());
		}

	}

}
