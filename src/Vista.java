import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class Vista {

	private JFrame frmGesti;
	private JTextField txtDni;
	private JLabel lblNom;
	private JLabel lblPrimerCognom;
	private JLabel lblSegonCognom;
	private JLabel lblEdat;
	private JButton btnNou;
	private JButton btnEsborra;
	private JButton btnEdita;
	private JButton btnPrimer;
	private JButton btnDarrer;
	private JButton btnAnterior;
	private JButton btnSeguent;
	private JButton btnDesa;
	private JButton btnCancela;
	private JLabel lblRegistres;
	private JTextField txtNom;
	private JTextField txtCognom1;
	private JTextField txtCognom2;
	private JTextField txtEdat;
	
	
	/**
	 * @return the frmGesti
	 */
	public JFrame getFrmGesti() {
		return frmGesti;
	}

	/**
	 * @param frmGesti the frmGesti to set
	 */
	public void setFrmGesti(JFrame frmGesti) {
		this.frmGesti = frmGesti;
	}

	/**
	 * @return the txtDni
	 */
	public JTextField getTxtDni() {
		return txtDni;
	}

	/**
	 * @param txtDni the txtDni to set
	 */
	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}

	/**
	 * @return the lblNom
	 */
	public JLabel getLblNom() {
		return lblNom;
	}

	/**
	 * @param lblNom the lblNom to set
	 */
	public void setLblNom(JLabel lblNom) {
		this.lblNom = lblNom;
	}

	/**
	 * @return the lblPrimerCognom
	 */
	public JLabel getLblPrimerCognom() {
		return lblPrimerCognom;
	}

	/**
	 * @param lblPrimerCognom the lblPrimerCognom to set
	 */
	public void setLblPrimerCognom(JLabel lblPrimerCognom) {
		this.lblPrimerCognom = lblPrimerCognom;
	}

	/**
	 * @return the lblSegonCognom
	 */
	public JLabel getLblSegonCognom() {
		return lblSegonCognom;
	}

	/**
	 * @param lblSegonCognom the lblSegonCognom to set
	 */
	public void setLblSegonCognom(JLabel lblSegonCognom) {
		this.lblSegonCognom = lblSegonCognom;
	}

	/**
	 * @return the lblEdat
	 */
	public JLabel getLblEdat() {
		return lblEdat;
	}

	/**
	 * @param lblEdat the lblEdat to set
	 */
	public void setLblEdat(JLabel lblEdat) {
		this.lblEdat = lblEdat;
	}

	/**
	 * @return the btnNou
	 */
	public JButton getBtnNou() {
		return btnNou;
	}

	/**
	 * @param btnNou the btnNou to set
	 */
	public void setBtnNou(JButton btnNou) {
		this.btnNou = btnNou;
	}

	/**
	 * @return the btnEsborra
	 */
	public JButton getBtnEsborra() {
		return btnEsborra;
	}

	/**
	 * @param btnEsborra the btnEsborra to set
	 */
	public void setBtnEsborra(JButton btnEsborra) {
		this.btnEsborra = btnEsborra;
	}

	/**
	 * @return the btnEdita
	 */
	public JButton getBtnEdita() {
		return btnEdita;
	}

	/**
	 * @param btnEdita the btnEdita to set
	 */
	public void setBtnEdita(JButton btnEdita) {
		this.btnEdita = btnEdita;
	}

	/**
	 * @return the btnPrimer
	 */
	public JButton getBtnPrimer() {
		return btnPrimer;
	}

	/**
	 * @param btnPrimer the btnPrimer to set
	 */
	public void setBtnPrimer(JButton btnPrimer) {
		this.btnPrimer = btnPrimer;
	}

	/**
	 * @return the btnDarrer
	 */
	public JButton getBtnDarrer() {
		return btnDarrer;
	}

	/**
	 * @param btnDarrer the btnDarrer to set
	 */
	public void setBtnDarrer(JButton btnDarrer) {
		this.btnDarrer = btnDarrer;
	}

	/**
	 * @return the btnAnterior
	 */
	public JButton getBtnAnterior() {
		return btnAnterior;
	}

	/**
	 * @param btnAnterior the btnAnterior to set
	 */
	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
	}

	/**
	 * @return the btnSeguent
	 */
	public JButton getBtnSeguent() {
		return btnSeguent;
	}

	/**
	 * @param btnSeguent the btnSeguent to set
	 */
	public void setBtnSeguent(JButton btnSeguent) {
		this.btnSeguent = btnSeguent;
	}

	/**
	 * @return the btnDesa
	 */
	public JButton getBtnDesa() {
		return btnDesa;
	}

	/**
	 * @param btnDesa the btnDesa to set
	 */
	public void setBtnDesa(JButton btnDesa) {
		this.btnDesa = btnDesa;
	}

	/**
	 * @return the btnCancela
	 */
	public JButton getBtnCancela() {
		return btnCancela;
	}

	/**
	 * @param btnCancela the btnCancela to set
	 */
	public void setBtnCancela(JButton btnCancela) {
		this.btnCancela = btnCancela;
	}

	/**
	 * @return the lblRegistres
	 */
	public JLabel getLblRegistres() {
		return lblRegistres;
	}

	/**
	 * @param lblRegistres the lblRegistres to set
	 */
	public void setLblRegistres(JLabel lblRegistres) {
		this.lblRegistres = lblRegistres;
	}

	/**
	 * @return the txtNom
	 */
	public JTextField getTxtNom() {
		return txtNom;
	}

	/**
	 * @param txtNom the txtNom to set
	 */
	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}

	/**
	 * @return the txtCognom1
	 */
	public JTextField getTxtCognom1() {
		return txtCognom1;
	}

	/**
	 * @param txtCognom1 the txtCognom1 to set
	 */
	public void setTxtCognom1(JTextField txtCognom1) {
		this.txtCognom1 = txtCognom1;
	}

	/**
	 * @return the txtCognom2
	 */
	public JTextField getTxtCognom2() {
		return txtCognom2;
	}

	/**
	 * @param txtCognom2 the txtCognom2 to set
	 */
	public void setTxtCognom2(JTextField txtCognom2) {
		this.txtCognom2 = txtCognom2;
	}

	/**
	 * @return the txtEdat
	 */
	public JTextField getTxtEdat() {
		return txtEdat;
	}

	/**
	 * @param txtEdat the txtEdat to set
	 */
	public void setTxtEdat(JTextField txtEdat) {
		this.txtEdat = txtEdat;
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGesti = new JFrame();
		frmGesti.setTitle("Gesti\u00F3 de persones");
		frmGesti.setResizable(false);
		frmGesti.setBounds(100, 100, 832, 300);
		frmGesti.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmGesti.setJMenuBar(menuBar);
		
		btnNou = new JButton("Nou");
		menuBar.add(btnNou);
		
		btnEsborra = new JButton("Esborra");
		btnEsborra.setEnabled(false);
		menuBar.add(btnEsborra);
		
		btnEdita = new JButton("Edita");
		btnEdita.setEnabled(false);
		menuBar.add(btnEdita);
		
		btnPrimer = new JButton("Primer");
		btnPrimer.setEnabled(false);
		menuBar.add(btnPrimer);
		
		btnDarrer = new JButton("Darrer");
		btnDarrer.setEnabled(false);
		menuBar.add(btnDarrer);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setEnabled(false);
		menuBar.add(btnAnterior);
		
		btnSeguent = new JButton("Seg\u00FCent");
		btnSeguent.setEnabled(false);
		menuBar.add(btnSeguent);
		
		btnDesa = new JButton("Desa");
		btnDesa.setEnabled(false);
		menuBar.add(btnDesa);
		
		btnCancela = new JButton("Cancel\u00B7la");
		btnCancela.setEnabled(false);
		menuBar.add(btnCancela);
		
		lblRegistres = new JLabel("        Registre ");
		lblRegistres.setVerticalAlignment(SwingConstants.TOP);
		menuBar.add(lblRegistres);
		SpringLayout springLayout = new SpringLayout();
		frmGesti.getContentPane().setLayout(springLayout);
		
		txtDni = new JTextField();
		txtDni.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, txtDni, 34, SpringLayout.NORTH, frmGesti.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtDni, -37, SpringLayout.EAST, frmGesti.getContentPane());
		frmGesti.getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DNI :");
		springLayout.putConstraint(SpringLayout.WEST, txtDni, 91, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 35, SpringLayout.WEST, frmGesti.getContentPane());
		frmGesti.getContentPane().add(lblNewLabel);
		
		lblNom = new JLabel("Nom :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNom, 75, SpringLayout.NORTH, frmGesti.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -24, SpringLayout.NORTH, lblNom);
		springLayout.putConstraint(SpringLayout.WEST, lblNom, 0, SpringLayout.WEST, lblNewLabel);
		frmGesti.getContentPane().add(lblNom);
		
		lblPrimerCognom = new JLabel("Primer Cognom :");
		springLayout.putConstraint(SpringLayout.NORTH, lblPrimerCognom, 26, SpringLayout.SOUTH, lblNom);
		springLayout.putConstraint(SpringLayout.WEST, lblPrimerCognom, 0, SpringLayout.WEST, lblNewLabel);
		frmGesti.getContentPane().add(lblPrimerCognom);
		
		lblSegonCognom = new JLabel("Segon Cognom :");
		springLayout.putConstraint(SpringLayout.WEST, lblSegonCognom, 0, SpringLayout.WEST, lblNewLabel);
		frmGesti.getContentPane().add(lblSegonCognom);
		
		lblEdat = new JLabel("Edat :");
		springLayout.putConstraint(SpringLayout.NORTH, lblEdat, 195, SpringLayout.NORTH, frmGesti.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblSegonCognom, -24, SpringLayout.NORTH, lblEdat);
		springLayout.putConstraint(SpringLayout.WEST, lblEdat, 0, SpringLayout.WEST, lblNewLabel);
		frmGesti.getContentPane().add(lblEdat);
		
		txtNom = new JTextField();
		txtNom.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, txtNom, 15, SpringLayout.SOUTH, txtDni);
		springLayout.putConstraint(SpringLayout.WEST, txtNom, 0, SpringLayout.WEST, txtDni);
		springLayout.putConstraint(SpringLayout.EAST, txtNom, 0, SpringLayout.EAST, txtDni);
		txtNom.setColumns(10);
		frmGesti.getContentPane().add(txtNom);
		
		txtCognom1 = new JTextField();
		txtCognom1.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, txtCognom1, 20, SpringLayout.SOUTH, txtNom);
		springLayout.putConstraint(SpringLayout.WEST, txtCognom1, 0, SpringLayout.WEST, txtDni);
		springLayout.putConstraint(SpringLayout.EAST, txtCognom1, 0, SpringLayout.EAST, txtDni);
		txtCognom1.setColumns(10);
		frmGesti.getContentPane().add(txtCognom1);
		
		txtCognom2 = new JTextField();
		txtCognom2.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, txtCognom2, 22, SpringLayout.SOUTH, txtCognom1);
		springLayout.putConstraint(SpringLayout.WEST, txtCognom2, 0, SpringLayout.WEST, txtDni);
		springLayout.putConstraint(SpringLayout.EAST, txtCognom2, 0, SpringLayout.EAST, txtDni);
		txtCognom2.setColumns(10);
		frmGesti.getContentPane().add(txtCognom2);
		
		txtEdat = new JTextField();
		txtEdat.setEditable(false);
		springLayout.putConstraint(SpringLayout.WEST, txtEdat, 0, SpringLayout.WEST, txtDni);
		springLayout.putConstraint(SpringLayout.SOUTH, txtEdat, 0, SpringLayout.SOUTH, lblEdat);
		springLayout.putConstraint(SpringLayout.EAST, txtEdat, 0, SpringLayout.EAST, txtDni);
		txtEdat.setColumns(10);
		frmGesti.getContentPane().add(txtEdat);
	}
}
