package StarPattern;

public class StarPattern4 {

	public static void main(String[] args) {
		// output:
		// A B C D E
		// A B C D E
		// A B C D E
		// A B C D E
		// A B C D E

		char flag = 'A';

		for (char i = 'A'; i <= 'E'; i++) {

			for (char j = 'A'; j <= 'E'; j++) {

				System.out.print(flag);
				flag++;

			}
			flag='A';
			System.out.println();

		}

	}

}
