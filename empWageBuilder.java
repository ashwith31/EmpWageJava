package Demo;

public class empWageBuilder {
final static int IS_PRESENT_FULL_TIME = 1;
	final static int IS_PRESENT_HALF_TIME = 2;
	final static int WAGE_PER_HR=20;
	final static int FULL_DAY_HR=8;
	final static int PART_TIME_HR=4;
	final static int WORKING_DAYS=20;
	public static void calculateWage(String company,int empRatePerHour,int numOfWorkinkingDays,int maxHoursPerMonth){
		int empHrs=0;
		int totalEmpHrs=0;
		int day=0;
		int totalWorkingDays=0;
		while (totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkinkingDays)
		{
			totalWorkingDays++;
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		
		switch(empCheck) 
		
		{
			case IS_PRESENT_FULL_TIME :
			empHrs=FULL_DAY_HR;
			break;
		
			case IS_PRESENT_HALF_TIME :
			empHrs=PART_TIME_HR;
			break;
		
			default:
				empHrs=0;
			break;
			
		}
		totalEmpHrs += empHrs;
		System.out.println("Day :"+totalWorkingDays+ " Emp Hr:"+empHrs);
	}
		int totalEmpWage=totalEmpHrs*empRatePerHour;
		System.out.println("Total EmpWage for company "+company+" is : "+totalEmpWage);
	
	}
	public static void main(String[] args) {

		calculateWage("Abc",20,10,5);
		
}
}
