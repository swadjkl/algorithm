package suanfa;
/*
��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣� 
��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21.... 
*/
public class Rabbit {
	public static final int MONTH = 15;
	public static void main(String[] args){
		long f1 = 1L,f2 = 1L;
		System.out.println("��1���µ����Ӷ��� 1");
		System.out.println("��2���µ����Ӷ��� 1");
		long f;
		for(int i=3;i<=MONTH;i++){
			f=f2;
			f2=f1+f2;
			f1=f;
			System.out.print("��"+i+"���µ����Ӷ���");
			System.out.println(" "+f2);
		}
	}
}
