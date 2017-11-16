package suanfa;
/*
题目：打印出所有的"水仙花数(narcissus number)"，所谓"水仙花数"是指一个三位数，
其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。 */
public class NarcissusNum {
	static int b,bb,bbb;
	public static void main(String[] args){
		for(int num=101;num<1000;num++){
			NarcissusNum tnn = new NarcissusNum();
			tnn.f(num);
		}
	}
	public void f(int m){
		bbb=m/100;//百位
		bb=(m%100)/10;//十位
		b=(m%100)%10;//个位
		if((bbb*bbb*bbb+bb*bb*bb+b*b*b)==m){
			System.out.println("水仙花数 "+m);
		}
	}
}
