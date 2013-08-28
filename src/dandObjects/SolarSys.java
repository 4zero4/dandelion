/**
 * Classe respons�vel pelos sistemas solares.
 */
package dandObjects;

import java.util.*;

/**
 * @author Gabriel
 *
 */
public class SolarSys {
	
	public ArrayList<Star> _stars;
	public String solarSysName = "";
	public double solarSysSeed;
	public double[] solarSysCoord = new double[3];

	/**
	 * Metodo construtor
	 * Recebe
	 * @param i indice da estrela
	 * @param sysX coordenada x
	 * @param sysY coordenada y
	 * @param sysZ coordenada z
	 * @param quadrantSeed seed do quadrante
	 * @param quadrantName nome do quadrante
	 */
	public SolarSys(int i,double sysX, double sysY, double sysZ, double quadrantSeed,
			String quadrantName) {
		
		//=====
		//Seta as coordenadas do sistema.
		//=====
		this.solarSysCoord[0]=sysX;
		this.solarSysCoord[1]=sysY;
		this.solarSysCoord[2]=sysZ;
		
		//=====
		//Seta a seed �nica para o sistema
		//=====
		this.solarSysSeed=((sysX+sysY*2+sysZ*3+quadrantSeed)/6);
		
		//=====
		//Seta o nome do sistema.
		//=====
		i+=1;
		this.solarSysName=(quadrantName+"-"+i);
		
		System.out.println("Estrela:"+this.solarSysName+" criada!\nSeed:"+this.solarSysSeed+"\nX:"+this.solarSysCoord[0]+"\nY:"+this.solarSysCoord[1]+"\nZ:"+this.solarSysCoord[2]+"");
		System.out.println("==================================================");
		
	}

}
