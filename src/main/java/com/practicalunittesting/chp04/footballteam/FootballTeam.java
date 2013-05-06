package com.practicalunittesting.chp04.footballteam;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FootballTeam implements Comparable<FootballTeam> {
	private int gamesWon;

	public FootballTeam(int gamesWon) {
		if (gamesWon < 0) {
			throw new IllegalArgumentException(
					"Not possible to have less than 0 games won! (was + " + gamesWon + ")");
		}
		this.gamesWon = gamesWon;
	}

	public int getGamesWon() {
		return gamesWon;
	}

	@Override
	public int compareTo(FootballTeam otherTeam) {
		return gamesWon - otherTeam.getGamesWon();
	}
}
