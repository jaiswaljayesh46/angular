package com.pattern.structural.proxy;

public class WebPageImpl implements WebPage {
    @Override
    public void renderPage(String url)  throws Exception{
        System.out.println(url + " render successfully");
    }
}
