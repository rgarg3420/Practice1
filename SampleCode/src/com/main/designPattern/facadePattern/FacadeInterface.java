package com.main.designPattern.facadePattern;

public class FacadeInterface {

    public enum shopType {
	ONLINE, OFFLINE;
    }

    public static String getShopType(shopType shoptype) {

	String shopDetails = "";
	switch (shoptype) {
	case ONLINE:

	    OnlineShopImpl onshop = new OnlineShopImpl();

	    shopDetails = onshop.getPortalName() + " " + onshop.getSiteAddress();

	    return shopDetails;

	case OFFLINE:
	    OfflineShopImpl ofshop = new OfflineShopImpl();
	    shopDetails = ofshop.getBrandName() + " " + ofshop.getShopAddress() + " " + ofshop.getShopContact();
	    return shopDetails;
	default:
	    System.out.println("NO SUCH OPTION!");

	    break;
	}
	return shopDetails;

    }

}
