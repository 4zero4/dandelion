package dandObjects;

import java.util.ArrayList;

/**
 * Classe responsavel pelo quadrante.
 * Guarda os sistemas solares e os inicializa/administra.
 * Faz varias outras coisas tambem.
 * 
 * @author Gabriel
 *
 */
public class Quadrant {
	
	public String quadrantName = "";//Nome do quadrante
	public double quadrantSeed;//Seed do quadrante
	public ArrayList<SolarSys> _solarSys;//ArrayList com os sistemas solares
	public int nunberOfStars;//numero de estrelas
	public int nunberOfStarsInRange = 0;//numero de estrelas no alcance
	public int[] quadrantCoords = new int[3];//coordenadas do quadrante na galaxya

	/**
	 * Mï¿½todo construtor inicializador do quadrante.
	 * Calcula os atributos, inicializa os Systemas, etc...
	 * 
	 * @param x Coordenada X do quadrante.
	 * @param y Coordenada Y do quadrante
	 * @param z Coordenada Z do quadrante
	 * @param nOfStars número de estrelas no quadrante
	 */
	public Quadrant(int x, int y, int z, int nOfStars) {
		//=====
		//seta as coordenadas do quadrante
		//=====
		this.quadrantCoords[0]=x;
		this.quadrantCoords[1]=y;
		this.quadrantCoords[2]=z;
		//=====
		//Seta o numero de estrelas no quadrante.
		//=====
		this.nunberOfStars = nOfStars;
		//=====
		//Calcula a seed unica do quadrante
		//=====
		this.quadrantSeed = ((x+(2*y)+(3*z)+nOfStars)/5);
		//=====
		//Calcula o nome do quadrante
		//=====
		this.quadrantName=(this.quadrantSeed+"-"+x+"-"+y+"-"+z);
		//=====
		//Inicializa as estrelas
		//=====
		igniteStars(200);
	}//Quadrant
	
	/**
	 * Cria os sistemas solares no quadrante dentro do raio de alcance especificado (em anos luz).
	 * 
	 * @param r
	 */
	public void igniteStars(double r){
		double seed = this.quadrantSeed;
		this._solarSys = new ArrayList<SolarSys>();
		//=====
		//Main loop de criacao de estrelas!
		//=====
		for(int i=0;i<this.nunberOfStars;i++){
			double sysX=0,sysY=0,sysZ=0;
			//=====
			//Define as coordenadas do sistema
			//=====
			sysX = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysX;
			sysY = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysY;
			sysZ = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysZ;
<<<<<<< HEAD
			//=====
			//Calcula se esta em alcance
			//=====
			double deltaS = Math.sqrt((50*50)+(50*50)+(50*50));
			//=====
			//Cria o systema completamente
			//=====
			if(deltaS<=r){
				SolarSys tempSys = new SolarSys(i,sysX,sysY,sysZ,this.quadrantSeed,this.quadrantName);
				this._solarSys.add(tempSys);
				this.nunberOfStarsInRange++;
			}	
=======
			
			System.out.println("Criando estrela!");
			System.out.println("==================================================");
			
			SolarSys tempSys = new SolarSys(i,sysX,sysY,sysZ,this.quadrantSeed,this.quadrantName);
			
			System.out.println("Estrela criada!");
			System.out.println("==================================================");
			
			this._solarSys.add(tempSys);
			
			System.out.println("Estrela armazenada!");
			System.out.println("==================================================");
			
<<<<<<< HEAD
>>>>>>> parent of 1a6b1e3... Mais coisas
=======
>>>>>>> parent of 1a6b1e3... Mais coisas
		}
	}//igniteStars
<<<<<<< HEAD
<<<<<<< HEAD
		
	/**
	 * Retorna o sistema solar, no indice 'i'
	 * 
	 * @param i indice
	 * @return SolarSys
	 */
	public SolarSys getSolarSys(int i){
		return this._solarSys.get(i);
	}//getSolarSys
	
	/**
	 * Retorna o nome do Quadrante
	 * @return quadrantName
	 */
	public String getQuadrantName(){
		return this.quadrantName;
	}//getQuadrantName
	
	/**
	 * Retorna a seed do quadrante
	 * @return getQuadrantSeed
	 */
	public double getQuadrantSeed(){
		return this.quadrantSeed;
	}//getQuadrantSeed
	
	/**
	 * Retorna o numero de estrelas no quadrante
	 * @return nunberOfStars
	 */
	public int getNumberOfStars(){
		return this.nunberOfStars;
	}//getNumberOfStars
	
	/**
	 * Retorna um array com as coordenadas do quadrante
	 * @return quadrantCoords
	 */
	public int[] getQuadrantCoords(){
		return this.quadrantCoords;
	}
=======
>>>>>>> parent of 1a6b1e3... Mais coisas
=======
>>>>>>> parent of 1a6b1e3... Mais coisas

}
