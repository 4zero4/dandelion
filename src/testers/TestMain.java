package testers;

import dandObjects.*;

public class TestMain {
	
	public static Galaxy galaxia;

	public static void main(String[] args) {
		
		
		galaxia = new Galaxy();
		
		countNumberOfStarsInGalaxy();
		
		
	}
	
	public static void countNumberOfStarsInGalaxy(){
		long number = 0;
		
		for(int y=0;y<1000;y++){
			
			for(int x=0;x<1000;x++){
				
				System.out.println("==========\nX:"+x+"/1000\nY:"+y+"/1000\nStars so far: "+number);
				
				for(int z=0;z<=30;z++){
					
					galaxia.generateQuadrant(x, y, z);
					number+=galaxia.getNumberOfStarsInQuadrant();
					
					//System.out.print(".");
				}//Z
			}//Y
		}//X
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(number);
	}//countNumberOfStarsInGalaxy

}
