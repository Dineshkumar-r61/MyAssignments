package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browserName = new Browser();
		String name = browserName.launchBrowser("Edge");
		System.out.println("browsername:"+" "+ name);
		browserName.loadURL();
	}

}