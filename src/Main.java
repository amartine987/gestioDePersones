import java.awt.EventQueue;


public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					Model model = new Model();
					Controlador controlador = new Controlador(model,window);
					controlador.control();
					window.getFrmGesti().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
