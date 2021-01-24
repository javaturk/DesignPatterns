package org.javaturk.dp.ch02.calendar;

public class Calendar {

	public Date nextDay(Date date) {
		int day = date.getDay();
		String month = date.getMonth();
		int year = date.getYear();

		// First check wrong days and months
		if (day > 31) {
			System.out.println("Wrong date entered: " + date);
			System.exit(1);
		}

		if (year < 0) {
			System.out.println("Wrong date entered: " + date);
			System.exit(1);
		}

		if (!isMonthCorrect(month)) {
			System.out.println("Wrong date entered: " + date);
			System.exit(1);
		}

		// February is a special case so ahndle it separately
		if (month.equalsIgnoreCase("February") || month.equalsIgnoreCase("Subat")) {
			if (day == 28) {
				boolean isLeapYear = isLeapYear(year);
				if (isLeapYear)
					day = 29;
				else {
					day = 1;
					month = "March";
				}
			} else if (day == 29) {
				boolean isLeapYear = isLeapYear(year);
				if (isLeapYear) {
					day = 1;
					month = "March";
				} else {
					System.out.println("Wrong date entered: " + date);
					System.exit(1);
				}
			} else if (day == 30 || day == 31) {
				System.out.println("Wrong date entered: " + date);
				System.exit(1);
			} else {
				day++;
			}
			date.setDay(day);
			date.setMonth(month);
			
			return date;
		}

		// For other months
		if (day < 30)
			day++;
		else {
			if (day == 30) {
				day = 1;
				if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("Nisan"))
					month = "May";
				else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("Haziran"))
					month = "July";
				else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Eylul"))
					month = "October";
				else if (month.equalsIgnoreCase("November") || month.equalsIgnoreCase("Kasim"))
					month = "December";

			} else if (day == 31) {
				day = 1;
				if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Ocak"))
					month = "February";
				else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("Mart"))
					month = "April";
				else if (month.equalsIgnoreCase("May") || month.equalsIgnoreCase("Mayis"))
					month = "June";
				else if (month.equalsIgnoreCase("July") || month.equalsIgnoreCase("Temmuz"))
					month = "August";
				else if (month.equalsIgnoreCase("August") || month.equalsIgnoreCase("Agustos"))
					month = "September";
				else if (month.equalsIgnoreCase("October") || month.equalsIgnoreCase("Ekim"))
					month = "November";
				else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Aralik")) {
					month = "January";
					year++;
				}
			}
		}

		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);

		return date;
	}

	private boolean isLeapYear(int year) {
		boolean isLeapYear = false;

		// divisible by 4
		isLeapYear = (year % 4 == 0);

		// divisible by 4 and not 100
		isLeapYear = isLeapYear && (year % 100 != 0);

		// divisible by 4 and not 100 unless divisible by 400
		isLeapYear = isLeapYear || (year % 400 == 0);

		return isLeapYear;
	}

	private boolean isMonthCorrect(String month) {
		boolean isCorrectMonth = false;
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December") ||
			month.equalsIgnoreCase("Ocak") || month.equalsIgnoreCase("Subat") || month.equalsIgnoreCase("Mart") || month.equalsIgnoreCase("Nisan") || month.equalsIgnoreCase("Mayis") || month.equalsIgnoreCase("Haziran") || month.equalsIgnoreCase("Temmuz") || month.equalsIgnoreCase("Agustos") || month.equalsIgnoreCase("Eylul") || month.equalsIgnoreCase("Ekim") || month.equalsIgnoreCase("Kasim") || month.equalsIgnoreCase("Aralik"))
			isCorrectMonth = true;

		return isCorrectMonth;
	}
}
