import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controlador {
	private Model model;
	private Vista vista;
	private ActionListener actionListener1;
	private ActionListener actionListener2;
	private ActionListener actionListener3;
	private ActionListener actionListener4;
	private ActionListener actionListener5;
	private ActionListener actionListener6;
	private ActionListener actionListener7;
	private ActionListener actionListener8;
	private ActionListener actionListener9;
	private boolean editar = false;
	private int posicio = 0;
	private boolean inici = true;
	private Persona persEdit = new Persona();

	public Controlador(Model model, Vista vista) {
		this.model = model;
		this.vista = vista;
	}

	public void control() {
		// Botó Nou
		actionListener1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				netejar();
				deshabilitarBotons();
				habilitarEdicio();
				Model.buscarPersones(model.getF());
			}
		};
		vista.getBtnNou().addActionListener(actionListener1);
		
		// Botó Edita
		actionListener2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deshabilitarBotons();
				habilitarEdicio();
				ArrayList<Persona> pers;
				Persona persona;
				netejar();
				pers = Model.buscarPersones(model.getF());//model.getCompt());
				persona = pers.get(posicio);
				mostrar(persona, pers.size());
				persEdit.setDni(persona.getDni());
				persEdit.setNom(persona.getNom());
				persEdit.setCognom1(persona.getCognom1());
				persEdit.setCognom2(persona.getCognom2());
				persEdit.setEdat(persona.getEdat());
				editar = true;
			}
		};
		vista.getBtnEdita().addActionListener(actionListener2);
		
		// Botó Esborra
		actionListener3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Persona> pers;
				pers = Model.buscarPersones(model.getF());
				String dni, nom, cog1, cog2;
				int edat;
				dni = vista.getTxtDni().getText();
				nom = vista.getTxtNom().getText();
				cog1 = vista.getTxtCognom1().getText();
				cog2 = vista.getTxtCognom2().getText();
				edat = Integer.parseInt(vista.getTxtEdat().getText());
				deshabilitarBotons();
				int opcio = JOptionPane.showConfirmDialog(null, "Realment ho vol esborrar?", "Avís", JOptionPane.YES_NO_OPTION);
				if (opcio == 0) {
					Model.esborrarPersona(model.getF(), dni, nom, cog1, cog2, edat);
					netejar();
					habilitarBotons();
					if(posicio==0){
						try{
							mostrar(pers.get(posicio+1), pers.size()-1);
						}catch (IndexOutOfBoundsException rs){
							JOptionPane.showMessageDialog(vista.getFrmGesti(),
									"No hi han registres!");
							inici = true;
							deshabilitarBotons();
						}
					}else if(posicio == pers.size()-1){
						mostrar(pers.get(posicio-1), pers.size()-1);
					}
				}else{
					habilitarBotons();
					mostrar(pers.get(posicio), pers.size());
				}
				
			}
		};
		vista.getBtnEsborra().addActionListener(actionListener3);
		
		// Botó Primer
		actionListener4 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ArrayList<Persona> pers;
				Persona persona;
				netejar();
				pers = Model.buscarPersones(model.getF());
				persona = pers.get(0);
				posicio = 0;
				mostrar(persona, pers.size());
			}
		};
		vista.getBtnPrimer().addActionListener(actionListener4);
		
		// Botó Botó Darrer
		actionListener5 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ArrayList<Persona> pers;
				Persona persona;
				netejar();
				pers = Model.buscarPersones(model.getF());
				persona = pers.get(pers.size()-1);
				posicio = pers.size()-1;
				mostrar(persona, pers.size());
			}
		};
		vista.getBtnDarrer().addActionListener(actionListener5);
		
		// Botó Anterior
		actionListener6 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Persona> pers;
				Persona persona;
				netejar();
				pers = Model.buscarPersones(model.getF());
				if(posicio-1>=0){
					posicio --;
					persona = pers.get(posicio);
					mostrar(persona, pers.size());
				}else{
					JOptionPane.showMessageDialog(vista.getFrmGesti(),
							"No pots tirar més enrera!");
					posicio = 0;
					mostrar(pers.get(posicio), pers.size());
				}
			}
		};
		vista.getBtnAnterior().addActionListener(actionListener6);
		
		// Botó Següent
		actionListener7 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Persona> pers;
				Persona persona;
				netejar();
				pers = Model.buscarPersones(model.getF());
				if(posicio+1<=pers.size()-1){
					posicio ++;
					persona = pers.get(posicio);
					mostrar(persona, pers.size());
				}else{
					JOptionPane.showMessageDialog(vista.getFrmGesti(),
							"No pots tirar més endavant!");
					posicio = pers.size()-1;
					mostrar(pers.get(posicio),pers.size());
				}
			}
		};
		vista.getBtnSeguent().addActionListener(actionListener7);
		
		// Botó Desa
		actionListener8 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Persona> pers;
				pers = Model.buscarPersones(model.getF());
				try{
					if (!editar) {
						String dni, nom, cog1, cog2;
						int edat;
						dni = vista.getTxtDni().getText();
						nom = vista.getTxtNom().getText();
						cog1 = vista.getTxtCognom1().getText();
						cog2 = vista.getTxtCognom2().getText();
						edat = Integer.parseInt(vista.getTxtEdat().getText());
						if (edat >= 1 && edat <= 999) {
							Model.afegirPersona(model.getF(), dni, nom, cog1, cog2,
									edat);
						} else {
							JOptionPane.showMessageDialog(vista.getFrmGesti(),
									"Edat incorrecta (1-999)");
						}
						
					} else {
						String dniMod, nomMod, cog1Mod, cog2Mod;
						int edatMod;
						dniMod = vista.getTxtDni().getText();
						nomMod = vista.getTxtNom().getText();
						cog1Mod = vista.getTxtCognom1().getText();
						cog2Mod = vista.getTxtCognom2().getText();
						edatMod = Integer.parseInt(vista.getTxtEdat().getText());
						Model.modificarPersona(model.getF(), persEdit.getDni(),
								persEdit.getNom(), persEdit.getCognom1(),
								persEdit.getCognom2(), persEdit.getEdat(), dniMod,
								nomMod, cog1Mod, cog2Mod, edatMod);
						editar = false;
					}
					inici = false;
					habilitarBotons();
					deshabilitarEdicio();
				}catch(NumberFormatException es){
					JOptionPane.showMessageDialog(vista.getFrmGesti(),
							"Nomes es poden introduir números!");
				}
			}
		};
		vista.getBtnDesa().addActionListener(actionListener8);
		
		// Botó cancel·la
		actionListener9 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				netejar();
				if (inici){
					netejar();
				}else{
					netejar();
					habilitarBotons();
				}
			}
		};
		vista.getBtnCancela().addActionListener(actionListener9);

	}
	/**
	 * Mètode que neteja els camps on s'introdueixen dades
	 */
	public void netejar() {
		vista.getTxtDni().setText("");
		vista.getTxtNom().setText("");
		vista.getTxtCognom1().setText("");
		vista.getTxtCognom2().setText("");
		vista.getTxtEdat().setText("");
	}
	/**
	 * Mètode que mostra la persona seleccionada, a més actulitza el registre
	 * @param pers
	 * @param size
	 */
	public void mostrar(Persona pers, int size){
		vista.getTxtDni().setText(pers.getDni());
		vista.getTxtNom().setText(pers.getNom());
		vista.getTxtCognom1().setText(pers.getCognom1());
		vista.getTxtCognom2().setText(pers.getCognom2());
		vista.getTxtEdat().setText("" + pers.getEdat());
		vista.getLblRegistres().setText("Registre : " + ((int)posicio + 1) + " de " + size);
	}
	/**
	 * Mètode que habilita tots els botons a excepcio de nou, cancel·la i desa
	 */
	public void habilitarBotons(){
		vista.getBtnEsborra().setEnabled(true);
		vista.getBtnPrimer().setEnabled(true);
		vista.getBtnDarrer().setEnabled(true);
		vista.getBtnAnterior().setEnabled(true);
		vista.getBtnSeguent().setEnabled(true);
		vista.getBtnEdita().setEnabled(true);
	}
	/**
	 * Mètode que deshabilita tots els botons a excepcio de nou, cancel·la i desa
	 */
	public void deshabilitarBotons(){
		vista.getBtnEsborra().setEnabled(false);
		vista.getBtnPrimer().setEnabled(false);
		vista.getBtnDarrer().setEnabled(false);
		vista.getBtnAnterior().setEnabled(false);
		vista.getBtnSeguent().setEnabled(false);
		vista.getBtnEdita().setEnabled(false);
	}
	/**
	 * Mètode que habilita els camps d'edició i els botons cancel·la i desa
	 */
	public void habilitarEdicio(){
		vista.getTxtDni().setEditable(true);
		vista.getTxtNom().setEditable(true);
		vista.getTxtCognom1().setEditable(true);
		vista.getTxtCognom2().setEditable(true);
		vista.getTxtEdat().setEditable(true);
		vista.getBtnDesa().setEnabled(true);
		vista.getBtnCancela().setEnabled(true);
	}
	/**
	 * Mètode que deshabilita els camps d'edicio i els botons de cancel·la i desa
	 */
	public void deshabilitarEdicio(){
		vista.getTxtDni().setEditable(false);
		vista.getTxtNom().setEditable(false);
		vista.getTxtCognom1().setEditable(false);
		vista.getTxtCognom2().setEditable(false);
		vista.getTxtEdat().setEditable(false);
		vista.getBtnDesa().setEnabled(false);
		vista.getBtnCancela().setEnabled(false);
	}
}
