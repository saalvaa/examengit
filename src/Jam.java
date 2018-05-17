public class Jam {
	private String contents;
	private String date;
	private int capacity;
	private static int numTotalJars, noJam = 0;
/**
 * 
 * @param contents
 * @param date
 * @param size 
 * assigana valors al cosntrucrotr
 */
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
		numTotalJars++;
	}
/**
 * 
 * @return  retorna un valor  que es un numero
 */
	public boolean empty() {
		return (capacity == 0);
	}

	public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
		System.out.println("El n1mero total de Jars creats des de l'inici dels temps s�n: " + Jam.getNumTotalJars());
		System.out.println("El nero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
	}
/**
 * 
 * @param fluidOz 
 * passa per parametres un valor  en forma de numero
 */
	public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz < capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				capacity = 0;
				noJam++;			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}
/**
 * 
 * @return  retorna un  un numero
 */
	public static int getNumTotalJars() {
		return numTotalJars;
	}
/**
 * 
 * @return  retorna un nom
 */
	public static int getNoJam() {
		return noJam;
	}
}
