package Creditcards;

import Offers.OfferVisitor;

public class GoldCard implements CreditCards{
    @Override
    public String getName() {
        return "Gold";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitGoldCreditCard(this);
    }
}
