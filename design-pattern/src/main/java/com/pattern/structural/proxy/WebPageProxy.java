package com.pattern.structural.proxy;

public class WebPageProxy implements WebPage{

    private WebPage webPage;

    public WebPageProxy() {
        this.webPage = new WebPageImpl();
    }

    @Override
    public void renderPage(String url)  throws Exception{
        if(url.equalsIgnoreCase("https://blockurl.com")){
             throw new Exception(url + " blocked by ISP provider");
        }else{
            webPage.renderPage(url);
        }
    }
}
