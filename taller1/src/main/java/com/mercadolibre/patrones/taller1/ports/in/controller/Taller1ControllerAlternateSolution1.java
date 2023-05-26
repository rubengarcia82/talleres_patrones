package com.mercadolibre.patrones.taller1.ports.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Taller1ControllerAlternateSolution1 {

  Logger logger = LoggerFactory.getLogger(Taller1ControllerAlternateSolution1.class);

  @GetMapping("/another1/user/{seller_id}/reputation1")
  public String retrieve1(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "Reputacion calculada para el seller: " + sellerId;
    return response;
  }

  @GetMapping("/another1/user/{seller_id}/reputation2")
  public String retrieve2(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "Reputacion calculada para el seller: " + sellerId;
    response += "\n" + "Color calculado -> naranja, salud -> mala";
    return response;
  }

  @GetMapping("/another1/user/{seller_id}/reputation3")
  public String retrieve3(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "Reputacion calculada para el seller: " + sellerId;
    response += "\n" + "Color calculado -> naranja, salud -> mala";
    response += "\n" + "En la nueva versión tu color será: rojo, salud -> mal";
    return response;
  }

  @GetMapping("/another1/user/{seller_id}/reputation4")
  public String retrieve4(@PathVariable("seller_id") final String sellerId){
    logger.info("Retrieving reputation...");

    String response = "Reputacion calculada para el seller: " + sellerId;
    response += "\n" + "En la nueva versión tu color será: rojo, salud -> mal";

    return response;
  }
}
