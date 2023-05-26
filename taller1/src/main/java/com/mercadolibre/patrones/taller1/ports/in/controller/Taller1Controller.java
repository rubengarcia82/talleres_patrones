package com.mercadolibre.patrones.taller1.ports.in.controller;

import com.mercadolibre.patrones.taller1.decorator.NewReputationDecorator;
import com.mercadolibre.patrones.taller1.decorator.OldReputation;
import com.mercadolibre.patrones.taller1.decorator.ReputationDecorator;
import com.mercadolibre.patrones.taller1.decorator.SimuladorDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Taller1Controller {

  Logger logger = LoggerFactory.getLogger(Taller1Controller.class);

  @GetMapping("/user/{seller_id}/reputation1")
  public String retrieve1(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "";

    ReputationDecorator encoded = new ReputationDecorator(new OldReputation());
    response = encoded.retrieveSellerReputation(sellerId);

    return response;
  }

  @GetMapping("/user/{seller_id}/reputation2")
  public String retrieve2(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "";

    ReputationDecorator encoded = new NewReputationDecorator(new OldReputation());
    response = encoded.retrieveSellerReputation(sellerId);

    return response;
  }

  @GetMapping("/user/{seller_id}/reputation3")
  public String retrieve3(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "";

    ReputationDecorator encoded = new SimuladorDecorator(new NewReputationDecorator(new OldReputation()));
    response = encoded.retrieveSellerReputation(sellerId);

    return response;
  }

  @GetMapping("/user/{seller_id}/reputation4")
  public String retrieve4(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "";

    ReputationDecorator encoded = new SimuladorDecorator((new OldReputation()));
    response = encoded.retrieveSellerReputation(sellerId);

    return response;
  }

}
