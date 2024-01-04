/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
    static int year = 1900;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
        int chosenYear = Integer.parseInt(args[0]);
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (month!=1 || dayOfMonth!=1 || year!=chosenYear-1) {
	 		//// Write the body of the while 		
	 		advance();
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		// if (debugDaysCounter == 620) { 
	 		// 	break;
	 		// }
        }
	 	//// Write the necessary ending code here
        while (month!=1 || dayOfMonth!=1 || year!=chosenYear+1) {
			String date =dayOfMonth + "/" + month + "/" + year;
			boolean isSunday = (dayOfWeek==1);
			
			if (isSunday) {
				date += " Sunday";
				if(dayOfMonth==1){
				}
				
			}
			System.out.println(date);
	 		//// Write the body of the while 		
	 		advance();

	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		// if (debugDaysCounter == 620) { 
	 		// 	break;
	 		// }
        }
	 
     
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if(dayOfMonth==nDaysInMonth){
			dayOfMonth=1;
		}
		else{
			dayOfMonth++;
		}
		
		if(dayOfMonth==1){
			if(month==12){
				month = 1;
			}
			else{
				month++;
			}
			
		}
		if (month==1 && dayOfMonth==1){
			year++;
		}

		if(dayOfWeek==7){
			dayOfWeek=1;
		}
		else{
			dayOfWeek++;
		}
		
		if(nDaysInMonth!=nDaysInMonth(month, year)){
			nDaysInMonth=nDaysInMonth(month, year);
		}

		// Replace this comment with your code
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
		boolean leapYear;
		leapYear = (year % 4 == 0);
		leapYear = leapYear && (year % 100 != 0 || year % 400 == 0);
	    // Replace the following statement with your code
		return leapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		int days;
		boolean leapYear = isLeapYear(year);
			if(month==2){
				if(leapYear){
					days = 29;
				}
				else{
					days = 28;
				} 
			}
			else if(month==4 || month==6 || month==9 || month==11){
				days = 30;
			}
			else{
				days = 31;
			}

		return days;
	}
}
