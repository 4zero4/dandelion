/**
 * Classe responsável pelo quadrante.
 * Guarda os sistemas solares e os inicializa/administra.
 * Faz várias outras coisas tambem.
 * 
 */
package dandObjects;

import java.util.ArrayList;

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
	 * Método construtor inicializador do quadrante.
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
		//Seta o número de estrelas no quadrante.
		//=====
		this.nunberOfStars = nOfStars;
		
		//=====
		//Calcula a seed única do quadrante
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
		double seed = this.quadrantSeed;
		
		//=====
		//Main loop de criação de estrelas!
		//=====
		for(int i=0;i<this.nunberOfStars;i++){
			double sysX=0,sysY=0,sysZ=0;
			
			sysX = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysX;
			
			sysY = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysY;
			
			sysZ = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysZ;
			
			SolarSys tempSys = new SolarSys(i,sysX,sysY,sysZ,this.quadrantSeed,this.quadrantName);
			_solarSys.add(tempSys);
		}
		
	}//igniteStars

}
