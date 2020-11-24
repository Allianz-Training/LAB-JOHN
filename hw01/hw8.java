package hw01;

public class hw8 {
	
	public void draw8(int n) {
		int c=0;
		for(int i=n*n;i>=1;i--) {
			System.out.print(i);
			c++;
			if(c==n) {
				System.out.println();
				c=0;
			}
		}
		
	}

	public static void main(String[] args) {
		hw8 hw8 = new hw8();
		hw8.draw8(4);
		// TODO Auto-generated method stub
		
		

	}

}
