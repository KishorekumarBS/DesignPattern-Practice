package Creditcards;

import Offers.OfferVisitor;

public class SilverCard implements CreditCards{

    @Override
    public String getName() {
        return "Silver";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitSilverCreditCard(this);
    }
}
