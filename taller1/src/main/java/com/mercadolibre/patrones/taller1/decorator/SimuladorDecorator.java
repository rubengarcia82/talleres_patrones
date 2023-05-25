package com.mercadolibre.patrones.taller1.decorator;

public class SimuladorDecorator extends ReputationDecorator {

  public SimuladorDecorator(Reputation source) {
    super(source);
  }
  @Override
    public String retrieveSellerReputation(String sellerId) {
        String reputation = super.retrieveSellerReputation(sellerId);
        return reputation + "\n" + "En la nueva versión tu color será: rojo, salud -> mal";
    }
}
