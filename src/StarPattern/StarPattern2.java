package StarPattern;

public class StarPattern2 {

	public static void main(String[] args) {
		// output:
		// 1 1 1 1 1
		// 2 2 2 2 2
		// 3 3 3 3 3
		// 4 4 4 4 4
		// 5 5 5 5 5 

		int flag = 1;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(flag);
			}
			flag++;
			System.out.println();

		}

	}

}
