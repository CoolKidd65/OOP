package candidates;

public class Election {
	private Candidates c1, c2, c3, c4, c5;
	String winner;
	int highest;
	public Election() {
		this.c1 = new Candidates();
		this.c2 = new Candidates();
		this.c3 = new Candidates();
		this.c4 = new Candidates();
		this.c5 = new Candidates();
	}
	
	public Election(Candidates c1, Candidates c2, Candidates c3, Candidates c4, Candidates c5) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
	}
	
	public int totalVotes() {
		return c1.getVotes() + c2.getVotes() + c3.getVotes() + c4.getVotes() + c5.getVotes();
	}
	
	public double percentage(int votes, int totalVotes) {
		return (votes * 100.0) / totalVotes;
	}
	
	public void setPercent() {
		this.c1.setPercentage(percentage(c1.getVotes(), totalVotes()));
		this.c2.setPercentage(percentage(c2.getVotes(), totalVotes()));
		this.c3.setPercentage(percentage(c3.getVotes(), totalVotes()));
		this.c4.setPercentage(percentage(c4.getVotes(), totalVotes()));
		this.c5.setPercentage(percentage(c5.getVotes(), totalVotes()));

	}
	
	public String getWinner() {
		this.highest = 0;
		this.winner = "";
		
		if (c1.getVotes() >= highest) {
			highest = c1.getVotes();
			winner = c1.getName();
		}
		
		if (c2.getVotes() >= highest) {
			highest = c2.getVotes();
			winner = c2.getName();
		}
		
		if (c3.getVotes() >= highest) {
			highest = c3.getVotes();
			winner = c3.getName();
		}
		
		if (c4.getVotes() >= highest) {
			highest = c4.getVotes();
			winner = c4.getName();
		}
		
		if (c5.getVotes() >= highest) {
			highest = c5.getVotes();
			winner = c5.getName();
		}
		return winner;
	} 
}
/*
public static void main(String[] args) { <- add import import java.util.Scanner;

Scanner input = new Scanner(System.in);

Candidates c1 = new Candidates();
Candidates c2 = new Candidates();
Candidates c3 = new Candidates();
Candidates c4 = new Candidates();
Candidates c5 = new Candidates();

System.out.println("Enter name of Candidate 1: ");
c1.setName(input.nextLine());
System.out.println("Enter votes of Candidate 1: ");
c1.setVotes(input.nextInt());
input.nextLine(); // consume leftover newline

System.out.print("Enter name of Candidate 2: ");
c2.setName(input.nextLine());
System.out.print("Enter votes of Candidate 2: ");
c2.setVotes(input.nextInt());
input.nextLine();

System.out.print("Enter name of Candidate 3: ");
c3.setName(input.nextLine());
System.out.print("Enter votes of Candidate 3: ");
c3.setVotes(input.nextInt());
input.nextLine();

System.out.print("Enter name of Candidate 4: ");
c4.setName(input.nextLine());
System.out.print("Enter votes of Candidate 4: ");
c4.setVotes(input.nextInt());
input.nextLine();

System.out.print("Enter name of Candidate 5: ");
c5.setName(input.nextLine());
System.out.print("Enter votes of Candidate 5: ");
c5.setVotes(input.nextInt());

Election election = new Election(c1, c2, c3, c4, c5);

System.out.println("\n=== ELECTION RESULTS ===");
System.out.println("Total Votes: " + election.totalVotes());
System.out.println("Winner: " + election.getWinner());

input.close();
}
}
*/