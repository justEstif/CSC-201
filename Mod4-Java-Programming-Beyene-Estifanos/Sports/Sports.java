public class Sports{
  private double numberOfPlayers;
  private double numberOfTeams;
  private boolean teamSport = true;
  private String biggestTournment;
  public Sports(){
  }
  public Sports(double numberOfPlayers, double numberOfTeams, 
	String biggestTournment, boolean teamSport){
    this.numberOfPlayers = numberOfPlayers;
    this.numberOfTeams = numberOfTeams;
    this.biggestTournment = biggestTournment;
  }
  public double getnumberOfPlayers(){
    return numberOfPlayers;
  }
  public void setnumberOfPlayers(double numberOfPlayers){
    this.numberOfPlayers = numberOfPlayers;
  }
  public double getnumberOfTeams(){
	    return numberOfTeams;
  }
  public void setnumberOfTeams(double numberOfTeams){
	  this.numberOfTeams = numberOfTeams;
  }
  public boolean isTeamSport(){
	    return teamSport;
  }
  public void setTeamSport(boolean teamSport){
	  this.teamSport = teamSport;
  }
  public String getBiggestTournment() {
	  return biggestTournment;
  }
  public void setBiggestTournment(String biggestTournment) {
	  this.biggestTournment = biggestTournment;
  }
  public String toString() {
	  return numberOfTeams + " teams with " + numberOfPlayers 
			  + " players compete against each other. \nAlthough "
			  + "there are many tournements " + biggestTournment 
			  + " is the biggest.";
  }
}
