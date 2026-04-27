package candidates;

public class Candidates {

	private String name;
	private int votes;
	private double percentage;
	
	public Candidates() {
		this.name = "";
		this.votes = 0;
		this.percentage = 0;
	}
	public Candidates(String name, int votes) {
		this.name = name;
		this.votes = votes;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setVotes(int votes) {
		this.votes = votes;
	}	
	public void setPercentage(double percentage)
	{
		this.percentage = percentage;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getVotes() {
		return votes;
	}
	
	public double getPercentage() {
		return percentage;
	}
}
