import java.util.*;

class Cu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		int num = s.nextInt();

		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println("count of digits is " + count);
	}
}
