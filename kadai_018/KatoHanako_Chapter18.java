package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	public KatoHanako_Chapter18() {
		this.familyName = "加藤";
		this.givenName = "花子";
		this.address = "東京都中野区○×";
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
