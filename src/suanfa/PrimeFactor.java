package suanfa;

import java.util.Scanner;

/*
���� ��ˮ����
��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ� 
(2)���n>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ���� 
(3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ���� */
public class PrimeFactor {
	static int n,k=2;
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print(n + "=");
		PrimeFactor pf = new PrimeFactor();
		pf.f(n);
	}
	//���巽��
	public void f(int n){
		while(k<=n){
			if(k==n){//���ֽ��������ڱ���
				System.out.println(n);
				break;
			}else if(n>k&&n%k==0){//�ܱ���������
				System.out.println(k+"*");
				n=n/k;
				f(n);
				break;
			}else if(n>k&&n%k==0){//���ܱ���������
				k++;
				f(n);
				break;
			}
		}
	}
}
