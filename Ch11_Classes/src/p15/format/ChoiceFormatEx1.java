package p15.format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
	public static void main(String[] args) {

		double[] limits = { 60, 70, 80, 90 }; // int가 double로 자동형변환
		String[] grades = { "D", "C", "B", "A" };
		int[] scores = { 100, 95, 88, 70, 52, 60, 70 };

		ChoiceFormat c = new ChoiceFormat(limits, grades);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " : " + c.format(scores[i]));
		}

	}

}
