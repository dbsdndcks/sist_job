package day1228;
/*
단항 연산자 : 연산에 필요한 항이 하나인 연산자.
~, !, +, -, ++ , --
*/
class Operator1 
{
	public static void main(String[] args) 
	{
		// ~ : tilde -1의 보수 연산
		// ~양수 : 부호변경 1증가, ~음수 : 부호변경 1감소
		int i=10, j=-10;
		System.out.println(i+" "+~i + " " + j + " " + ~j+ "\n");

		i = 12;
		j = 28;
		System.out.println(i + " < " + j + " = " + (!(i < j))+ "\n");

		boolean flag1 = true, flag2 = false;
		System.out.println(flag1 + " " + !flag1);
		System.out.println(flag2 + " " + !flag2+ "\n");

		i = 12;
		j = -12;
		System.out.println(-i + " " + -j + "\n");
		
		i = 5;
		j = 10;
		System.out.println("전위연산");
		System.out.println("++i :" + ++i + " ++j :" + ++j);
		System.out.println("후위연산 반영전");
		System.out.println("i++ :" + i++ + " j++ :" + j++);
		System.out.println("후위연산 반영후");
		System.out.println("i :" + i + " j :" + j +"\n");

		//전위와 후위는 대입연산과 함께 사용되면 각자 다른 값을 대입한다.
		 i = 10;
		int result = 0;
		
		//전위연산 : 내 것 먼저, (단항을 수행한 후 대입을 수행)
		result = ++i;
		System.out.println(result + " " + i);

		//후위연신 : 남의 것 먼저. (대입 후 단항을 수행 )
		result = i++;
		System.out.println(result + " " + i +"\n");

		i = 10;
		j = 10;
		//System.out.println("전위 : " + ++i + " 후위 : " + j++);
		System.out.println("호출후 i : " + i + " j : " + j);

		System.out.println(~i+1);
	}


}

