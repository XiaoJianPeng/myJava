public class FactorialDemo1 {
	public static void main (String[] args) {
		int total = 0;
		total = getResule(3);
		System.out.println("阶乘结果为："+total);
	}
	
	/**
	*求N个数的阶乘之和 ,常用方法
	*/
	public static int getResule(int n) {
		int total = n;
		if(n>0) {
			for(int i =n-1; i >0; i --) {
				System.out.println("total:"+total+";i:"+i);
				total = total*i;
			}
			total +=getResule(n-1);
		}
		return total;
	}
	
	
}