/**
 * Classe responsavel pela galaxia.
 * Gera e armazena o quadrante apartir da imagem da galaxia em uso.
 * 
 */
package dandObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author Gabriel
 *
 */
public class Galaxy {
	
	public Quadrant _quadrant;//Quadrante atual em memoria.
	
	public BufferedImage mainMap = null;//Mapa da galaxia em memoria.
	
	public static final String mapName = "MainMap.jpg";//Nome do mapa
	
	public static final String mapAddress = ".\\dat\\";//Add do mapa no sistema
	
	/**
	 * Metodo criador do quadrante.
	 * Inicializa o quadrante, calculando a dincidade de estrelas com base no posicionamento do mesmo
	 * e mapa galatico de dencidade estelar.
	 * 
	 * @param x coordenada x do quadrante
	 * @param y coordenada y do quadrante
	 * @param z coordenada z do quadrante
	 */
	public void generateQuadrant(int x,int y,int z){
		
		//=====
		//Carrega o mapa em memoria!
		System.out.println("Carrega o mapa em memoria!");
		System.out.println("==================================================");
		//=====
		try {
			this.mainMap = ImageIO.read(new File(mapAddress + mapName));
		} catch (IOException e) {
			System.out.println("============ ERRO!!! ===============");
			System.out.println(">>> Mapa Principal (" + mapName + ") N�o encontrado!");
			System.out.println(">>> Dir: (\"" + mapAddress + mapName + "\")");
			System.err.println(e);
			System.out.println("====================================");
			e.printStackTrace();
			System.out.println("====================================");
		}
		
		//=====
		//Calcula a dencidade de estrelas no quadrante!
		System.out.println("Calcula a dencidade de estrelas no quadrante!");
		System.out.println("==================================================");
		//=====
		double cons = (4E-3 / 10066329), p = 0, corr = 0;
		int cor = Math.abs(mainMap.getRGB(x, y)), aresta = 100;
		if (z == 0 || z == 30) {
			p = 0;
		} else if (z == 1 || z == 29) {
			p = 0.06;
		} else if (z == 2 || z == 28) {
			p = 0.12;
		} else if (z == 3 || z == 27) {
			p = 0.23;
		} else if (z == 4 || z == 26) {
			p = 0.29;
		} else if (z == 5 || z == 25) {
			p = 0.36;
		} else if (z == 6 || z == 24) {
			p = 0.41;
		} else if (z == 7 || z == 23) {
			p = 0.47;
		} else if (z == 8 || z == 22) {
			p = 0.53;
		} else if (z == 9 || z == 21) {
			p = 0.59;
		} else if (z == 10 || z == 20) {
			p = 0.65;
		} else if (z == 11 || z == 19) {
			p = 0.70;
		} else if (z == 12 || z == 18) {
			p = 0.77;
		} else if (z == 13 || z == 17) {
			p = 0.85;
		} else if (z == 14 || z == 16) {
			p = 0.9;
		} else if (z == 15){
			p = 1;
		} else {
			p = 0;
		}
		corr = 7.5E-6 * cor;
		int numberOfStars = (int) (p * cons * cor * corr * aresta * aresta * aresta);
		
		//=====
		//Inicializa o quadrante!
		System.out.println("Inicializa o quadrante!");
		System.out.println("==================================================");
		//=====
		
		this._quadrant = new Quadrant(x,y,z,numberOfStars);
		
		
	}//generateQuadrant
	
	public int getNumberOfStarsInQuadrant(){
		return this._quadrant.nunberOfStars;
	}
	
	/**
	 * Metodo que retorna o quadrante em questao.
	 * 
	 * @return Quadrante
	 */
	public Quadrant getQuadrant(){
		return this._quadrant;
	}//getQuadrant

}//Galaxy
