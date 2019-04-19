// 寰幆
class Demo1 {
	public static void main(String[] args) {
		/*
		int i = 1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		
		for(int i =1; i<=100; i++){
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			if (i%2 == 0){
				sum +=i;
			}
		}
		
		System.out.println("偶数和："+sum);
		
		int m =0, n =0;
		while(n<5){
			m =0;
			while(m<5){
				System.out.print("*");
				m++;
			}
			System.out.println();
			n++;
		}
		*/
		
		// 打印乘法口诀
		for(int i =1; i<=9; i++) {
			for(int j =1; j<=9; j++) {
				System.out.print(i+"*"+j+"=" +(i*j)+"  ");
				if(i == j) {
					System.out.println();
					break;
				}
			}
		}
	}
}