import 'package:flutter/material.dart';

import 'dart:math';

import 'home.dart';
import 'juego.dart';

import 'tablero.dart';
import 'carta.dart';
import 'jugador.dart';
import 'jugadorIA.dart';
import 'jugadorPersona.dart';

class Home extends StatefulWidget {
  carta cartainicial = new carta();
  jugadorIA jugadoria = new jugadorIA();
  jugadorPersona jugadorpersona = new jugadorPersona();
  List<jugador> jugadores = [];
  tablero tablero1 = tablero.vacio();

  juego(){
    jugadores.add(jugadorpersona);
    jugadores.add(jugadoria);
    tablero1 = new tablero(jugadores);
  }

  empezarJuego() {
    tablero1.jugar();
  }


@override
  _homeState createState() => _homeState();
}

class _homeState extends State<Home> {
  Juego juego1 = new Juego();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(
            'Super YI',
            style: TextStyle(
              fontSize: 40,
              fontWeight: FontWeight.bold,
              letterSpacing: 2,
              fontFamily: 'Mario',
            ),
          ),
          centerTitle: true,
          backgroundColor: Colors.grey[800],
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.start,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: <Widget>[
            Container(
              child: Image.asset(
                'assets/menu.png',
                scale: 0.1,
              ),
              alignment: Alignment.center,
            ),
            Container(
              padding: EdgeInsets.fromLTRB(30, 100, 30, 30),
              color: Colors.lightGreen[900],
              alignment: Alignment.center,
              child: RaisedButton(
                onPressed: (){
                  Navigator.pushNamed(context, '/juego');
                },
                child: Text(
                  'Iniciar Nueva Partida',
                  style: TextStyle(
                    fontSize: 35,
                    fontWeight: FontWeight.bold,
                    letterSpacing: 2,
                    color: Colors.white,
                    fontFamily: 'Mario',
                  ),
                  textAlign: TextAlign.center,
                ),
                color: Colors.grey[800],
                shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(20)),
                padding: EdgeInsets.symmetric(horizontal: 40, vertical: 20),
              ),
            ),
          ],
        ),
        backgroundColor: Colors.lightGreen[900],
    );
  }
}
