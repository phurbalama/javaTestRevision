
public class OneTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[2];
		arr[0] = 3;
		System.out.println(arr[0]);
		
		int arr1[][] = {{2,1,1},{1,23,3},{1,5,5}};
		
		for (int i = 0; i < 3;i++) {
			for(int j = 0; j< 3;j++) {
				System.out.print(arr1[i][j] + " ");
			}
		}
	}

}
