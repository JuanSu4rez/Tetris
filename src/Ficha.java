
public class Ficha {

	private int[][] matrizFicha;	
	
	/* Fichas
	 * 
	 * 1   ■
	 * 
	 * 2   ■ 
	 * 	   ■ ■ ■	    
	 *
	 * 3   ■ ■
	 * 	 	 ■ ■	
     *   
     *       ■ ■   
	 * 4   ■ ■ 
	 *   
	 * 5   ■ ■ ■ ■
	 * 
	 *       ■  
	 * 6   ■ ■ ■
	 * 
	 * 7   ■ ■
	 *     ■ ■
	 *     
	 * 8   ■ ■ ■
	 * 	   ■   ■ 
	 * */
	public Ficha(int forma){
		matrizFicha = new int[4][4];
		
		switch (forma) {
		case 1:
			matrizFicha[0][0] = 1;
			break;
		case 2:
			matrizFicha[0][0] = 1;			
			matrizFicha[1][0] = 1;
			matrizFicha[1][1] = 1;
			matrizFicha[1][2] = 1;
			break;
		case 3:
			matrizFicha[0][0] = 1;			
			matrizFicha[0][1] = 1;
			matrizFicha[1][1] = 1;
			matrizFicha[1][2] = 1;
			break;
		case 4:
			matrizFicha[0][2] = 1;			
			matrizFicha[0][1] = 1;
			matrizFicha[1][0] = 1;
			matrizFicha[1][1] = 1;
			break;
		case 5:
			matrizFicha[0][0] = 1;			
			matrizFicha[0][1] = 1;
			matrizFicha[0][2] = 1;
			matrizFicha[0][3] = 1;
			break;
		case 6:
			matrizFicha[0][1] = 1;			
			matrizFicha[1][0] = 1;
			matrizFicha[1][1] = 1;
			matrizFicha[1][2] = 1;
			break;
		case 7:
			matrizFicha[0][0] = 1;	
			matrizFicha[0][1] = 1;
			matrizFicha[1][0] = 1;
			matrizFicha[1][1] = 1;
			break;
		case 8:
			matrizFicha[0][0] = 1;			
			matrizFicha[0][1] = 1;
			matrizFicha[0][2] = 1;
			matrizFicha[1][1] = 1;
			break;
			
		default:
			break;
		}		
	}	 	
	
	public int[][] getFicha(){
		return matrizFicha;
	}
	
	public void setFicha(int[][] m){
		for (int i = 0; i < m.length; i++) 
			for (int j = 0; j < m.length; j++) 
				matrizFicha[i][j] = m[i][j];	
	}
	
}
