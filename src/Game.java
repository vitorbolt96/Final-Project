public class Game implements GameRM<Game> {

	public final static char WATER_CHAR = ' ';
	public final static char HIT_CHAR = 'X';
	public final static char MISS_CHAR = '•';

	private char[][] playerMatrix;
	private char[][] opponentMatrix;

	public Game() {
		playerMatrix = copyMatrix(Params.DEFAULT_PLAYER_MATRIX);
		opponentMatrix = copyMatrix(Params.DEFAULT_OPPONENT_MATRIX);
	}

	public Game(char[][] player, char[][] opponent) {
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
		return matrixToString("Player: ", playerMatrix) + matrixToString("Opponent: ", opponentMatrix);
	}

	public static String matrixToString(String title, char[][] matrix){
		String result = title + " \n   A B C D E F G H I J\n";

		for (int i = 0; i < 10; i++) {
			int numLinha = i + 1;
			if (numLinha < 10)
				result += " ";
			result += numLinha + " |";
			for (int j = 0; j < 10; j++) {
				result += matrix[i][j] + "|";
			}
			result += "\n";
		}
		return result;
	}

	public void manualPlayAt(int row, int col) {
		if(row < 0 || row > 10 || col < 0 || col > 10){
			IO.println("Coordenada fora do tabuleiro.");
			return;
		}
		if(opponentMatrix[row][col] == 'X' || opponentMatrix[row][col] == '•'){
			IO.println("Posição já jogada.");
			return;
		}
		if(opponentMatrix[row][col] == ' '){
			opponentMatrix[row][col] = '•';
			IO.println("Tiro na água!");
		}
		if(opponentMatrix[row][col] >= '1' && opponentMatrix[row][col] <= '5'){
			char boatType = opponentMatrix[row][col];
			opponentMatrix[row][col] = 'X';
			IO.println("O barco de " + boatType + "de comprimento foi atingido!");
		}
		// Criar verificacao de se o barco afundou
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

	static char[][] copyMatrix(char[][] matrix) {
		char[][] copy = new char[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				copy[i][j] = matrix[i][j];
			}
		}
		return copy;
	}

	static void main() {
		Game test = new Game();
		System.out.println(test.toString());

	}
}