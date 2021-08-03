package Demo;

public class empWageBuilder {

	public static void main(String[] args) {

int IS_PRESENT =1;
		int WAGE_PER_HR=20;
		int FULL_DAY_HR=8;
		int salary=0;
		int empCheck =(int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PRESENT)
		{
			salary=FULL_DAY_HR*WAGE_PER_HR;
			System.out.println(salary);
		}
		else
		{
			System.out.println(salary);;
		}

}
}
