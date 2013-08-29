package proceduralGenerators;

/**
 * Classe principal responsável pelas 'seeds' e controle de acontecimentos pseudo-aleatórios.
 * @author Gabriel
 *
 */
public class Seeder {
	public static int a = 25136;//Valor seed a
	public static int b = 25256;//Valor seed b
	public double occurrenceChecktemp = 0;//Checker!
	
	/**
	 * 
	 * @param Xi
	 * @return
	 */
	public static double getCoord(double Xi) {
		int m = 100000;
		return (((a * Xi + b) % m) / 1000);
	}

}
