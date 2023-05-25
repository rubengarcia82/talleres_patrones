package com.mercadolibre.patrones.taller1.decorator;

public class NewReputationDecorator extends ReputationDecorator {

  public NewReputationDecorator(Reputation source) {
    super(source);
  }

  @Override
    public String retrieveSellerReputation(String sellerId) {
        String reputation = super.retrieveSellerReputation(sellerId);
        return reputation + "\n" + "Color calculado -> naranja, salud -> mala";
    }
}
