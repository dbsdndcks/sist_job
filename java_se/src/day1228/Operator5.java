/*
�Ϲݳ� : ���� ���� ���� �����ڸ� �ٿ��� ���ؾ� �� ��
&&(AND) : ���װ� ������ ��� true�� �� �� true ��ȯ.
||(OR): ���װ� ������ ��� flase�� �� �� false ��ȯ.

��Ʈ�� : ��Ʈ�� ����
& ( AND ): ������Ʈ�� ���� ��Ʈ�� ��� 1�϶��� 1����.
| ( OR ): ������Ʈ�� ���� ��Ʈ�� ��� 1�϶��� 0����.
^ ( XOR ): ������Ʈ�� ���� ��Ʈ�� ���� �ϳ���1�϶��� 1����
*/
package day1228;
class Operator5
{
	public static void main(String[] args) 
	{
		boolean flag=true, flag2 = false, flag3 = true, flag4 = false;

		System.out.println("----------AND---------");
		System.out.println(flag + " && " + flag3 + " = " + (flag && flag3));
		System.out.println(flag + " && " + flag2 + " = " + (flag && flag2));
		System.out.println(flag2 + " && " + flag4 + " = " + (flag2 && flag4));
		System.out.println(flag2 + " && " + flag + " = " + (flag2 && flag));

		System.out.println("----------OR---------");
		System.out.println(flag + " || " + flag3 + " = " + (flag || flag3));
		System.out.println(flag + " || " + flag2 + " = " + (flag || flag2));
		System.out.println(flag2 + " || " + flag4 + " = " + (flag2 || flag4));
		System.out.println(flag2 + " || " + flag + " = " + (flag2 || flag));
		
		System.out.println("-------------------");
		flag=false;
		flag2 = false;
		flag3 = false;

		flag3 = (flag = 3 > 2)&&(flag2 = 5 < 6);
		System.out.println(flag + " && " + flag2 + " = " +  flag3);
		System.out.println("-------------------");

		int octalNum = 7;
		if(octalNum >= 0 && octalNum <= 7){
			System.out.println(true);
	    }else{
			System.out.println(false);
		}

		int i = 37, j = 14;
		System.out.println( i + " & " + j + " = " + (i & j) );
		System.out.println( i + " | " + j + " = " + (i | j) );
		System.out.println( i + " ^ " + j + " = " + (i ^ j) );
		/*
		0010 0101
		&
		0000 1110
		-----------
		0100(2) = 4(10)

		0010 0101
		|
		0000 1110
		-----------
		0010 1111(2) = 47(10)

		0010 0101
		^
		0000 1110
		-----------
		0010 1011(2) = 43(10)
		*/		
		}
}
