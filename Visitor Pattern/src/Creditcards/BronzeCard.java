package Creditcards;

import Offers.OfferVisitor;

public class BronzeCard implements CreditCards{
    @Override
    public String getName() {
        return "Bronze";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitBronzeCreditCard(this);
    }

}
