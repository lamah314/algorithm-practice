package algorithms.easy;

public class AngryProfessor {

	static String angryProfessor(int k, int[] a) {
        int counter=0;
        String answer;
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= 0) {
                counter++;
            }
        }
        if (counter >= k){
            answer = "NO";
        } else {
            answer = "Yes";
        }
        
        return answer;
    }
	
}
