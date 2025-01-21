package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Janken_Chapter26 {
	public String getMyChoice() {
		System.out.println("自分のジャンケンの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input);

		switch (input) {
		case "r":
			return input;
		case "s":
			return input;
		case "p":
			return input;
		default:
			System.out.println("ジャンケンの手として、r,s,pのいずれかを入力してください");
			return getMyChoice();
		}

	}

	public String getRandom() {
		String[] enemy = new String[3];
		enemy[0] = "r";
		enemy[1] = "s";
		enemy[2] = "p";

		int random = (int) Math.floor(Math.random() * 3);
		switch (random) {
		case 0:
			return enemy[0];
		case 1:
			return enemy[1];
		case 2:
			return enemy[2];
		default:
			return null;
		}

	}

	public void playGame() {
		HashMap<String, String> jankenValue = new HashMap<String, String>();
		jankenValue.put("r", "グー");
		jankenValue.put("s", "チョキ");
		jankenValue.put("p", "パー");

		String myHand = getMyChoice();
		String enemyHand = getRandom();

		System.out.println("自分の手は" + jankenValue.get(myHand));
		System.out.println("対戦相手の手は" + jankenValue.get(enemyHand));

		if (myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		} else if ((myHand.equals("r") && enemyHand.equals("s")) ||
				(myHand.equals("s") && enemyHand.equals("p")) ||
				(myHand.equals("p") && enemyHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
