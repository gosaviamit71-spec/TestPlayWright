package com.testplaywrite;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestPlaywiteExample {
	 public static void main(String[] args) {
		
	        
	        
		 System.out.println("********************Started*******************************");
	        Playwright playwright = Playwright.create();
	        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions()
	        		.setChannel("chrome")
	        		.setHeadless(false)
	        		.setArgs(List.of("--start-maximized")));
	        BrowserContext browserContext=browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
	        Page page=browserContext.newPage();
	        page.navigate("https://www.amazon.in");
	        page.locator("#twotabsearchtextbox").fill("lenovo laptop foldable 15 inch touch screen");
	        page.locator("#nav-search-submit-text").click();
	        page.waitForTimeout(1000);
	        System.out.println(page.title());
	        System.out.println("********************Completed*******************************");
	        page.close();
            browser.close();
            System.exit(0);
	        
//	        try (Playwright playwright = Playwright.create()) {
//				
//				 // 1. Launch installed Google Chrome Browser browser =
//				
//				
//	   
//	            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
//	                    		 .setChannel("chrome") // Forces Playwright to use local Google Chrome
//	                            .setHeadless(false)
//	                            .setArgs(List.of("--start-maximized"))); // Cleaner alternative
//
//	            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
//	                            .setViewportSize(null));
//	             Page page = context.newPage();
//
//	            // 3. Navigate to Gmail
//	            page.navigate("https://mail.google.com/");
//
//	            // 4. Enter Email / Username
//	            page.locator("input[id='identifierId']").fill("gosaviamit71@gmail.com");
//	            page.locator("xpath=//*[@id='identifierNext']//button//span").click();
//
//		
//
//	            // Pause to observe login progress
//	            page.waitForTimeout(1000);
//	            System.out.println(page.title());
//	            assertThat(page).hasTitle("Couldn’t sign you in");
//	            browser.close();
//	        }
	    }

}
