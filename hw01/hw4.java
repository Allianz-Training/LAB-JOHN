package hw01;

public class hw4 {
	public void draw4(int n) {
		for (int j = 0; j < n; j++) {
			for (int i = n; i >= 1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hw4 hw4 = new hw4();
		hw4.draw4(2);
	}

}
