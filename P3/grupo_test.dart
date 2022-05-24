import 'package:flutter/material.dart';
import 'package:test/test.dart';
import '/home/pablo/StudioProjects/yi/lib/tablero.dart';
import '/home/pablo/StudioProjects/yi/lib/jugador.dart';
import '/home/pablo/StudioProjects/yi/lib/carta.dart';
import '/home/pablo/StudioProjects/yi/lib/jugadorIA.dart';
import '/home/pablo/StudioProjects/yi/lib/jugadorPersona.dart';

void main(){

  jugadorPersona player1 = new jugadorPersona();
  jugadorIA player2 = new jugadorIA();

  List<jugador> jugadores = [];
  jugadores.add(player1);
  jugadores.add(player2);

  group('Grupo de interaccion tablero-jugadores-carta', () {
    test('valores inicales del contructor con parámetros', ()  {
      jugadorPersona player1 = new jugadorPersona();
      jugadorIA player2 = new jugadorIA();

      List<jugador> jugadores = [];
      jugadores.add(player1);
      jugadores.add(player2);


      final tablero1 = new tablero(jugadores);
      expect(tablero1.mazo.length, 39); //Se asigna una a ultimaCarta una, por tanto debe haber 40 - 1 cartas en el mazo
      expect(tablero1.jugadores.length, 2);
      expect(tablero1.numeroRonda, 0);
    });

    test('valor 7 en ambos juagdores', () {
      jugadorPersona player1 = new jugadorPersona();
      jugadorIA player2 = new jugadorIA();
      List<jugador> jugadores = [];
      jugadores.add(player1);
      jugadores.add(player2);

      final tablero1 = new tablero(jugadores);
      tablero1.asignarCartas(0);
      tablero1.asignarCartas(1);

      expect(tablero1.jugadores[0].mano.length, 7);
      expect(tablero1.jugadores[1].mano.length, 7);
    });

    test('valor 7 en ambos juagdores', () {
      jugadorPersona player1 = new jugadorPersona();
      jugadorIA player2 = new jugadorIA();

      List<jugador> jugadores = [];
      jugadores.add(player1);
      jugadores.add(player2);


      final tablero1 = new tablero(jugadores);
      tablero1.asignarCartas(0);
      tablero1.asignarCartas(1);

      expect(tablero1.jugadores[0].mano.length, 7);
      expect(tablero1.jugadores[1].mano.length, 7);
    });

    test('valor != 7 en el jugador (o roba carta o echa una)', () {
      final tablero1 = new tablero(jugadores);
      tablero1.asignarCartas(1);

      tablero1.jugar();

      expect(tablero1.jugadores[1].mano.length != 7, true);
    });

    test('valor != 7 en el jugador (o roba carta o echa una)', () {
      jugadorPersona player1 = new jugadorPersona();
      jugadorIA player2 = new jugadorIA();

      List<jugador> jugadores = [];
      jugadores.add(player1);
      jugadores.add(player2);


      final tablero1 = new tablero(jugadores);
      tablero1.asignarCartas(1);

      tablero1.jugadores[1].robar_carta(tablero1.mazo);

      expect(tablero1.jugadores[1].mano.length, 8);
    });

    test('valor != 7 en el jugador (o roba carta o echa una)', () {
      jugadorPersona player1 = new jugadorPersona();
      jugadorIA player2 = new jugadorIA();

      List<jugador> jugadores = [];
      jugadores.add(player1);
      jugadores.add(player2);


      final tablero2 = new tablero(jugadores);
      tablero2.ultimaCarta.color='rojo';
      tablero2.ultimaCarta.numero=4;

      tablero2.jugadores[1].mano.add(tablero2.mazo[22]);
      tablero2.jugadores[1].cartas_restantes++;

      carta c=tablero2.jugadores[1].elegir_carta(tablero2.ultimaCarta);

      expect(tablero2.ultimaCarta.color == c.color, true);
    });


  });

}