package suanfa;
/*
��Ŀ����ӡ�����е�"ˮ�ɻ���(narcissus number)"����ν"ˮ�ɻ���"��ָһ����λ����
���λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ�� */
public class NarcissusNum {
	static int b,bb,bbb;
	public static void main(String[] args){
		for(int num=101;num<1000;num++){
			NarcissusNum tnn = new NarcissusNum();
			tnn.f(num);
		}
	}
	public void f(int m){
		bbb=m/100;//��λ
		bb=(m%100)/10;//ʮλ
		b=(m%100)%10;//��λ
		if((bbb*bbb*bbb+bb*bb*bb+b*b*b)==m){
			System.out.println("ˮ�ɻ��� "+m);
		}
	}
}
