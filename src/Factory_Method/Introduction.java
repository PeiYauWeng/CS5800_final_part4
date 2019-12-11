package Factory_Method;

public class Introduction {
	public static void main(String[] args) {
		JobsFactory jobsFactory = new JobsFactory();
		
		Jobs financial_analyst = jobsFactory.introduceJobs("financial analyst");
		financial_analyst.work();
		System.out.println("");
		
		Jobs programmer = jobsFactory.introduceJobs("programmer");
		programmer.work();
		System.out.println("");
		
		Jobs zoo_manager = jobsFactory.introduceJobs("zoo manager");
		zoo_manager.work();
	}
}
