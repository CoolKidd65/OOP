package candidates;

public class ElectionTest {
	
	public static void main(String[] args) {
		
	Candidates c1 = new Candidates();
	Candidates c2 = new Candidates();
	Candidates c3 = new Candidates();
	Candidates c4 = new Candidates();
	Candidates c5 = new Candidates();
	
	Election election = new Election(c1, c2, c3, c4, c5);
	
	c1.setName("1");
	c2.setName("2");
	c3.setName("3");
	c4.setName("4");
	c5.setName("5");
	
	c1.setVotes(1275000);
	c2.setVotes(85400);
	c3.setVotes(1110600);
	c4.setVotes(865400);
	c5.setVotes(673200);
	
	
	election.setPercent();
	

	System.out.println("Candidate: " + c1.getName() + "\nVotes: " + c1.getVotes() + "\n % of Total Sales " + String.format("%.2f", c1.getPercentage()) + "%");
	
	System.out.println("Candidate: " + c2.getName() + "\nVotes: " + c2.getVotes() + "\n % of Total Sales " + String.format("%.2f", c2.getPercentage()) + "%");

	System.out.println("Candidate: " + c3.getName() + "\nVotes: " + c3.getVotes() + "\n % of Total Sales " + String.format("%.2f", c3.getPercentage()) + "%");

	System.out.println("Candidate: " + c4.getName() + "\nVotes: " + c4.getVotes() + "\n % of Total Sales " + String.format("%.2f", c4.getPercentage()) + "%");
	
	System.out.println("Candidate: " + c5.getName() + "\nVotes: " + c5.getVotes() + "\n % of Total Sales " + String.format("%.2f", c5.getPercentage()) + "%");

	
	System.out.println("\nWinner: " + election.getWinner());
	System.out.println("Total votes: " + election.totalVotes());
	}
}
