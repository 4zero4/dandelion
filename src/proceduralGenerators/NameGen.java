package proceduralGenerators;
/**
 * Classe geradora de nomes.
 * So isso.
 * 
 * @author Gabriel
 *
 */
public class NameGen {
	
	public static int a = 25136;//Valor seed a
	public static int b = 25256;//Valor seed b
	
	
	/**
	 * Metodo que gera nomes para os quadrantes.
	 * 
	 * @param ind
	 * @return
	 */
	public static String createQuadrantName(int ind){
		String name = "sy";//var onde sera montado o nome;
		int rest = 10;//
		
		while(ind>=0){
			System.out.println(rest);
			rest++;
			int temp = ind%rest;
			rest=rest*10;
			
			if(temp%2==0){
				temp=(((a * temp + b) % 10));
				switch(temp){
				case 0:name = name+"A";
					break;
				case 1:name = name+"A";
					break;
				case 2:name = name+"E";
					break;
				case 3:name = name+"E";
					break;
				case 4:name = name+"Y";
					break;
				case 5:name = name+"Y";
					break;
				case 6:name = name+"O";
					break;
				case 7:name = name+"O";
					break;
				case 8:name = name+"U";
					break;
				case 9:name = name+"U";
					break;
				default:name = name+"YY";
				}	
			}else{
				temp=(((a * temp + b) % 20));
				switch(temp){
				case 1:name = name+"B";
					break;
				case 2:name = name+"C";
					break;
				case 3:name = name+"D";
					break;
				case 4:name = name+"E";
					break;
				case 5:name = name+"F";
					break;
				case 6:name = name+"G";
					break;
				case 7:name = name+"H";
					break;
				case 8:name = name+"J";
					break;
				case 9:name = name+"K";
					break;
				case 10:name = name+"L";
					break;
				case 11:name = name+"M";
					break;
				case 12:name = name+"N";
					break;
				case 13:name = name+"P";
					break;
				case 14:name = name+"Q";
					break;
				case 15:name = name+"R";
					break;
				case 16:name = name+"S";
					break;
				case 17:name = name+"T";
					break;
				case 18:name = name+"W";
					break;
				case 19:name = name+"X";
					break;
				case 20:name = name+"Z";
					break;
				default:name = name+"YY";
					break;
				}
			}
			
		}
		
		return name;
	}//createName

}
