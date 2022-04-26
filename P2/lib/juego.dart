import 'package:flutter/material.dart';
import 'dart:math';
//import 'package:searchfield/searchfield.dart';
import 'tablero.dart';
import 'home.dart';
import 'carta.dart';
import 'jugador.dart';
import 'jugadorIA.dart';
import 'jugadorPersona.dart';

class Juego extends StatefulWidget {


  carta cartainicial = new carta();
  //juego juego1 = new juego();


  jugadorIA jugadoria = new jugadorIA();
  jugadorPersona jugadorpersona = new jugadorPersona();
  List<jugador> jugadores = [];
  tablero tablero1 = new tablero.vacio();

  crearJuego(){
    jugadores.add(jugadorpersona);
    jugadores.add(jugadoria);
    tablero1 = new tablero(jugadores);
    tablero1.asignarCartas(0);
    tablero1.asignarCartas(1);

  }

  Juego(){

  }


  @override
  _juegoState createState() => _juegoState();
}

class _juegoState extends State<Juego> {
  Juego actual = new Juego();


  _juegoState(){
    this.actual.crearJuego();
  }

  setTablero(carta){
    this.actual.tablero1.ultimaCarta = carta;
  }
  @override
  Widget build(BuildContext context) {
    int cartasIA = this.actual.tablero1.jugadores[1].cartas_restantes;
    int cartasJ = this.actual.tablero1.jugadores[0].cartas_restantes;
    carta cartaTablero = this.actual.tablero1.getUltimaCarta();


    return Scaffold(
        appBar: AppBar(
        title: Text(
          'Super YI ',
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
                'assets/juego.png',
                scale: 0.1,
              ),
              alignment: Alignment.center,
            ),
            Expanded(
              child: Row(
                children: <Widget>[
                  Expanded(
                    child: Container(
                      alignment: Alignment.centerRight,
                      child: Text(
                        '${cartasIA} X ',
                        style: TextStyle(
                          fontSize: 50,
                          fontWeight: FontWeight.bold,
                          letterSpacing: 2,
                          color: Colors.white,
                          fontFamily: 'Mario',
                        ),
                      ),
                    ),
                  ),
                  Expanded(
                    child: Container(
                      height: 80,
                      alignment: Alignment.centerLeft,
                      child: Image.asset(
                        'assets/reverso.png',
                      ),
                    ),
                  ),
                ],
              ),
            ),Expanded(
              child: Row(
                children: <Widget>[
                  Expanded(
                    child: Container(
                      alignment: Alignment.center,
                      child: Image.asset(
                        'assets/${this.actual.tablero1.ultimaCarta.getColor()}${this.actual.tablero1.ultimaCarta.getNumero()}.png'
                      ),

                    ),
                  ),
                ],
              ),
            ),Expanded(
              child: Row(
                children: <Widget>[
                  Expanded(
                    child: Container(
                      alignment: Alignment.centerRight,
                      child: RaisedButton(
                        onPressed: () async{
                          dynamic result = await  Navigator.pushNamed(context, '/lista_cartas', arguments: {
                            'mano': actual.jugadorpersona.mano,
                          });

                            setState((){
                              bool jugada=false;
                              cartaTablero = result['mano'][0];
                              if (cartaTablero.numero == this.actual.tablero1.getUltimaCarta().getNumero() || cartaTablero.color == this.actual.tablero1.getUltimaCarta().getColor()){
                                setTablero(cartaTablero);
                                this.actual.jugadorpersona.elegir_carta(cartaTablero);
                                jugada = true;
                                if (this.actual.jugadorpersona.cartas_restantes == 0){
                                  showDialog(
                                    context: context,
                                    builder: (context) => AlertDialog(
                                      title: Text('JUGADOR 1 HA GANADO'),
                                      content: Text('Enhorabuena!!!!'),
                                      actions: <Widget>[
                                        FlatButton(
                                          child: Text('OK'),
                                          onPressed: () {
                                            Navigator.of(context).pop('OK');
                                            Navigator.of(context).pop('OK');
                                          },
                                        ),
                                      ],
                                    ),
                                  );

                                }

                              }else{
                                showDialog(
                                  context: context,
                                  builder: (context) => AlertDialog(
                                    title: Text('Lo siento!!'),
                                    content: Text('No puedes echar esta carta'),
                                    actions: <Widget>[
                                      FlatButton(
                                        child: Text('OK '),
                                        onPressed: () {
                                          Navigator.of(context).pop('OK');
                                        },
                                      ),
                                    ],
                                  ),
                                );
                              }
                              if(jugada) {
                                Future.delayed(Duration(seconds: 3), () async{
                                      setState((){
                                        this.actual.tablero1.jugar();
                                        if (this.actual.jugadoria.cartas_restantes == 0){
                                          showDialog(
                                            context: context,
                                            builder: (context) => AlertDialog(
                                              title: Text('JUGADOR IA HA GANADO'),
                                              content: Text('Enhorabuena!!!!'),
                                              actions: <Widget>[
                                                FlatButton(
                                                  child: Text('OK'),
                                                  onPressed: () {
                                                    Navigator.of(context).pop('OK');
                                                    Navigator.of(context).pop('OK');
                                                  },
                                                ),
                                              ],
                                            ),
                                          );
                                        }
                                      });
                                    });
                                }
                            });
                        },
                        child: Text('Cartas: ${cartasJ}',style: TextStyle(
                          fontSize: 20,
                          fontWeight: FontWeight.bold,
                          letterSpacing: 2,
                          color: Colors.black,
                          fontFamily: 'Mario',
                        ),
                        ),
                      ),
                     padding: EdgeInsets.fromLTRB(30, 0, 30, 0),
                    ),
                  ),
                  Expanded(
                    child: Container(
                      alignment: Alignment.centerLeft,
                      child: RaisedButton(
                        onPressed: () async{
                          setState((){
                            this.actual.jugadorpersona.robar_carta(this.actual.tablero1.getMazo());
                              Future.delayed(Duration(seconds: 3), () async{
                                setState((){
                                  this.actual.tablero1.jugar();
                                  if (this.actual.jugadoria.cartas_restantes == 0){
                                    showDialog(
                                      context: context,
                                      builder: (context) => AlertDialog(
                                        title: Text('JUGADOR IA HA GANADO'),
                                        content: Text('Enhorabuena!!!!'),
                                        actions: <Widget>[
                                          FlatButton(
                                            child: Text('OK'),
                                            onPressed: () {
                                              Navigator.of(context).pop('OK');
                                              Navigator.of(context).pop('OK');
                                            },
                                          ),
                                        ],
                                      ),
                                    );
                                  }
                                });
                              });
                          });
                        },
                        child: Text('Robar',style: TextStyle(
                          fontSize: 20,
                          fontWeight: FontWeight.bold,
                          letterSpacing: 2,
                          color: Colors.black,
                          fontFamily: 'Mario',
                        ),
                        ),
                      ),
                      padding: EdgeInsets.fromLTRB(30, 0, 30, 0),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
        backgroundColor: Colors.lightGreen[900],
    );
  }
}
