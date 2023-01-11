package 정렬;

public class 삽입정렬 {
	public static void main(String[] args) {
		int arr[] = {4,12,14,23,2,1,};
		int tmp,idx;
		for (int i = 1; i < arr.length; i++) {
				idx =i;
				for (int j = i-1; j >=0; j--) {
					if(arr[idx]<arr[j]) {
						tmp = arr[idx];
						arr[idx] = arr[j];
						arr[j] =tmp;
						idx =j;
						
					}else {
						break;
					}
				}
				
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
