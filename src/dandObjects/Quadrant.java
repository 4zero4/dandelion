/**
 * Classe respons�vel pelo quadrante.
 * Guarda os sistemas solares e os inicializa/administra.
 * Faz v�rias outras coisas tambem.
 * 
 */
package dandObjects;

import java.util.*;

import proceduralGenerators.*;

/**
 * @author Gabriel
 *
 */
public class Quadrant {
	
	public String quadrantName = "";
	public double quadrantSeed;
	public ArrayList<SolarSys> _solarSys;
	public int nunberOfStars;
	public int[] quadrantCoords = new int[3];

	/**
	 * M�todo construtor inicializador do quadrante.
	 * 
	 * Calcula os atributos, inicializa os Systemas, etc...
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param numberOfStars
	 */
	public Quadrant(int x, int y, int z, int nOfStars) {
		
		//=====
		//seta as coordenadas do quadrante
		//=====
		this.quadrantCoords[0]=x;
		this.quadrantCoords[1]=y;
		this.quadrantCoords[2]=z;
		
		//=====
		//Seta o n�mero de estrelas no quadrante.
		//=====
		this.nunberOfStars = nOfStars;
		
		//=====
		//Calcula a seed �nica do quadrante
		//=====
		this.quadrantSeed = (int)((x+(2*y)+(3*z)+nOfStars)/5);
		
		//=====
		//Calcula o nome do quadrante
		//=====
		this.quadrantName=(this.quadrantSeed+"-"+x+"-"+y+"-"+z);
		
		//=====
		//Inicializa as estrelas
		//=====
		igniteStars();
	}//Quadrant
	
	public void igniteStars(){
		
	}

}
