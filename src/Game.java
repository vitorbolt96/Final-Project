public class Game implements GameRM<Game> {

	public final static char WATER_CHAR = ' ';
	public final static char HIT_CHAR = 'X';
	public final static char MISS_CHAR = '•';

	private char[][] playerMatrix;
	private char[][] opponentMatrix;

	public Game(){
		playerMatrix = copyMatrix(Params.DEFAULT_PLAYER_MATRIX);
		opponentMatrix = copyMatrix(Params.DEFAULT_OPPONENT_MATRIX);
	}

	public Game(char[][] player, char[][] opponent){
		playerMatrix = copyMatrix(player);
		opponentMatrix = copyMatrix(opponent);
	}

	public char[][] getPlayerMatrix() {
		return copyMatrix(playerMatrix);
	}

	public char[][] getOpponentMatrix() {
		return copyMatrix(opponentMatrix);
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

	static char[][] copyMatrix(char[][] matrix){
		char[][] copy = new char[10][10];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				copy[i][j] = matrix[i][j];
			}
		}
		return copy;
	}
}
