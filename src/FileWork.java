import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileWork {
	static Scanner darkly = new Scanner(System.in);
	static Random rnd = new Random();
	static boolean secret = false, quit = false;
	static int counter = 0, room = 0;
	static int skeleton = 0, box = 0, dust = 0;
	static int piano = 0, scorpion = 0;
	static int gold = 0, spiders = 0;
	static int chest = 0, bats = 0;
	static int m1 = rnd.nextInt(1001), m2 = rnd.nextInt(1001), m3 = rnd.nextInt(1001);
	static int m4 = rnd.nextInt(1001), m5 = rnd.nextInt(1001), m6 = rnd.nextInt(1001);
	static int m7 = rnd.nextInt(1001), m8 = rnd.nextInt(1001), money = 0;
	static String lines = "";
	static File file = new File("rooms");

	private static void roomDescribe(String where, String[] stuff, String directions) {
		System.out.println("You are in " + where);
		System.out.println("You visted rooms " + counter + " times");
		System.out.println("You have found  " + room + " rooms");
		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}
		System.out.println("You can go " + directions);
		System.out.println("Enter \"History\" to check the room you visted at any time");

	}

	public static void room0(PrintWriter pw) {
		pw.close();
		int i = 1 + rnd.nextInt(4);
		System.out.println("You are outside of the house now.");
		System.out.println("Game over");
		System.out.println("Never come again.Hahahahaha");
		System.out.println("You visted rooms " + counter + " times");
		System.out.println("You have found  " + room + " rooms");
		System.out.println("You saw scorpion " + scorpion + " times");
		System.out.println("You saw piano " + piano + " times");
		System.out.println("You saw spiders " + spiders + " times");
		System.out.println("You saw dust " + dust + " times");
		System.out.println("You saw empty box " + box + " times");
		System.out.println("You saw bats " + bats + " times");
		System.out.println("You saw treasure chest " + chest + " times");
		System.out.println("You saw walking skeletons " + skeleton + " times");
		System.out.println("You saw gold " + gold + " times");
		System.out.println("You have " + money + " dollars in your pocket.");
		if (i == 2) {
			System.out.println("You are followed by a ghost of zork, hahahahahahaha");
		}

	}

	public static void room1(PrintWriter pw) {
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		String direct = " to the north (n) or the south (s)";
		scorpion++;
		counter++;

		pw.println(place + "       " + m1);
		pw.flush();

		if (m1 != 0) {
			money += m1;
			m1 = 0;
			room++;
		}

		do {
			roomDescribe(place, things, direct);

			String choice = darkly.next();
			if (choice.toLowerCase().equals("history")) {
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();

				} catch (IOException e) {
					System.out.println("Oops! An error occurred.");
				}
			}
			if (choice.equals("n")) {
				room2(pw);
			} else if (choice.equals("s")) {
				quit = true;
				room0(pw);
			}
		} while (quit == false);

	}

	public static void room2(PrintWriter pw) {
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a piano";
		String direct = " to the east (e), the south (s) or the west (w)";
		piano++;
		counter++;

		pw.println(place + "  " + m2);
		pw.flush();

		if (m2 != 0) {
			money += m2;
			m2 = 0;
			room++;
		}

		do {
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.toLowerCase().equals("history")) {
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();

				} catch (IOException e) {
					System.out.println("Oops! An error occurred.");
				}
			}

			if (choice.equals("s")) {
				room1(pw);
			} else if (choice.equals("e")) {
				room4(pw);
			} else if (choice.equals("w")) {
				room3(pw);
			}
		} while (quit == false);
	}

	public static void room3(PrintWriter pw) {
		String place = "the Library";
		String[] things = new String[1];
		things[0] = "spiders";
		String direct = " to the north (n) or the east (e)";
		spiders++;
		counter++;

		pw.println(place + "     " + m3);
		pw.flush();

		if (m3 != 0) {
			money += m3;
			m3 = 0;
			room++;
		}

		do {
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.toLowerCase().equals("history")) {
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();

				} catch (IOException e) {
					System.out.println("Oops! An error occurred.");
				}
			}

			if (choice.equals("n")) {
				room5(pw);
			} else if (choice.equals("e")) {
				room2(pw);
			}
		} while (quit == false);
	}

	public static void room4(PrintWriter pw) {
		String place = "the Kitchen";
		String[] things = new String[1];
		things[0] = "bats";
		String direct = " to the north (n) or the west (w)";
		bats++;
		counter++;

		pw.println(place + "     " + m4);
		pw.flush();

		if (m4 != 0) {
			money += m4;
			m4 = 0;
			room++;
		}

		do {
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.toLowerCase().equals("history")) {
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();

				} catch (IOException e) {
					System.out.println("Oops! An error occurred.");
				}
			}

			if (choice.equals("n")) {
				room7(pw);
			} else if (choice.equals("w")) {
				room2(pw);
			}
		} while (quit == false);
	}

	public static void room5(PrintWriter pw) {
		String place = "the Dining Room";
		String[] things = new String[1];
		things[0] = "dust and an empty box";
		String direct = " to the south (s)";
		dust++;
		box++;
		counter++;

		pw.println(place + " " + m5);
		pw.flush();

		if (m5 != 0) {
			money += m5;
			m5 = 0;
			room++;
		}

		do {
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.toLowerCase().equals("history")) {
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();

				} catch (IOException e) {
					System.out.println("Oops! An error occurred.");
				}
			}

			if (choice.equals("s")) {
				room3(pw);
			}
		} while (quit == false);
	}

	public static void room6(PrintWriter pw) {
		String place = "the Vault";
		String[] things = new String[1];
		things[0] = "three walking skeletons";
		skeleton++;
		counter++;

		pw.println(place + "       " + m6);
		pw.flush();

		if (m6 != 0) {
			money += m6;
			m6 = 0;
			room++;
		}

		Random rnd = new Random();
		int i = 1 + rnd.nextInt(4);
		if (i != 2) {

		} else {
			secret = true;
		}
		if (secret == false) {
			String direct = " to the east (e)";

			do {
				roomDescribe(place, things, direct);

				String choice = darkly.next();

				if (choice.toLowerCase().equals("history")) {
					try {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String line;
						while ((line = br.readLine()) != null) {
							System.out.println(line);
						}
						br.close();

					} catch (IOException e) {
						System.out.println("Oops! An error occurred.");
					}
				}

				if (choice.equals("e")) {
					room7(pw);
				}
			} while (quit == false);
		} else {
			String direct = " to the east normal door(n) or secret door(s)";

			do {
				roomDescribe(place, things, direct);

				String choice = darkly.next();

				if (choice.toLowerCase().equals("history")) {
					try {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String line;
						while ((line = br.readLine()) != null) {
							System.out.println(line);
						}
						br.close();

					} catch (IOException e) {
						System.out.println("Oops! An error occurred.");
					}
				}

				if (choice.equals("n")) {
					room7(pw);
				} else if (choice.equals("s")) {
					room8(pw);
				}
			} while (quit == false);

		}
	}

	public static void room7(PrintWriter pw) {
		String place = "the Parlor";
		String[] things = new String[1];
		things[0] = "a treasure chest";
		String direct = " to the west (w) or the south (s)";
		chest++;
		counter++;

		pw.println(place + "      " + m7);
		pw.flush();

		if (m7 != 0) {
			money += m7;
			m7 = 0;
			room++;
		}

		do {
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.toLowerCase().equals("history")) {
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();

				} catch (IOException e) {
					System.out.println("Oops! An error occurred.");
				}
			}

			if (choice.equals("w")) {
				room6(pw);
			} else if (choice.equals("s")) {
				room4(pw);
			}
		} while (quit == false);
	}

	public static void room8(PrintWriter pw) {
		String place = "the Secret Room";
		String[] things = new String[1];
		things[0] = "piles of gold";
		String direct = " to the west (w)";
		gold++;
		counter++;

		pw.println(place + " " + m8);
		pw.flush();

		if (m8 != 0) {
			money += m8;
			m8 = 0;
			room++;
		}

		do {
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.toLowerCase().equals("history")) {
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();

				} catch (IOException e) {
					System.out.println("Oops! An error occurred.");
				}
			}

			if (choice.equals("w")) {
				room6(pw);
			}
		} while (quit == false);
	}

	public static void main(String[] args) {
		try {
			file.createNewFile();
			PrintWriter pw = new PrintWriter(file);
			room1(pw);
			pw.close();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Oops! An error occurred.");
		}
	}

}