package com.structural.facade_02facade;

import com.structural.facade_01facadeclass.Mobile;
import com.structural.facade_01facadeclass.OppoMobile;
import com.structural.facade_01facadeclass.SamsungMobile;
import com.structural.facade_01facadeclass.VivoMobile;

public class MobileStoreFacade {

	private Mobile oppoMobile;
	private Mobile samsungMobile;
	private Mobile vivoMobile;

	public MobileStoreFacade() {
		super();
		this.oppoMobile = new OppoMobile();
		this.samsungMobile = new SamsungMobile();
		this.vivoMobile = new VivoMobile();
	}

	public void getOppoMobileDetails() {
		oppoMobile.model();
		oppoMobile.price();
	}

	public void getSamsungMobileDetails() {
		samsungMobile.model();
		samsungMobile.price();
	}

	public void getVivoMobileDetails() {
		vivoMobile.model();
		vivoMobile.price();
	}

	public void getMobileDetails(String mobile) {
		if (mobile.equals("Oppo")) {
			getOppoMobileDetails();
		} else if (mobile.equals("Samsung")) {
			getSamsungMobileDetails();
		} else if (mobile.equals("Vivo")) {
			getVivoMobileDetails();
		} else {
			System.out.println("Not available");
		}
	}

}
