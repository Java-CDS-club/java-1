package com.bank.cardcaller;

import com.bank.cardbody.GoldCard;
import com.bank.cardbody.SilverCard;

public class Card implements SilverCard,GoldCard  {

	
	@Override
	public void mobilePayment() {
		// TODO Auto-generated method stub
		System.out.println("mobile payment in gold card");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdrawal in gold/silver card");
	}

	@Override
	public void shopping() {
		// TODO Auto-generated method stub
		System.out.println("shopping in gold/silver card");
	}

}
