import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Model {
	private String path = "dades.csv";
	private File f = new File (path);
	private static boolean primer;
	

	public Model(){
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Mètoe que busca totes les persones que hi ha dins el fitxer
	 * @param f
	 * @return
	 */
	public static ArrayList<Persona> buscarPersones(File f){
		String linia;
		ArrayList<Persona> llistaPers = new ArrayList<Persona>();
		String str[];
		boolean trobat = false;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			FileReader frComprovar = new FileReader(f);
			BufferedReader brComprovar = new BufferedReader(frComprovar);
			if((linia = brComprovar.readLine())==null){
				primer = true;
			}else{
				primer = false;
			}
			while ((linia = br.readLine()) != null) {
				if(!trobat){
					Persona pers = new Persona();
					str = linia.split(";");
					pers.setDni(str[0]);
					pers.setNom(str[1]);
					pers.setCognom1(str[2]);
					pers.setCognom2(str[3]);
					pers.setEdat(Integer.parseInt(str[4]));
					llistaPers.add(pers);
					trobat = true;
				}else{
					Persona pers = new Persona();
					str = linia.split(";");
					pers.setDni(str[0]);
					pers.setNom(str[1]);
					pers.setCognom1(str[2]);
					pers.setCognom2(str[3]);
					pers.setEdat(Integer.parseInt(str[4]));
					llistaPers.add(pers);
				}
			}
			br.close();
			brComprovar.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return llistaPers;
	}
	
	/**
	 * Mètode que afegeix la persona (amb les dades entrades per parametre) al fitxer
	 * @param f
	 * @param dni
	 * @param nom
	 * @param cognom1
	 * @param cognom2
	 * @param edat
	 */
	public static void afegirPersona(File f, String dni, String nom, String cognom1, String cognom2, int edat) {
		String dades;
		try {
			FileWriter fw = new FileWriter(f.getPath(), true);
			PrintWriter pw = new PrintWriter(fw);
			dades = dni + ";" + nom + ";" + cognom1 + ";" + cognom2 + ";" + edat;
			if(primer){
				pw.write(dades);
				primer = false;
			}else{
				pw.write("\r\n" + dades);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Mètode que modifica la persona especificada per parametres amb les noves dades entrades per parametres
	 * @param f
	 * @param dni
	 * @param nom
	 * @param cognom1
	 * @param cognom2
	 * @param edat
	 * @param dniMod
	 * @param nomMod
	 * @param cognom1Mod
	 * @param cognom2Mod
	 * @param edatMod
	 */
	public static void modificarPersona(File f, String dni, String nom, String cognom1, String cognom2, int edat,
			String dniMod, String nomMod, String cognom1Mod, String cognom2Mod, int edatMod){
		String dades = dni + ";" + nom + ";" + cognom1 + ";" + cognom2 + ";" + edat;
		String dadesMod = dniMod + ";" + nomMod + ";" + cognom1Mod + ";" + cognom2Mod + ";" + edatMod;
		String dadesFitx = "";
		String linia;
		boolean first = true;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while ((linia = br.readLine()) != null) {
				if (!linia.contains(dades) && first) {
					dadesFitx = linia;
					first = false;
				}else if(!linia.contains(dades) && !first ){
					dadesFitx = dadesFitx + "\r\n" + linia;
				}else if (linia.contains(dades) && !first){
					dadesFitx = dadesFitx + "\r\n" + dadesMod ;
				}else if(linia.contains(dades) && first){
					dadesFitx = dadesMod;
					first = false;
				}
			}
			FileWriter fw = new FileWriter(f.getPath());
			PrintWriter pw = new PrintWriter(fw);
			pw.write(dadesFitx);
			br.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Mètode que esbora la persona designada per parametres
	 * @param f
	 * @param dni
	 * @param nom
	 * @param cognom1
	 * @param cognom2
	 * @param edat
	 */
	public static void esborrarPersona(File f, String dni, String nom, String cognom1, String cognom2, int edat) {
		String dades = dni + ";" + nom + ";" + cognom1 + ";" + cognom2 + ";" + edat;
		String dadesFitx = "";
		String linia;
		int compt=0;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while ((linia = br.readLine()) != null) {
				if (!linia.contains(dades) && compt==0) {
					dadesFitx = linia;
					compt++;
				}else if(!linia.contains(dades)){
					dadesFitx = dadesFitx  + "\r\n" + linia;
				}
			}
			FileWriter fw = new FileWriter(f.getPath());
			PrintWriter pw = new PrintWriter(fw);
			pw.write(dadesFitx);
			br.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @return
	 */
	public String getPath() {
		return path;
	}
	
	/**
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the f
	 */
	public File getF() {
		return f;
	}

	/**
	 * @param f the f to set
	 */
	public void setF(File f) {
		this.f = f;
	}	
}
