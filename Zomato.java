import java.util.Scanner;

class Zomato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO ZOMATO");
		System.out.println("------------------------");
		System.out.println("HUMAN VERIFICATION");
		System.out.println("|||||||||||||||||||");
		System.out.println("ENTER ANY NUMBER TO REGISTER");
		int i = sc.nextInt();
		System.out.println("----------------------");
		System.out.println("REGISTER HERE");
		System.out.println("||||||||||||||||||||");

		System.out.println("ENTER USERNAME");
		String name = sc.next();

		System.out.println("ENTER PHONE NUMBER");
		int phone = sc.nextInt();

		System.out.println("EMAIL");
		String email = sc.next();

		System.out.println("ENTER PASSWORD (ENTER ONLY NUMBERS)");
		int pass = sc.nextInt();

		System.out.println("HUMAN VERIFICATION");
		System.out.println("|||||||||||||||||||");
		System.out.println("ENTER ANY NUMBER TO COMPLETE REGISTER");
		int numm = sc.nextInt();

		System.out.println("SUCCESSFULLY REGISTERED");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("KICK 1 TO LOGIN");
		int login = sc.nextInt();

		if (login == 1) {
			System.out.println("ENTER PHONE NUMBER");
			int newphone = sc.nextInt();

			System.out.println("PASSWORD");
			int newpass = sc.nextInt();

			if (phone == newphone && pass == newpass) {
				System.out.println("SUCCESSFULLY LOGINED");
				System.out.println("");
				System.out.println("");
				System.out.println("ZOMATO");

				System.out.println("PRESS 1 FOR ORDER FOOD");
				System.out.println("PRESS 2 FOR HISTORY");
				System.out.println("PRESS 3 FOR EXIT");
				int order = sc.nextInt();

				if (order == 1) {
					System.out.println("PRESS 1 FOR ORDER BIRYANI");
					System.out.println("PRESS 2 FOR ORDER ICE CREAM");
					int foods = sc.nextInt();

					if (foods == 1) {
						System.out.println("ENTER ADDRESS FOR PLACE A ORDER");
						String address = sc.next();
						System.out.println("__________________________________");
						System.out.println("ORDER SUCCEFULLY PLACED");
						System.out.println("CLICK NUMBER TO EXIT");
						int ex = sc.nextInt();
						System.out.println("THANK YOU FOR USING ZOMATO");
					}

					if (foods == 2) {
						System.out.println("ENTER ADDRESS FOR PLACE A ORDER");
						String address = sc.next();
						System.out.println("__________________________________");
						System.out.println("ORDER SUCCEFULLY PLACED");
						System.out.println("CLICK NUMBER TO EXIT");
						int ex = sc.nextInt();
						System.out.println("THANK YOU FOR USING ZOMATO");
					}
				}

				else if (order == 2) {
					System.out.println("PRESS 9 FOR ORDERS LIST");
					int list = sc.nextInt();

					switch (list) {
						case 9:
							System.out.println("Biryani and Icecream");
							break;
						default:
							System.out.println("invalid input");
					}
				}

				else if (order == 3) {
					System.out.println("THANK YOU FOR USING ZOMATO");
				}
			}

		}
	}
}
