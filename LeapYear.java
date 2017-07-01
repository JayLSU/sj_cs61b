public class LeapYear{
	public static void main(String[] args) {
		int year = 2000;
		if (year%400 == 0 ) {
			System.out.println(year + " is a leapyear!");
		}
		else{
			int reminder1 = year%4;
			int reminder2 = year%100;
			if (reminder1 == 0 && reminder2 != 0) {
				System.out.println(year + " is a leapyear!");
			}
			else
			{
				System.out.println(year + " is not a leapyear!");
			}
		}

	}
}