package dandObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.*;

import javax.imageio.ImageIO;

/**
 * Classe responsavel pela galaxia.
 * Gera e armazena o quadrante apartir da imagem da galaxia em uso.
 * 
 * @author Gabriel
 *
 */
public class Galaxy {
	
	public Quadrant _quadrant;//Quadrante atual em memoria.
	public BufferedImage mainMap = null;//Mapa da galaxia em memoria.
	public static final String mapName = "MainMap.jpg";//Nome do mapa
	public static final String mapAddress = "."+File.separator+"dat"+File.separator+"GalaxyMap"+File.separator;//Add do mapa no sistema
	
	/**
	 * Construtor
	 * Carrega o mapa em memoria.
	 * 
	 */
	public Galaxy(){
				//=====
				//Carrega o mapa em memoria!
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
	}//Galaxy
	
	/**
	 * Metodo criador do quadrante.
	 * Inicializa o quadrante, calculando a dencidade de estrelas com base no posicionamento do mesmo
	 * e mapa galatico de dencidade estelar.
	 * 
	 * @param x coordenada x do quadrante
	 * @param y coordenada y do quadrante
	 * @param z coordenada z do quadrante
	 */
	public void generateQuadrant(int x,int y,int z){
		//=====
		//Calcula a dencidade de estrelas no quadrante!
		//=====
		double cons = (4E-3 / 10066329), corr = 0;
		int cor = Math.abs(mainMap.getRGB(x, y)), aresta = 100;
		int a = this.mainMap.getHeight();
		BigDecimal p1 = new BigDecimal((-(400 * z * (-3 * a + 100 * z))));
		BigDecimal p2 = new BigDecimal((9 * a * a));
		double p = p1.divide(p2,new MathContext(5)).doubleValue();
		corr = 6E-6 * cor;
		int numberOfStars = (int) (p * cons * cor * corr * aresta * aresta * aresta);
		//=====
		//Inicializa o quadrante!
		//=====
		this._quadrant = new Quadrant(x,y,z,numberOfStars);	
	}//generateQuadrant
	
	
	/**
	 * Metodo que retorna o quadrante em questao.
	 * 
	 * @return Quadrante
	 */
	public Quadrant getQuadrant(){
		return this._quadrant;
	}//getQuadrant

}//Galaxy
