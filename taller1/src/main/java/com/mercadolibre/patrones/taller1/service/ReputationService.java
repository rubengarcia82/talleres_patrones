package com.mercadolibre.patrones.taller1.service;

import com.mercadolibre.patrones.taller1.ExecutionMode;
import org.springframework.stereotype.Service;

@Service
public class ReputationService {
  public String retrieveSellerReputation(String sellerId, ExecutionMode mode) {
    String response = "";
    switch (mode) {
      case OLD_REPUTATION:
        response = "Reputacion calculada para el seller: " + sellerId;
        break;
      case NEW_REPUTATION:
        response = "Reputacion calculada para el seller: " + sellerId;
        response += "\n" + "Color calculado -> naranja, salud -> mala";
        break;
      case SIMULATOR_REPUTATION:
        response = "Reputacion calculada para el seller: " + sellerId;
        response += "\n" + "Color calculado -> naranja, salud -> mala";
        response += "\n" + "En la nueva versión tu color será: rojo, salud -> mal";
        break;
      case OLD_REPUTATION_SIMULATOR:
        response = "Reputacion calculada para el seller: " + sellerId;
        response += "\n" + "En la nueva versión tu color será: rojo, salud -> mal";
        break;
    }
    return response;
  }
}
