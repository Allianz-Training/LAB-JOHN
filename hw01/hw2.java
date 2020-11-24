package hw01;

public class hw2 {

	public void draw2(int n) {
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		hw2 hw2 =new hw2();
		hw2.draw2(6);
		// TODO Auto-generated method stub

	}

}
