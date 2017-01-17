/**
 * File Name: Day5InClassExercise.java<br>
 * Mark, Bernard<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 16, 2017
 */
package com.sqa.bm;

import com.sqa.bm.helpers.*;

/**
 * Day5InClassExercise //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mark, Bernard
 * @version 1.0.0
 * @since 1.0
 */
public class Day5InClassExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String appName = "Java Fundamentals";
		String userName = AppBasics.greetUserAndGetName(appName);
		compareNumberTo10();
		whatMonthIsIt();
		checkUserGrade();
		AppBasics.farwellUser(userName, appName);
	}

	private static void checkUserGrade() {
		// TODO Auto-generated method stub
		String input = AppBasics.requestInfoFromUser("Give me a score from 0 to 100");
		int gradeLetter = Integer.parseInt(input);
		if (gradeLetter >= 90) {
			System.out.println("Your grade is an A");
		} else if (gradeLetter >= 80 && gradeLetter <= 89) {
			System.out.println("Your grade is B");
		} else if (gradeLetter >= 70 && gradeLetter <= 79) {
			System.out.println("Your grade is C");
		} else if (gradeLetter >= 60 && gradeLetter <= 69) {
			System.out.println("Your grade is D");
		} else if (gradeLetter >= 50) {
			System.out.println("Your grade is F");
		}
	}

	private static void compareNumberTo10() {
		// TODO Auto-generated method stub
		String input = AppBasics.requestInfoFromUser("Give me a number:");
		int userNumber = Integer.parseInt(input);
		if (userNumber > 10) {
			System.out.println("Number is greater than 10");
		} else if (userNumber < 10) {
			System.out.println("Number is less than 10");
		} else {
			System.out.println("Number is 10!");
		}
	}

	private static void whatMonthIsIt() {
		// TODO Auto-generated method stub
		String input = AppBasics.requestInfoFromUser("Give me number from 1-12");
		int userMonth = Integer.parseInt(input);
		switch (userMonth) {
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is February");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		case 4:
			System.out.println("The month is April");
			break;
		case 5:
			System.out.println("The month is May");
			break;
		case 6:
			System.out.println("The month is June");
			break;
		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
		default:
			System.out.println("You have not entered a valid month");
		}
	}
}
