
public class Soccer extends Sports{
	private double heightOfGoal = 2.44;
	private double widthOfGoal = 7.32;
	public Soccer(double numberOfPlayers, double numberOfTeams, 
			String biggestTournment, boolean teamSport) {
		setnumberOfPlayers(numberOfPlayers);
		setnumberOfTeams(numberOfTeams);
		setBiggestTournment(biggestTournment);
		setTeamSport(teamSport);
	}
	public double getHeightOfGoal() {
		return heightOfGoal;
	}
	public double getWidthOfGoal() {
		return widthOfGoal;
	}
	public double getArea() {
		return widthOfGoal * widthOfGoal;
	}
	
}
