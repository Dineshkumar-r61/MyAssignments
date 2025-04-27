package week1.day2;

public class Browser {
    String launchBrowser(String browserName ){
	System.out.println("Browser launched sussessfully");
	return browserName;
	}
    
    void loadURL() {
    System.out.println("Application url loaded successfully");
    }
    
    public static void main(String[] args) {
    	Browser browser = new Browser();
        String RS = browser.launchBrowser("Chrome");
        System.out.println("browserName:"+" "+ RS);
        browser.loadURL();
	}  
}