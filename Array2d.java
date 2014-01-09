package week1;

public class Array2d {

	public void Computation(){
	int[][] matrix = new int [5][7];
	
	for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(i+j+ " ");
			}
		System.out.print("\n");				
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Array2d object = new Array2d();
			object.Computation();
		
		
	}

}