package Offers;

import Creditcards.BronzeCard;
import Creditcards.GoldCard;
import Creditcards.SilverCard;

public interface OfferVisitor {
    void visitBronzeCreditCard(BronzeCard b);
    void visitSilverCreditCard(SilverCard s);
    void visitGoldCreditCard(GoldCard g);


}
