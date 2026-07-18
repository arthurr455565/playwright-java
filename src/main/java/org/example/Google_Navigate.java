package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Google_Navigate {

    public static void main(String[] args) {

        // Create Playwright instance
        try (Playwright playwright = Playwright.create()) {

            // Launch Chromium browser
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setHeadless(false)
            );

            // Create a new browser context
            BrowserContext context = browser.newContext();

            // Create a new page (tab)
            Page page = context.newPage();

            // Navigate to Google
            page.navigate("https://www.google.com");

            // Wait for 5 seconds
            page.waitForTimeout(5000);

            // Close browser
            browser.close();
        }
    }
}