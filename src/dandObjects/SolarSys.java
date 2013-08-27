/**
 * Classe responsável pelos sistemas solares.
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

	public SolarSys(int i,double sysX, double sysY, double sysZ, double quadrantSeed,
			String quadrantName) {
		
		//=====
		//Seta as coordenadas do sistema.
		//=====
		this.solarSysCoord[0]=sysX;
		this.solarSysCoord[1]=sysY;
		this.solarSysCoord[2]=sysZ;
		
		//=====
		//Seta a seed única para o sistema
		//=====
		this.solarSysSeed=((sysX+sysY*2+sysZ*3+quadrantSeed)/6);
		
		//=====
		//Seta o nome do sistema.
		//=====
		this.solarSysName=(quadrantName+"-"+i);
		
	}

}
