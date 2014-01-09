package week1;

public class Stations {

private static double [] stations = {0.0, 3.0, 5.0};
	
	public static double [][] getDistance(double[] stations){
	
		double distancemap[][] = new double [stations.length][stations.length];
		for(int i = 0; i < (distancemap.length); i++){
				for(int j = 0; j < distancemap[0].length; j++){			
					if(j > i){
						if(j < stations.length){
						distancemap[i][j] = Math.abs(stations[i] - stations[j]);
						}
					}
						
				}
		}	
		return distancemap;
		
	}
/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double	distancemap [][] = getDistance(stations);
		
	
		for(int i = 0; i < distancemap.length; i++){
			for(int j = 0; j < distancemap[0].length; j++){
				if(distancemap[i][j] != 0.0){
					System.out.print(distancemap[i][j] + " ");
				}
				else
				System.out.print(" -  ");
				
			}
			System.out.print("\n");
		}

	}

}