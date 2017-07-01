public class LeapYear{
	
	//int year = 2000;
	static boolean isLeapYear(int year) {
		if (year%400 == 0 ) {
		return true;
		}	
		else
		{
			int reminder1 = year%4;
			int reminder2 = year%100;
			if (reminder1 == 0 && reminder2 != 0) {
				return true;
			}
			else
			{
				return false;
			}
		}
   	}

	public static void main(String[] args) {
		if (args.length < 1) {
        	System.out.println("Please enter command line arguments.");
           	System.out.println("e.g. java Year 2000");
       	}
       	for (int i = 0; i < args.length; i++) {
           	try {
               	int year = Integer.parseInt(args[i]);
               	checkLeapYear(year);
           	} catch (NumberFormatException e) {
               	System.out.printf("%s is not a valid number.\n", args[i]);
           	}
       	}
    }

    private static void checkLeapYear(int year) {
    	if (isLeapYear(year)) {
        	System.out.printf("%d is a leap year.\n", year);
    	} else {
        	System.out.printf("%d is not a leap year.\n", year);
    	}
    }
}