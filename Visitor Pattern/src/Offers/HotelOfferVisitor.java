package Offers;

import Creditcards.BronzeCard;
import Creditcards.GoldCard;
import Creditcards.SilverCard;

public class HotelOfferVisitor implements OfferVisitor{

    @Override
    public void visitBronzeCreditCard(BronzeCard b) {
        System.out.println("Computing Hotel booking offer for Bronze Card.");
    }

    @Override
    public void visitSilverCreditCard(SilverCard s) {
        System.out.println("Computing Hotel booking offer for Silver Card.");
    }

    @Override
    public void visitGoldCreditCard(GoldCard g) {
        System.out.println("Computing Hotel booking offer for Gold Card.");
    }
}
