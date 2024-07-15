package day0118;

public class SuperInterImlp implements SuperInter{

	
	@Override
	public String toDay() {
		// TODO Auto-generated method stub
		return "끼얏호 목요일";
	}
	
	public static void main(String[] args) {
		SuperInterImlp imlp = new SuperInterImlp();
		System.out.println(imlp.toDay());
	}
}
