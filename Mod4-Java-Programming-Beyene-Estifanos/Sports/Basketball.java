
public class Basketball extends Sports{
	private double radiusOfHoop = 18;
	private double heightOfBoard = 120;
	public Basketball(double numberOfPlayers, double numberOfTeams, 
			String biggestTournment, boolean teamSport) {
		setnumberOfPlayers(numberOfPlayers);
		setnumberOfTeams(numberOfTeams);
		setBiggestTournment(biggestTournment);
		setTeamSport(teamSport);
	}
	public double getRadiusOfHoop() {
		return radiusOfHoop;
	}
	public double getHeightOfBoardl() {
		return heightOfBoard;
	}
	public double getArea() {
		return Math.PI * radiusOfHoop * radiusOfHoop;
	}
	
}
