/**
 * Classe responsavel pelo quadrante.
 * Guarda os sistemas solares e os inicializa/administra.
 * Faz varias outras coisas tambem.
 * 
 */
package dandObjects;

import java.util.ArrayList;

/**
 * @author Gabriel
 *
 */
public class Quadrant {
	
	public String quadrantName = "";//Nome do quadrante
	public double quadrantSeed;//Seed do quadrante
	public ArrayList<SolarSys> _solarSys;//ArrayList com os sistemas solares
	public int nunberOfStars;//numero de estrelas
	public int[] quadrantCoords = new int[3];//coordenadas do quadrante na galaxya

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
		System.out.println("seta as coordenadas do quadrante!");
		System.out.println("==================================================");
		//=====
		this.quadrantCoords[0]=x;
		this.quadrantCoords[1]=y;
		this.quadrantCoords[2]=z;
		
		//=====
		//Seta o numero de estrelas no quadrante.
		System.out.println("Seta o numero de estrelas no quadrante!");
		System.out.println("==================================================");
		//=====
		this.nunberOfStars = nOfStars;
		
		//=====
		//Calcula a seed unica do quadrante
		System.out.println("Calcula a seed unica do quadrante!");
		System.out.println("==================================================");
		//=====
		this.quadrantSeed = ((x+(2*y)+(3*z)+nOfStars)/5);
		
		//=====
		//Calcula o nome do quadrante
		System.out.println("Calcula o nome do quadrante!");
		System.out.println("==================================================");
		//=====
		this.quadrantName=(this.quadrantSeed+"-"+x+"-"+y+"-"+z);
		
		//=====
		//Inicializa as estrelas
		System.out.println("Inicializa as estrelas!");
		System.out.println("==================================================");
		//=====
		igniteStars();
		
	}//Quadrant
	
	public void igniteStars(){
		double seed = this.quadrantSeed;
		this._solarSys = new ArrayList<SolarSys>();
		
		//=====
		//Main loop de criacao de estrelas!
		System.out.println("Main loop de criacao de estrelas!");
		System.out.println("==================================================");
		//=====
		for(int i=0;i<this.nunberOfStars;i++){
			double sysX=0,sysY=0,sysZ=0;
			
			sysX = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysX;
			
			sysY = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysY;
			
			sysZ = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysZ;
			
			System.out.println("Criando estrela!");
			System.out.println("==================================================");
			
			SolarSys tempSys = new SolarSys(i,sysX,sysY,sysZ,this.quadrantSeed,this.quadrantName);
			
			System.out.println("Estrela criada!");
			System.out.println("==================================================");
			
			this._solarSys.add(tempSys);
			
			System.out.println("Estrela armazenada!");
			System.out.println("==================================================");
			
		}
		
	}//igniteStars

}
