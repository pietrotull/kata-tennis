package fi.piet;

public class TennisGame {
	
	String[] scoresAsStrings = new String[] { "love", "fifteen", "thirty", "fourty" };
	
	final String player1;
	final String player2;
	
	int playerOneScore = 0;
	int playerTwoScore = 0;

	public TennisGame(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void playerOneScores() {
		playerOneScore++;
	}
	
	public void playerTwoScores() {
		playerTwoScore++;
	}

	public String getScore() {
		if (isGameEndingScore()) {
			return getLeader() + " wins!";
		} else if (playerOneScore == playerTwoScore) {
			return buildEvenScore();
		} else {
			return buildBasicScore();
		}
	}

	private String getLeader() {
		return playerOneScore > playerTwoScore ? player1 : player2;
	}

	private boolean isGameEndingScore() {
		return isAdvantageScore() && Math.abs(playerOneScore - playerTwoScore) >= 2; 
	}

	private String buildEvenScore() {
		if (playerOneScore > 3) {
			return "deuce";
		}
		return scoresAsStrings[playerOneScore] + " all";
	}

	private String buildBasicScore() {
		if (isAdvantageScore()) {
			return "advantage " + getLeader();  
		}
		return scoresAsStrings[playerOneScore] + ", " + scoresAsStrings[playerTwoScore];
	}

	private boolean isAdvantageScore() {
		return playerOneScore > 3 || playerTwoScore > 3;
	}
}
