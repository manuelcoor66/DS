import 'package:flutter/material.dart';
import 'jugador.dart';
import 'carta.dart';
import 'dart:math';


class tablero{
  int numeroRonda = 0;
  var jugadores = <jugador>[];
  int numJugadores = 0;
  var ultimaCarta = carta();
  List<carta> mazo = [];

  tablero(List<jugador> jugadores) {
    this.jugadores = jugadores;
    this.numJugadores = jugadores.length;

    for (int i = 1; i <= 4; i++) {
      for (int j = 0; j < 10; j++) {
        var aux = carta();

        if(i == 1){
          aux.color = "azul";
        } else if(i == 2){
          aux.color = "amarillo";
        } else if(i == 3){
          aux.color = "rojo";
        } else if(i == 4){
          aux.color = "verde";
        }
        aux.numero = j;
        mazo.add(aux);
      }
    }

    var random = new Random();
    var numero = random.nextInt(mazo.length);

    this.ultimaCarta = mazo[numero];
    mazo.removeAt(numero);
  }

  tablero.vacio() {}

  int getNumeroRonda() {
    return numeroRonda;
  }

  jugador getJugador(int numero) {
    return jugadores[numero];
  }

  List<jugador> getJugadores() {
    return jugadores;
  }

  int getNumeroJugadores() {
    print('${mazo[1].numero}');
    print('${mazo[1].color}');

    return numJugadores;
  }

  carta getUltimaCarta() {
    return ultimaCarta;
  }

  List<carta> getMazo() {
    return mazo;
  }

  void asignarCartas(int indice) {
    for (int i = 0; i < 7; i++) {
      var random = new Random();
      var numero = random.nextInt(mazo.length);

      jugadores[indice].mano.add(mazo[numero]);
      mazo.removeAt(numero);
      jugadores[indice].cartas_restantes++;
    }
  }

  void jugar() {
      var carta1 = new carta();
      carta1 = jugadores[1].elegir_carta(ultimaCarta);
      if (carta1.getColor() == "blanco" && carta1.getNumero() == -1)
        mazo = jugadores[1].robar_carta(mazo);
      else {
        mazo.add(ultimaCarta);
        ultimaCarta = carta1;
      }

  }
}

