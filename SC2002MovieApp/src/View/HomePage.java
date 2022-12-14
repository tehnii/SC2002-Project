package View;

import Helper.Helper;
//import Helper from "../src/Helper.java";

public class HomePage {
	/**
	 * Main display menu for the home page
	 * 
	 * @param isLogin integer value to indicate if user is a guest, registered user
	 *                or admin
	 */
	public static void displayMenu(int isLogin) {
		// Registered User
		if (isLogin == 1) {
			Helper.line(80, "=");
			System.out.println("WELCOME TO MOVIE BOSS");
			Helper.line(80, "=");
			System.out.println("1. View All Movie");
			System.out.println("2. View Transaction");
			System.out.println("3. Review a movie");
			System.out.println("4. Book a Movie");
			System.out.println("5. Sign out");
			System.out.println("6. Quit");
		}
		// Admin
		else if (isLogin == 2) {
			Helper.line(80, "=");
			System.out.println("WELCOME TO MOVIE BOSS");
			Helper.line(80, "=");
			System.out.println("1. View All Movie");
			System.out.println("2. View All Transaction");
			System.out.println("3. Edit System Settings");
			System.out.println("4. Edit Movie Details");
			System.out.println("5. Add Shows");
			System.out.println("6. Sign out");
			System.out.println("7. Quit");

		}
		// Guest
		else {
			Helper.line(80, "=");
			System.out.println("WELCOME TO MOVIE BOSS");
			Helper.line(80, "=");
			System.out.println("1. View All Movie");
			System.out.println("2. Login");
			System.out.println("3. Register");
			System.out.println("4. Book a Movie");
			System.out.println("5. Quit");
		}

	}

}
