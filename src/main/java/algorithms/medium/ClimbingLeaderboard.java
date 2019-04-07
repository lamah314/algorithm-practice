package algorithms.medium;

//Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking. The game uses Dense Ranking, so its leaderboard works like this:
//
//The player with the highest score is ranked number  on the leaderboard.
//Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

//Complete the climbingLeaderboard function in the editor below. It should return an integer array where each element represents Alice's rank after the  game.
//
//climbingLeaderboard has the following parameter(s):
//
//scores: an array of integers that represent leaderboard scores
//alice: an array of integers that represent Alice's scores


public class ClimbingLeaderboard {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] answer = new int[alice.length];
        int currentScore = scores[0];
        int currentPlace = 1;
        for (int j = 0; j < alice.length; j++) {
            if (alice[j] >= currentScore) {
                answer[j] = currentPlace;
            }
        }
        for (int i = 1; i < scores.length; i++) {
            if (currentScore > scores[i]) {
                currentScore = scores[i];
                currentPlace++;
            }
            for (int j = 0; j < alice.length; j++) {
                if (alice[j] >= currentScore && answer[j] == 0) {
                    answer[j] = currentPlace;
                }
            }
        }

        for (int j = 0; j < alice.length; j++) {
                if (answer[j] == 0) {
                    answer[j] = currentPlace+1;
                }
        }

        return answer;

    }
}
