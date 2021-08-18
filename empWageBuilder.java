package Demo;

public class empWageBuilder {
final static int IS_PRESENT_FULL_TIME = 1;
	final static int IS_PRESENT_HALF_TIME = 2;
	public static String company;
	public static int empRatePerHour;
	public static int numOfWorkingDays;
	public static int maxHoursPerMonth;
	public static int totalEmpWage;
	/*
	 * Parameterized Constructor to set the values.
	 * @parameters are the values which you want when initializing an object
	 */
	
	public empWageBuilder(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	/*
	 * This method calculates the wage. 
	 */
	public static void calculateWage(){
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		while (totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
		{
			totalWorkingDays++;
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		
		switch(empCheck) 
		
		{
			case IS_PRESENT_FULL_TIME :
			empHrs=8;
			break;
		
			case IS_PRESENT_HALF_TIME :
			empHrs=4;
			break;
		
			default:
				empHrs=0;
			break;
			
		}
		totalEmpHrs += empHrs;
		System.out.println("Day :"+totalWorkingDays+ " Emp Hr:"+empHrs);
	}
		 totalEmpWage=totalEmpHrs*empRatePerHour;
		System.out.println("Total EmpWage for company "+company+" is : "+totalEmpWage);
	
	}
	public static void main(String[] args) {

		//creating object
		empWageBuilder jio=new empWageBuilder("jio", 20, 3, 4);
		jio.calculateWage();

		empWageBuilder airtel=new empWageBuilder("airtel",30,3,5);
		airtel.calculateWage();
		
}
}
