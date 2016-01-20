package com.main.designPattern.facadePattern;

public class OnlineShopImpl implements OnlineShopInterface {

    @Override
    public String getSiteAddress() {
	// TODO Auto-generated method stub
	return "hhtp://www.flipkart.com";
    }

    @Override
    public String getPortalName() {
	// TODO Auto-generated method stub
	return "Flipkart";
    }

}
