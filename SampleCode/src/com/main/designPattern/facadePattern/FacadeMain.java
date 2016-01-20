package com.main.designPattern.facadePattern;

import com.main.designPattern.facadePattern.FacadeInterface.shopType;

public class FacadeMain {

    public static void main(String[] args) {

	String shopDetailsOnLine = FacadeInterface.getShopType(shopType.ONLINE);
	String shopDetailsOffLine = FacadeInterface.getShopType(shopType.OFFLINE);

	System.out.println("Online shop details are :" + shopDetailsOnLine + "\n");
	System.out.println("Offline shop details are :" + shopDetailsOffLine);
    }

}
