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
	 * Calcula os atributos, iniciais dos Systemas, etc...
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
		//Seta o numero de estrelas no quadrante.
		//=====
		this.nunberOfStars = nOfStars;
		
		//=====
		//Calcula a seed unica do quadrante
		//=====
		this.quadrantSeed = ((x+(2*y)+(3*z)*nOfStars)/5);
		
		//=====
		//Calcula o nome do quadrante
		//=====
		this.quadrantName=(this.quadrantSeed+"-"+x+"-"+y+"-"+z);
		
	}//Quadrant
	
	/**
	 * Inicializa todos os sistemas de uma vez
	 * 
	 */
	public void igniteStars(){
		double seed = this.quadrantSeed;
		this._solarSys = new ArrayList<SolarSys>();
		
		//=====
		//Main loop de criacao de estrelas!
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
			this._solarSys.add(tempSys);	
		}
	}//igniteStars
	
	/**
	 * Inicializa os sistemas de acordo com a localização do usuario.
	 * 
	 * @param r alcance da visao
	 * @param x x do usuario (em relacao ao quadrante)
	 * @param y y do usuario (em relacao ao quadrante)
	 * @param z z do usuario (em relacao ao quadrante)
	 */
	public void igniteStarsInRange(int r,double x,double y,double z){
		double seed = this.quadrantSeed;
		this._solarSys = new ArrayList<SolarSys>();
		
		//=====
		//Main loop de criacao de estrelas!
		//=====
		for(int i=0;i<this.nunberOfStars;i++){
			double sysX=0,sysY=0,sysZ=0;
			sysX = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysX;
			sysY = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysY;
			sysZ = proceduralGenerators.Seeder.getCoord(seed);
			seed = sysZ;
			double distance = Math.sqrt((sysX*sysX)+(sysY*sysY)+(sysZ*sysZ));
			if(distance<=r){
				SolarSys tempSys = new SolarSys(i,sysX,sysY,sysZ,this.quadrantSeed,this.quadrantName);
				this._solarSys.add(tempSys);
			}
		}
	}//igniteStars
	
	public SolarSys getSolarSys(int i){
		return this._solarSys.get(i);
	}//getSolarSys

}//Quadrant
