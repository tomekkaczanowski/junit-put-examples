package com.practicalunittesting.chp04.footballteam;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

	private static final int ANY_NUMBER = 123;

	public Object[] nbOfGamesWon() {
		return $(0, 1, 2);
	}

	@Test
	@Parameters(method = "nbOfGamesWon")
	public void constructorShouldSetGamesWon(int nbOfGamesWon) {
		FootballTeam team = new FootballTeam(nbOfGamesWon);
		//assertEquals(nbOfGamesWon, team.getGamesWon(), 3);
		assertEquals(nbOfGamesWon + " games passed to constructor, " +
				"but " + team.getGamesWon() + " were returned",
				nbOfGamesWon, team.getGamesWon());
	}

	public Object[] illegalNbOfGamesWon() {
		return $(-10, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "illegalNbOfGamesWon")
	public void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
		new FootballTeam(illegalNbOfGames);
	}

	@Test
	public void shouldBePossibleToCompareTeams() {
		FootballTeam team = new FootballTeam(ANY_NUMBER);
		assertTrue("Should be possible to compare teams", team instanceof Comparable);
	}

	@Test
	public void teamWithMoreMatchesWonShouldBeGreater() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		//assertTrue(team_3.compareTo(team_2) > 0);
		assertTrue("team with " + team_3.getGamesWon() + " games won should be ranked before " +
				"team with " + team_2.getGamesWon() + " games won",
				team_3.compareTo(team_2) > 0);
	}

	@Test
	public void teamsWithLessMatchesWonShouldBeLesser() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		//assertTrue(team_3.compareTo(team_2) > 0);
		assertTrue("team with " + team_2.getGamesWon() + " games won should be ranked after " +
				"team with " + team_3.getGamesWon() + " games won",
				team_2.compareTo(team_3) < 0);
	}

	@Test
	public void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
		FootballTeam teamA = new FootballTeam(2);
		FootballTeam teamB = new FootballTeam(2);
		//assertTrue(team_3.compareTo(team_2) > 0);
		assertTrue("both teams have won the same number of games: " +
				"" + teamA.getGamesWon() + " vs. " + teamB.getGamesWon() + " and should be ranked equal",
				teamA.compareTo(teamB) == 0);
	}
}
