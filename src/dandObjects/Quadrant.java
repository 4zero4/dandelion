package dandObjects;
import java.util.ArrayList;



/**
 * Classe responsavel pelo quadrante.
 * Guarda os sistemas solares e os inicializa/administra.
 * Faz varias outras coisas tambem.
 * 
 * Sem metodos seters devido a sua natureza descartavel e dinamica, quer mudar algo? crie outro.
 * 
 * @author Gabriel
 *
 */
public class Quadrant {
	
	String quadrantName = "";//Nome do quadrante
	double quadrantSeed;//Seed do quadrante
	ArrayList<SolarSys> _solarSys;//ArrayList com os sistemas solares
	int nunberOfSystems;//numero de sistemas
	int[] quadrantCoords = new int[3];//coordenadas do quadrante na galaxya

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
		this.nunberOfSystems = nOfStars;
		
		//=====
		//Calcula a seed unica do quadrante
		//=====
		this.quadrantSeed = proceduralGenerators.Seeder.getSeed(((x+(2*y)+(3*z)*nOfStars)/5));
		
		//=====
		//Calcula o nome do quadrante
		//=====		
		
		this.quadrantName=(""+(x+(2*y)+(3*z)));
		
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
		for(int i=0;i<this.nunberOfSystems;i++){
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
	public void igniteStars(int r,double x,double y,double z){
		double seed = this.quadrantSeed;
		this._solarSys = new ArrayList<SolarSys>();
		
		//=====
		//Main loop de criacao de estrelas!
		//=====
		for(int i=0;i<this.nunberOfSystems;i++){
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
	
	//==========
	//Geters
	//==========
	
	/**
	 * Retorna o nome do quadrante
	 * @return String
	 */
	public String getQuadrantName(){
		return this.quadrantName;
	}//getQuadrantName
	
	/**
	 * Retorna o sistema solar na posicao i.
	 * @param i
	 * @return
	 */
	public SolarSys getSolarSys(int i){
		return this._solarSys.get(i);
	}//getSolarSys
	
	/**
	 * Retorna os systemas solares inicializados
	 * @return ArrayList<SolarSys>
	 */
	public ArrayList<SolarSys> getSolarSis(){
		return this._solarSys;
	}//getSolarSis
	
	/**
	 * Retorna o numero de sistemas no quadrante.
	 * @return
	 */
	public int getNumberOfSystems(){
		return this.nunberOfSystems;
	}//getNumberOfSystems

}//Quadrant
