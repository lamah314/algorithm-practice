package data.structures.easy;

public class Array2DHourglassSum {
	public static int hourglassSum(int[][] arr) {
        int answer=-63;
        int currentSum=0;
        for (int i = 0; i < arr[0].length-2; i++){
            for (int j = 0; j < arr[0].length-2; j++) {
            	currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1];
                currentSum = currentSum + arr[i+2][j]+ arr[i+2][j+1] + arr[i+2][j+2];                
                if (currentSum > answer){
                    answer = currentSum;
                }
                currentSum = 0;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] arr = new int[][] { {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		System.out.println(hourglassSum(arr));
	}
}
