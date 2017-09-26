package com.bank.cardcaller;

import com.bank.cardbody.GoldCard;
import com.bank.cardbody.SilverCard;

public class Caller {
@SuppressWarnings("unused")
public static void main(String[] args) {
	SilverCard silvercard=new Card();
	GoldCard goldcard=new Card();
	/*silvercard.withdraw();
	silvercard.shopping();
	goldcard.withdraw();
	goldcard.shopping();
	goldcard.mobilePayment();*/
	((Card) silvercard).mobilePayment();      //doubt
    // ((GoldCard) silvercard).mobilePayment();
}
}
