package day0116;
/**
 * 숙제 1번.
 * day0116 person을 상속받는 자신 이름의 클래스를 생성하고
 * 자신이 가장 잘하는 일을 method로 정의한 후에 객체 생성하여 사용해 보세요.
 * 숙제 2번.
 * 아래의 데이터를 저장할 수 있는 객체를 만들고 값을 입력한다.
 * 고한별,서울시 강남구 역삼동 , 25
 * 김도원, 경기도 수원시 영통구 영통동 , 20
 * 김동섭, 서울시 강남구 서초동 ,28
 * 정명호 ㅡ 마계인천시 부평구 부평동,26
 * 양수민, 경기도 부천시 부천동 , 25
 * 진수현,서울시 동대문구 동대문동,27
 * 수연, 서울시 구로구 구로동, 26
 * -값을 출력
 * 이름 주소 나이
 * 이름에 "수"가 들어가는 사람들의 수를 출력하시오 : 4
 * 서울시에 살고 있는 사람을출력 : 4
 * 나이의 합산을 출력하시오
 */
public class Homework {
	
	static int num = 0;
	static int num1 = 0;
	static int sum = 0;
	
	public static int isSue(Member member) {
		if(member.getName().contains("수")) {
			num++;
		}
		return num;		
	}
	
	public static int liveSeoul(Member member) {
		if(member.getAddr().contains("서울시")) {
			num1++;
		}
		return num1;
	}
	
	public static int sumAge(Member member) {
		sum += member.getAge();
		return sum;
	}
	
	
	public static void main(String[] args) {
		Member[]member = new Member[7];
		member[0] = new Member("고한별","서울시 강남구 역삼동",25);
		member[1] = new Member("김도원", "경기도 수원시 영통구 영통동",20);
		member[2] = new Member("김동수" ,"서울시 강남구 서초동",28);
		member[3] = new Member("정명호","마계인천시 부평구 부평동",26);
		member[4] = new Member("양수민","경기도 부천시 부천동",25);
		member[5] = new Member("진수현","서울시 동대문구 동대문동",27);
		member[6] = new Member("수연","서울시 구로구 구로동",26);
		

		for(Member mem : member) {
			System.out.printf("이름:%s\t주소:%s\t나이:%d\n",mem.getName(),mem.getAddr(),mem.getAge());
			isSue(mem);
			liveSeoul(mem);
			sumAge(mem);
		}
		System.out.println(num +"명");
		System.out.println(num1 +"명");
		System.out.println(sum);
	
	}
}
