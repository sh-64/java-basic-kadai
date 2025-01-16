package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName;
	public String givenName;
	public String address;

	public void commonIntroduce(final String familyName, final String givenName, final String address) {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	abstract public void eachIntroduce();

	public void execIntroduce() {
		commonIntroduce(familyName, givenName, address);
		eachIntroduce();
	}
}
