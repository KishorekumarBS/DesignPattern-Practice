package Creditcards;

import Offers.OfferVisitor;

public interface CreditCards {
    String getName();
    void accept(OfferVisitor v);

}
