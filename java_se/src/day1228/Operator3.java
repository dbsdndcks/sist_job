/*
����Ʈ ������
<< : left shift - ��Ʈ�� �������� �а�, �о ��ĭ�� �׻� 0���� ä���.
>> : right shift - ��Ʈ�� ���������� �а�, �о ��ĭ�� �ֻ��� ��ȣ��Ʈ�� ���� ����� 0, ������ 1�� ä���
>>> : unsigned rigt shift : ��Ʈ�� ���������� �а� , �о ��ĭ�� �׻� 0���� ä���.
*/
package day1228;
class Operator3 {
	public static void main(String[] args) {
		int i = 5;
		//0000 0101 -> 0010 1000
		System.out.println(i + " << 3 = " + (i <<3));

		i = 35;
		//35 >> 2; ->  0010 0011 -> 0000 1000 -> 8
		System.out.println(i + " >> 2 = " + (i >> 2));

		i = 60;
		//60 >> 4; -> 0011 1100 -> 0000 0011 -> 3
		System.out.println(i + " >> 4 = " + (i >> 4));

		i = 75;
		//75 >> 2 -> 0100 1011 -> 0001 0010 -> 18
		System.out.println(i + " >> 2 = " + (i >> 2));

		i = 29;
		//29 >> 1 -> 0001 1101 -> 0000 1110 -> 14
		System.out.println(i + " >> 1 = " + (i >> 1));

		i = 1;

		System.out.println(i + " << 31 = " + (i << 31));
		System.out.println(i + " << 31 = " + (i << 32));
		System.out.println(i + " << 31 = " + (i << 33));

		i = -1;
		System.out.println(i + " >> 5 = " + (i >> 5));

		System.out.println(i + " >>> 1 = " + (i >>> 1));
	}
}
