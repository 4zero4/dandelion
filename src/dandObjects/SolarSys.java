package dandObjects;

import java.io.File;
import java.io.IOException;
import java.util.*;

import proceduralGenerators.NameGen;

/**
 * Classe responsável pelos sistemas solares.
 * 
 * @author Gabriel
 * 
 */
public class SolarSys {

	ArrayList<Star> _stars;
	String solarSysName = "";
	double solarSysSeed;
	double[] solarSysCoord = new double[3];

	/**
	 * Metodo construtor Recebe:
	 * 
	 * @param i
	 *            indice da estrela
	 * @param sysX
	 *            coordenada x
	 * @param sysY
	 *            coordenada y
	 * @param sysZ
	 *            coordenada z
	 * @param quadrantSeed
	 *            seed do quadrante
	 * @param quadrantName
	 *            nome do quadrante
	 */
	public SolarSys(int i, double sysX, double sysY, double sysZ,
			double quadrantSeed, String quadrantName) {

		// =====
		// Seta as coordenadas do sistema.
		// =====
		this.solarSysCoord[0] = sysX;
		this.solarSysCoord[1] = sysY;
		this.solarSysCoord[2] = sysZ;

		// =====
		// Seta a seed única para o sistema
		// =====
		this.solarSysSeed = proceduralGenerators.Seeder.getSeed((sysX + sysY
				* 2 + sysZ * 3 + quadrantSeed) / 6);
		
		// =====
		// Seta a id temporaria do sistema
		// =====
		
		this.solarSysName=(quadrantName+"-"+i);

	}// SolarSys

	/**
	 * Detalha o sistema, criando suas estrelas, nome etc...
	 * 
	 */
	public void igniteSys() {

		// =====
		// Seta o nome do sistema.
		// =====
		System.out.println(".");
		NameGen nameGen = null;
		try {
			nameGen = new NameGen("." + File.separator + "dat" + File.separator
					+ "NameRules" + File.separator + "SystemName.txt",
					this.solarSysSeed);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.solarSysName = (nameGen.compose(3) + "-" + this.solarSysName);

	}

	// ==========
	// Geters
	// ==========

	/**
	 * Retorna o nome do sistema solar
	 * 
	 * @return String
	 */
	public String getSolarSysName() {
		return this.solarSysName;
	}

	public double getSolarSysXCoord() {
		return this.solarSysCoord[0];
	}

	public double getSolarSysYCoord() {
		return this.solarSysCoord[1];
	}

	public double getSolarSysZCoord() {
		return this.solarSysCoord[2];
	}

	public double getSolarSysSeed() {
		return this.solarSysSeed;
	}

}
