package hw01;

public class hw7 {

	public void draw7(int n) {

		for (int i = 1; i <= n * n; i++) {
			System.out.print(i);
			if (i % n == 0) {
				System.out.print("\n");
			}

		}

	}

	public static void main(String[] args) {
		hw7 hw7 = new hw7();
		hw7.draw7(4);
		// TODO Auto-generated method stub

	}

}
