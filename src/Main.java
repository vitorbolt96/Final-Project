public class Main {

	public static void main(String[] args) {
		Game jogo = new Game();
		GameController gameController = new GameController(jogo);
		
		Window window = new Window("Battleship game");
		
		IO.println("\nCommands: (A1-J10, random, new, save, load, exit): \n");
		
		String command;
		do {
			window.show(gameController.getImage());
			command = IO.readln("input command or coordinate: ");
			gameController.commandHandler(command);
		} while(!jogo.isOver() && !"exit".equalsIgnoreCase(command));
		
		System.exit(0);
	}
	
}