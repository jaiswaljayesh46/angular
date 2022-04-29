package com.pattern.structural.proxy;

public class BrowserMain {
    public static void main(String[] args) {
        WebPageProxy webPageProxy = new WebPageProxy();
        try {
            webPageProxy.renderPage("https://google.com");
            webPageProxy.renderPage("https://blockurl.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
=======o/p========
https://google.com render successfully
java.lang.Exception: https://blockurl.com blocked by ISP provider
	at com.pattern.structural.proxy.WebPageProxy.renderPage(WebPageProxy.java:14)
	at com.pattern.structural.proxy.BrowserMain.main(BrowserMain.java:8)
 */

