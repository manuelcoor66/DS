
import 'package:flutter/material.dart';
import 'package:test/test.dart';
import '/home/pablo/StudioProjects/yi/lib/tablero.dart';

void main(){

  group('tablero', () {
    test('valor 0', () {
      final tablero1 = new tablero.vacio();
      expect(tablero1.numeroRonda, 0);
    });

    test('valor []', () {
      final tablero1 = new tablero.vacio();
      expect(tablero1.jugadores, []);
    });

    test('valor 0', () {
      final tablero1 = new tablero.vacio();
      expect(tablero1.numJugadores, 0);
    });

    test('valor color distinto de blanco ', () {
      final tablero1 = new tablero.vacio();
      expect(tablero1.ultimaCarta.color != 'blanco', true);

    });

    test('valor []', () {
      final tablero1 = new tablero.vacio();
      expect(tablero1.mazo, []);
    });
  });

}
