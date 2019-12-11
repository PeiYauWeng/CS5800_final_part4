package Factory_Method;

public class JobsFactory {
	public Jobs introduceJobs(String job) {
		if (job.equals(null))
			return null;
		if(job.equals("financial analyst")) {
			System.out.println("financial analyst introduces:");
			return new FinancialAnalyst();
		}
		else if(job.equals("programmer")) {
			System.out.println("programmer introduces:");
			return new Programmer();
		}
		else if(job.equals("zoo manager")) {
			System.out.println("zoo manager introduces:");
			return new ZooManager();
		}
		return null;		
	}
}
