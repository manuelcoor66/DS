import 'package:flutter/material.dart';
import 'carta.dart';
import 'dart:math';

class jugador {
  List<carta> mano = [];
  int cartas_restantes = -1;

  jugador() {
    cartas_restantes = mano.length;
  }

  carta elegir_carta(cartan) {
    return mano[0];
  }

  robar_carta(mazo) {

  }
}