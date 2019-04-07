package algorithms.easy;

import java.util.Arrays;

public class ManualTesting {

	public static void main(String[] args) {
		int M = 3;
		int[] a = { 1, 3, 5};
		int[] b = new int[6];
		b[0] = 6;
		b[1] = 5;
		b[2] = 4;
		int[] answer = new int[2 * M];
        for (int i = 0; i < M; i++) {
            answer[i] = a[i];
        }
        for (int j = 0; j < M; j++) {
            answer[j + M] = b[j];
        }
        Arrays.sort(answer);
        String answerString = String.valueOf(answer[0]);
        for (int i = 1; i < (2*M); i++){
            
            answerString += " ";
            
            answerString += String.valueOf(answer[i]);
        }
        System.out.println(answerString);

	}
	
	

}
