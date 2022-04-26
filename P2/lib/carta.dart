import 'package:flutter/material.dart';
import 'dart:math';
//azul, amarillo, rojo, verde
class carta{

  String color = "blanco";
  int numero = -1;

  carta(){
    var random = new Random();
    this.numero = random.nextInt(10);

    var c = random.nextInt(4)+1;
    if(c == 1){
     this.color = "azul";
    } else if(c == 2){
       this.color = "amarillo";
    } else if(c == 3){
      this.color = "rojo";
    } else if(c == 4){
      this.color = "verde";
    }
  }

  void cartaColorSet(String color){
    this.color = color;
  }

  void cartaNumeroSet(int numero){
    this.numero = numero;
  }

  String getColor() {
    return color;
  }

  int getNumero() {
    return numero;
  }
}