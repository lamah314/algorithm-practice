package algorithms.easy;

//Sample Input 0
//
//07:05:45PM
//
//Sample Output 0
//
//19:05:45

public class Convert12HTo24HTime {

	static String timeConversion(String s) {
		String answerTime;
		String answerHour;
		String hour = s.substring(0, 2);
		String middle = s.substring(2, s.length() - 2);
		String amOrPm = s.substring(s.length() - 2, s.length());
		if (hour.equals("12")) {
			if (amOrPm.equals("AM")) {
				answerHour = "00";
			} else {
				answerHour = hour;
			}
		} else {
			if (amOrPm.equals("PM")) {
				answerHour = Integer.toString(Integer.parseInt(hour) + 12);
			} else {
				answerHour = hour;
			}
		}
		answerTime = answerHour + middle;
		return answerTime;
	}
}
