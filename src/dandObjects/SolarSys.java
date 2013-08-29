package dandObjects;

import java.util.*;

/**
 * Classe responsável pelos sistemas solares.
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
		//Seta a seed única para o sistema
		//=====
		this.solarSysSeed=((sysX+sysY*2+sysZ*3*quadrantSeed)/6);
		//=====
		//Seta o nome do sistema.
		//=====
		i+=1;
		this.solarSysName=(quadrantName+"-"+i);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	}
	
	public void generate() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Retorna o nome do sistema solar
	 * @return solarSysName
	 */
	public String getSolarSysName(){
		return this.solarSysName;
	}
	
	/**
	 * Retorna um array com as coordenadas do sistema solar
	 * @return solarSysCoord[]
	 */
	public double[] getSolarSysXCoord(){
		return this.solarSysCoord;
	}
	
	/**
	 * Retorna a seed do sistema solar
	 * @return
	 */
	public double getSolarSysSeed(){
		return this.solarSysSeed;
	}
=======
		
		System.out.println("Estrela:"+this.solarSysName+" criada!\nSeed:"+this.solarSysSeed+"\nX:"+this.solarSysCoord[0]+"\nY:"+this.solarSysCoord[1]+"\nZ:"+this.solarSysCoord[2]+"");
		System.out.println("==================================================");
		
	}
>>>>>>> parent of 1a6b1e3... Mais coisas

=======
		
		System.out.println("Estrela:"+this.solarSysName+" criada!\nSeed:"+this.solarSysSeed+"\nX:"+this.solarSysCoord[0]+"\nY:"+this.solarSysCoord[1]+"\nZ:"+this.solarSysCoord[2]+"");
		System.out.println("==================================================");
		
	}
>>>>>>> parent of 1a6b1e3... Mais coisas
=======
		
		System.out.println("Estrela:"+this.solarSysName+" criada!\nSeed:"+this.solarSysSeed+"\nX:"+this.solarSysCoord[0]+"\nY:"+this.solarSysCoord[1]+"\nZ:"+this.solarSysCoord[2]+"");
		System.out.println("==================================================");
		
	}
>>>>>>> parent of 1a6b1e3... Mais coisas

}
