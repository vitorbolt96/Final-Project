public class Game implements GameRM<Game> {

	public final static char WATER_CHAR = ' ';
	public final static char HIT_CHAR = 'X';
	public final static char MISS_CHAR = '•';

	private char[][] playerMatrix;
	private char[][] opponentMatrix;

	public char[][] getPlayerMatrix() {
		// TODO Por implementar
		return null;
	}

	public char[][] getOpponentMatrix() {
		// TODO Por implementar
		return null;
	}

	public String toString() {
		// TODO Por implementar
		return "";
	}

	public void manualPlayAt(int row, int col) {
		// TODO Por implementar
	}

	public void randomPlay() {
		// TODO Por implementar
	}


	public boolean isOver() {
		// TODO Por implementar
		return false;
	}

	public boolean playerWon() {
		// TODO Por implementar
		return false;
	}

	public boolean opponentWon() {
		// TODO Por implementar
		return false;
	}

	public void loadFrom(String filename) {
		// TODO Por implementar
	}

	public void save(String filename) {
		// TODO Por implementar
	}

	public Game createNewGame() {
		// TODO Por implementar
		return null;
	}

}
