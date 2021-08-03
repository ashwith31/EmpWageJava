package Demo;

public class empWageBuilder {

	public static void main(String[] args) {

		int IS_PRESENT_FULL_TIME =1;
		int IS_PRESENT_HALF_TIME =2;
		int WAGE_PER_HR=20;
		int FULL_DAY_HR=8;
		int PART_TIME_HR=4;
		int salary=0;
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_PRESENT_FULL_TIME)
		{
			salary=FULL_DAY_HR*WAGE_PER_HR;
			System.out.println("The Employee is present Full Time");
			System.out.println("Salary= "+salary);
		}
		else if (empCheck == IS_PRESENT_HALF_TIME)
		{
			salary=PART_TIME_HR*WAGE_PER_HR;
			System.out.println("The Employee is present Part Time");
			System.out.println("Salary= "+salary);
		}
		else
		{
			System.out.println("Employee is absent");;
			System.out.println("Salary = "+salary);
		}


}
}
