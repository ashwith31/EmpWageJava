package Demo;

public class empWageBuilder {

	public static void main(String[] args) {

		final int IS_PRESENT_FULL_TIME = 1;
		final int IS_PRESENT_HALF_TIME = 2;
		final int WAGE_PER_HR=20;
		final int FULL_DAY_HR=8;
		final int PART_TIME_HR=4;
		final int WORKING_DAYS=20;
		int salary=0;
		int time=0;
		int day=0;
		int totalWorkingHrs=0;
		while (day<WORKING_DAYS && totalWorkingHrs<100)
		{
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		
		switch(empCheck) 
		
		{
			case IS_PRESENT_FULL_TIME :
			time=FULL_DAY_HR;
			totalWorkingHrs=time+totalWorkingHrs;
			break;
		
			case IS_PRESENT_HALF_TIME :
			time=PART_TIME_HR;
			totalWorkingHrs=time+totalWorkingHrs;
			break;
		
			default:
			break;
			
		}
		day++;
	}
		System.out.println("Total Working Hours = "+totalWorkingHrs);
		System.out.println("Total Working Days ="+day);
		salary=totalWorkingHrs*day*WAGE_PER_HR;
		System.out.println("Salary for "+day+" days and "+totalWorkingHrs+" hours is =Rs-"+salary+" /-");
	}
}
