package fi.piet;

import junit.framework.TestCase;

import org.junit.Test;

public class TennisGameTest extends TestCase {

	TennisGame game = new TennisGame("Jarkko Nieminen", "Pete Sampras");
	
	@Test
	public void testNewGameShouldReturnLoveAll() {
		assertEquals("love all", game.getScore());
	}
	
	@Test
	public void testPlayer1ScoresFirstPointReturnsFifteenAll() {
		game.playerOneScores();
		
		assertEquals("fifteen, love", game.getScore());
	}
	
	@Test
	public void testFifteenAll(){
		game.playerOneScores();
		game.playerTwoScores();

		assertEquals("fifteen all", game.getScore());
	}
	
	@Test
	public void testThirtyFifteen() {
		game.playerOneScores();
		game.playerTwoScores();
		game.playerOneScores();
		
		assertEquals("thirty, fifteen", game.getScore());
	}
	
	@Test
	public void testPlayerTwoWinsFirstTwoBalls() {
		game.playerTwoScores();
		game.playerTwoScores();

		String score = game.getScore();
		assertEquals("love, thirty", score);
	}
}
