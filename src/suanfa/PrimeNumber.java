package suanfa;
/*
* ���� ��ˮ����
��Ŀ���ж�101-200֮���ж��ٸ���������������������� 
1.����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� 
���������������������֮�������� */
public class PrimeNumber {
	public static int count = 0;
	public static void main(String[] args){
		for(int i=101;i<200;i++){
			boolean b = true;//������־ ��
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					b=false;//������־ ��
					break;
				}
			}
			if(b){
				count++;
				System.out.println(i+" ");
			}
		}
		System.out.println("/n�����ĸ�����"+count);
	}
}
