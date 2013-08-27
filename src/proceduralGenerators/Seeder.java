/**
 * Classe principal responsável pelas 'seeds' e controle de acontecimentos pseudo-aleatórios.
 * 
 */
package proceduralGenerators;

/**
 * @author Gabriel
 *
 */
public class Seeder {
	public static int a = 25136;//Valor seed a
	public static int b = 25256;//Valor seed b
	public double occurrenceChecktemp = 0;//Checker!
	
	public static double getCoord(double Xi) {
		int m = 500000;
		return (((a * Xi + b) % m) / 1000);
	}

}
