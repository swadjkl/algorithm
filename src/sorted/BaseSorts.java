package sorted;

import java.util.Random;

public class BaseSorts {
	//插入排序
	public void straightInsertionSort(double[] sorted){
		int sortedLen = sorted.length;
		for(int j = 2;j < sortedLen;j++){
			if(sorted[j]<sorted[j-1]){
				sorted[0] = sorted[j];//先保存后面的值
				sorted[j] = sorted[j-1];//后移
				
				int insertPos = 0;
				for(int k=j-2;k>=0;k--){
					if(sorted[k]>sorted[0]){
						sorted[k+1]=sorted[k];
					}else{
						insertPos = k+1;
						break;
					}
				}
				sorted[insertPos]=sorted[0];
			}
		}
	}
	Random r = new Random();
	//希尔排序
	public void shelllnertionSort(double[] sorted,int inc){
		int sortedLen = sorted.length;
		for(int j=inc+1;j<sortedLen;j++){
			if(sorted[j]<sorted[j-inc]){
				sorted[0] = sorted[j];//先保存一下后面的那个
				int insertPos = j;
				for(int k=j-inc;k>=0;k-=inc){
					if(sorted[k]>sorted[0]){
						sorted[k+inc]=sorted[k];
						if(k-inc<=0){
							insertPos = k;
						}
					}else{
						insertPos = k+inc;
						break;
					}
				}
				sorted[insertPos]=sorted[0];
			}
		}
	}
}
