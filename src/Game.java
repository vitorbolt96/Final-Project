public class Game implements GameRM<Game> {

	public final static char WATER_CHAR = ' ';
	public final static char HIT_CHAR = 'X';
	public final static char MISS_CHAR = '•';

	private char[][] playerMatrix;
	private char[][] opponentMatrix;

	public char[][] getPlayerMatrix() {
		// Atualiza a matriz do Utilizador
		return null;
	}

	public char[][] getOpponentMatrix() {
		// Atualiza a matriz do oponente
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
		// Gerar jogadas aleatorias
	}


	public boolean isOver() {
		// TODO Por implementar
		return false;
	}

	public boolean playerWon() {
		// Utilizador a vencer
		return false;
	}

	public boolean opponentWon() {
		// Oponente a vencer
		return false;
	}

	public void loadFrom(String filename) {
		// TODO Por implementar
	}

	public void save(String filename) {
		// TODO Por implementar
	}

	public Game createNewGame() {
		// Criacao de um novo jogo
		return null;
	}

}
