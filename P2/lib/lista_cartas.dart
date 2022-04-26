import 'package:flutter/material.dart';
import 'dart:math';
//import 'package:searchfield/searchfield.dart';
import 'tablero.dart';
import 'home.dart';
import 'carta.dart';
import 'jugador.dart';
import 'jugadorIA.dart';
import 'jugadorPersona.dart';


class lista_cartas extends StatefulWidget {
  const lista_cartas({Key? key}) : super(key: key);

  @override
  State<lista_cartas> createState() => _lista_cartasState();
}

class _lista_cartasState extends State<lista_cartas> {

  Map data = {};

  void actualizar(index) async{
      carta aux = data[index];
      await aux.color;
      await aux.numero;
      Navigator.pop(context, {
        'color': aux.color,
        'numero': aux.numero,
      });
  }

  void getData() async{

  }

  @override
  void initState(){
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    data = ModalRoute.of(context)?.settings.arguments as Map;
    List<carta> cartasJ = data['mano'];


void updateCarta(index) async{
  List<carta> aux2 = [];
  carta aux = cartasJ[index];

  aux2.add(aux);

  Navigator.pop(context,{
    'mano': aux2,
  });
}

    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.green[900],
        title: Text('Tu mazo',
          style: TextStyle(
          fontSize: 40,
          fontWeight: FontWeight.bold,
          letterSpacing: 2,
          color: Colors.red,
          fontFamily: 'Mario',
        ),
        ),
        centerTitle: true,

      ),
      body: ListView.builder(
        itemCount: cartasJ.length,
        itemBuilder: (context, index){
          return Card(
            child: ListTile(
              onTap: (){
                updateCarta(index);
              },
              title: Text(' ${cartasJ[index].numero} ${cartasJ[index].color}'),
              leading: CircleAvatar(
                backgroundImage: AssetImage('assets/${cartasJ[index].color}${cartasJ[index].numero}.png'),
              ),
            ),
          );
        },
      ),
    );
  }
}
