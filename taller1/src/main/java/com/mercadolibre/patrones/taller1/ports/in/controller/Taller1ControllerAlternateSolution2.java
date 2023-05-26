package com.mercadolibre.patrones.taller1.ports.in.controller;

import com.mercadolibre.patrones.taller1.ExecutionMode;
import com.mercadolibre.patrones.taller1.service.ReputationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Taller1ControllerAlternateSolution2 {

  @Autowired
  ReputationService service;
  Logger logger = LoggerFactory.getLogger(Taller1ControllerAlternateSolution2.class);

  @GetMapping("/another2/user/{seller_id}/reputation1")
  public String retrieve1(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");
    return service.retrieveSellerReputation(sellerId, ExecutionMode.OLD_REPUTATION);
  }

  @GetMapping("/another2/user/{seller_id}/reputation2")
  public String retrieve2(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");
    return service.retrieveSellerReputation(sellerId, ExecutionMode.NEW_REPUTATION);
  }

  @GetMapping("/another2/user/{seller_id}/reputation3")
  public String retrieve3(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");
    return service.retrieveSellerReputation(sellerId, ExecutionMode.SIMULATOR_REPUTATION);
  }

  @GetMapping("/another2/user/{seller_id}/reputation4")
  public String retrieve4(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");
    return service.retrieveSellerReputation(sellerId, ExecutionMode.OLD_REPUTATION_SIMULATOR);
  }
}
