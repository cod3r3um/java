package day01;

/*
 < �������� ���� >
  				  200   200L   10.5f	10.5
  				  �⺻					�⺻
    1		2	   4	 8		 4		 8 
   byte > short > int > long     				  ����
  							 > float > double	  �Ǽ�
  		  char									  ����
   boolean										  ��
 */

/*
   ctrl + shift + f �� ����
   
   python				java
   --------------------------------------------------------------
  						byte	127					   (1����Ʈ)
   int (����)				short	32000				   (2����Ʈ)
   						int a;  21�� 				   (4����Ʈ)
  						long						   (8����Ʈ)
  
   float (�Ǽ�) 			float   ��ȿ�ڸ��� 6�ڸ�		   (4����Ʈ)
  						double  15�ڸ� (������=���е� 2��)  (8����Ʈ)
  
   str (����) '' 			char (���� �� ����)
    		 "" 		String (���ڿ�)
   
   bool (True/False) 	boolean
 */

public class TypeTest {
	public static void main(String[] args) {
		
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Long.MAX_VALUE);
		int a = 2100000000;
		//long b = 2200000000L;
		
		float f = 0.123456789f;				//��ȿ�ڸ��� 7�ڸ�, �������� �ø���
		System.out.println(f);
		
		double d = 0.1234567890123456789;	//��ȿ�ڸ��� 16�ڸ�, �������� �ø���
		System.out.println(d);
		
		//����ǥ��
		//0���� �����ϸ� 8����
		int b = 0111;
		System.out.println("8���� 111=" +b);

		int b8 = 015 + 04;
		//10������ 8������ ��ȯ
		System.out.println(b8 + " " + Integer.toOctalString(b8));
		//0x�� �����ϸ� 16����			
		int b16 = 0xff;
		System.out.println(b16);
		//0b�� �����ϸ� 2����
		int b2 = 0b1111;
		System.out.println(b2);
		
		//char
		System.out.println("================================");
		char c1 = '��';
		System.out.println((int)c1);			 		//10����
		System.out.println(Integer.toHexString(c1));	//16����
		char c2 = '\uac01';
		int c3 = 44033;
		System.out.println(c2);
		System.out.println((char)c3);
	
	}
	
}
