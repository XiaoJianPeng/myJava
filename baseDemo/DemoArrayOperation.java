class DemoArrayOperation {
	public static void main(String[] args){
		int[] arr = {12,43,22,2,78,98,54,170,60,33,423,87};
		// bubblingSort(arr);
		// reverseArr(arr);
		arrPrint(arr);
	}
	public static void arrPrint(int[] arr) {
		System.out.println("arr:");
		for(int element:arr) {
			System.out.print(element+" ");
		}
	}
	// ð������ ����Ϊ arr.length-1 ,
	// �Ƚϴ���Ϊ arr.length-1 + arr.length-2 ...... arr.length - (arr.length-1)
	public static void bubblingSort(int[] arr) {
		int total = 0;
		int m = 0;
		for(int i =0;i<arr.length-1;i++) {
			for (int j=0;j < arr.length-i-1;j++){
				total++;
				if(arr[j] > arr[j+1]) {
					m=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = m;
				}
			}
			System.out.println("\n��"+i+"��ѭ����");
			arrPrint(arr);
		}
		System.out.println("������"+total +"��");
	}
	
	// �������� todo
	public static void fastSort(int [] arr) {
		int [] left, right;
		int m = arr.length/2;
		int middle = arr[m];
		for (int i =0; i< m;i++){
			if(arr[i] <middle) {
				left.add(arr[i]);
			}
			if(arr[arr.length-1-i]>=m) {
				right.add(arr[arr.length-1-i]);
			}
			if(arr[i]>arr[arr.length -1-i]){
				int temp =arr[i];
				arr[i]=arr[length-1-i];
				arr[length-1-i]=arr[i];
			}
		}
	}
	
	// ���鵹��
	public static void reverseArr(int[] arr) {
		int total = 0;
		int m = 0;
		for(int i =0;i<arr.length/2;i++) {
			total ++;
			m=arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=m;
			System.out.println("\n��"+i+"��ѭ����");
			arrPrint(arr);
		
		}
		System.out.println("\n������"+total +"��");
	}
}