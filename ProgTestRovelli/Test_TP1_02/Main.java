
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Justifier myJustifier = new Justifier(10);
		
		myJustifier.appendText("Bonjours, comment vas tu ? Moi impéccable !");
		
		System.out.println(myJustifier.justifyText());
	}

}
