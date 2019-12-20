package StarPattern;

public class StarPattern5 {

	public static void main(String[] args) {
		// output:
		// 5 4 3 2 1
		// 5 4 3 2 1
		// 5 4 3 2 1
		// 5 4 3 2 1
		// 5 4 3 2 1

		int flag = 5;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				
				System.out.print(flag);
				flag--;
			}
			flag=5;

		}

	}

}
