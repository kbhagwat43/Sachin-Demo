package StarPattern;

public class StarPattern3 {

	public static void main(String[] args) {
		// output:
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5

		int flag = 1;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(flag);
				flag++;

			}
			flag=1;
			System.out.println();

		}

	}

}
