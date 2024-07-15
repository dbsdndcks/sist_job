package day0102;
class Operator6
{
	public static void main(String[] args) 
	{
		int num = 10;
		System.out.println(num + "�� " + ( num >= 0 ? "���" : "����" ) + " �Դϴ�.");

		System.out.println(num + "�� " + ( num % 2 == 0 ? "¦��" : "Ȧ��" ) + " �Դϴ�.");

		System.out.println(num + "�� " + ( (0 <= num)&&(num <= 100) ? "��ȿ����" : "��ȿ����" ) + " �Դϴ�.");
		
	}
}
