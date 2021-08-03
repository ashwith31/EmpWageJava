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
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		
		switch(empCheck) 
		
		{
			case IS_PRESENT_FULL_TIME :
			System.out.println("The Employee is present Full Time");
			time=FULL_DAY_HR;
			break;
		
			case IS_PRESENT_HALF_TIME :
			System.out.println("The Employee is present Part Time");
			time=PART_TIME_HR;
			break;
		
			default:
			break;
			
		}
		for(int i=1;i<=WORKING_DAYS;i++)
		{
			salary=time*WAGE_PER_HR+salary;
		}
		System.out.println("Salary for a month = "+salary);
	}

}
