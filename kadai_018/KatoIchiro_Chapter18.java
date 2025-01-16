package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	public KatoIchiro_Chapter18() {
		this.familyName = "加藤";
		this.givenName = "一郎";
		this.address = "東京都中野区○×";
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
