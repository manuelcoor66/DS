import 'dart:math';

import 'package:flutter/material.dart';
import '/lista_cartas.dart';

import 'home.dart';
import 'juego.dart';
import 'package:dcdg/dcdg.dart';


void main() => runApp(MaterialApp(
  debugShowCheckedModeBanner: false,
  initialRoute: '/home',
  routes: {
    '/home': (context) => Home(),
    '/juego': (context) => Juego(),
    '/lista_cartas': (context) => lista_cartas(),
  },
));