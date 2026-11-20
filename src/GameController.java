
public class GameController implements GameControllerRM<ColorImage> {

	private Game game;

	public GameController(Game game) {
		// Parte do codigo onde vou inserir os controles da aplicacao
	}

	public ColorImage getImage() {
		// TODO Por implementar
		ColorImage img = new ColorImage(300, 300, new Color(0, 255, 0));
		img.drawCenteredText(150, 75, "ISCTE-IUL", 18, new Color(0, 0, 0));
		img.drawCenteredText(150, 125, "Introdução à Programação", 18, new Color(0, 0, 0));
		img.drawCenteredText(150, 175, "2026/2027", 18, new Color(0, 0, 0));
		img.drawCenteredText(150, 250, "getImage() por completar...", 18, new Color(255, 0, 0));
		return img;
	}

	public void commandHandler(String cmd) {
		// TODO Por implementar
	
	}
}
