package com.qsp.practiceEnum;

public class MainClass {
	public static void main(String[] args) {
		Month month = Month.JUL;
		switch (month) {
		case JAN:
		case MAR:
		case MAY:
		case JUL:
		case AUG:
		case OCT:
		case DEC:
			System.out.println("31 days");
			break;
		case APR:
		case JUN:
		case SEP:
		case NOV:
			System.out.println("30 days");
			break;
		case FEB:
			System.out.println("28 or 29 days");
			break;

		}
	}
}

/**
 * <pre>
 * OUTPUT
 *28 or 29 days
 * </pre>
 */
