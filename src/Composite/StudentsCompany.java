package Composite;

public class StudentsCompany {
	public static void main(String[] args) {
		Students gary = new Students("Gary", "Computer Science", "A");
		Students wendy = new Students("Wendy", "Biotechnology", "A");
		Students peggie = new Students("Peggie", "Industrial Engineering", "B");
		Students martin = new Students("Martin", "Electrical Engineering", "B");
		Students eva = new Students("Eva", "Health Care Analysis", "C");
		Students james = new Students("James", "Chemistrial Enginerring", "A");
		Students roger = new Students("Roger", "Economy", "B");
		
		wendy.addTeammate(peggie);
		wendy.addTeammate(eva);
		
		martin.addTeammate(roger);
		martin.addTeammate(james);
		
		gary.addTeammate(wendy);
		gary.addTeammate(martin);
		
		System.out.println("Team leader: "+gary);
		for(Students leader: gary.getTeammate()) {
			System.out.println("Sub leader: "+leader);
			for(Students teammate: leader.getTeammate())
				System.out.println("teammate: "+teammate);
		}
	}
}
