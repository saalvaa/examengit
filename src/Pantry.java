/**
 * 
 * @author SALVA
 */

public class Pantry {

	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;
/**
 * 
 * @param jar1n assiganacio a la variable
 * @param jar2  assiganacio a la variable
 * @param jar3  assiganacio a la variable
 */
	Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}

	public void print() {
		System.out.print("1: ");
		jar1.print();
		System.out.print("2: ");
		jar2.print();
		System.out.print("3: ");
		jar3.print();
	}
/**
 * 
 * @param jarNumber  passa per parametre un numero
 */
	public void select(int jarNumber) {
		if (jarNumber == 1) {
			selected = jar1;
		} else if (jarNumber == 2) {
			selected = jar2;
		} else {
			selected = jar3;
		}
	}
/**
 * 
 * @param oz  passa per parametre un numero
 */
	public void spread(int oz) {
		selected.spread(oz);
	}
}
