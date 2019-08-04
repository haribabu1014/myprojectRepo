package myproject1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] a= {10,20,30,40,50};
		
		for(int temp:a) {
			System.out.println(temp);
		}
		
		int[] a1=new int [5];
		a1[2]=30;
		a1[4]=50;
		for(int temp2:a1) {
			System.out.println(temp2);
		}
		
      */
		int temp=10;
		int[][] a=new int[4][3];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=temp;
				temp+=10;
				//System.out.println(a[i][j]);
				
				
			}
			
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
			System.out.println(a[i][j]+ " ");	
			}
			System.out.println();
		}
		
	}

}
