package hw01;


public class hw02 {

	public static void multiplyTable(String[][] table) {

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				int x = Integer.parseInt(table[i][j]);
				System.out.print(x * 2 + ", ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] table = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		multiplyTable(table);
	}

}
