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

	public String getScore() {
		if (playerOneScore == playerTwoScore) {
			return buildEvenScore();
		} else {
			return buildBasicScore();
		}
	}

	private String buildEvenScore() {
		return scoresAsStrings[playerOneScore] + " all";
	}

	private String buildBasicScore() {
		String oneScore = scoresAsStrings[playerOneScore];
		String twoScore = scoresAsStrings[playerTwoScore];
		return oneScore + ", " + twoScore;
	}
	
	public void playerOneScores() {
		playerOneScore++;
	}
	
	public void playerTwoScores() {
		playerTwoScore++;
	}
}
