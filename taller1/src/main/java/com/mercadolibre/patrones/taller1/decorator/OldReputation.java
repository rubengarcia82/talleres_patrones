package com.mercadolibre.patrones.taller1.decorator;

public class OldReputation implements Reputation{

  @Override
    public String retrieveSellerReputation(String sellerId) {
      return String.format("Reputacion calculada para el seller: %s", sellerId);
    }
}
