package com.mercadolibre.patrones.taller1.decorator;

public class ReputationDecorator implements Reputation{
      private Reputation reputation;
      public ReputationDecorator(Reputation source) {
            reputation = source;
      }
      @Override
      public String retrieveSellerReputation(String sellerId) {
            return reputation.retrieveSellerReputation(sellerId);
      }
}
