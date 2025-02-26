package testcases;

import libs.WEB;

public class AccountMgmtTests {

	public static void main(String[] args) {
		
		WEB.launchBrowser("Chrome");
		WEB.navigate("Accounts");
		WEB.click("//xpath");
		WEB.setText("//xpath", "CHetan");

	}

}
