import 'package:flutter/material.dart';
import 'jugador.dart';
import 'carta.dart';
import 'dart:math';
import 'carta.dart';

class jugadorIA extends jugador {
  jugadorIA() : super();

  @override
  carta elegir_carta(cartan){
    bool fin = false;
    var cartaM = carta();
    cartaM.cartaColorSet("blanco");
    cartaM.cartaNumeroSet(-1);

    for (int i = 0; i < cartas_restantes && !fin; i++) {
      if (mano[i].color == cartan.color || mano[i].numero == cartan.numero) {
        fin = true;
        cartaM = mano[i];
        mano.removeAt(i);
        cartas_restantes = mano.length;
      }
    }

    return cartaM;
  }


  robar_carta(mazo) {
    var nueva = carta();

    var random = new Random();
    var numero = random.nextInt(mazo.length);

    nueva = mazo[numero];
    mano.add(nueva);
    mazo.removeAt(numero);
   cartas_restantes = mano.length;
    return mazo;
  }
}