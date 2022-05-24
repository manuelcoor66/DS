import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
//import 'package:test/test.dart';
import '/home/pablo/StudioProjects/yi/lib/tablero.dart';
import '/home/pablo/StudioProjects/yi/lib/jugador.dart';
import '/home/pablo/StudioProjects/yi/lib/carta.dart';
import '/home/pablo/StudioProjects/yi/lib/jugadorIA.dart';
import '/home/pablo/StudioProjects/yi/lib/jugadorPersona.dart';
import '/home/pablo/StudioProjects/yi/lib/home.dart';
import '/home/pablo/StudioProjects/yi/lib/main.dart';
import '/home/pablo/StudioProjects/yi/lib/juego.dart';
import '/home/pablo/StudioProjects/yi/lib/lista_cartas.dart';

void main() {
  testWidgets('Boton iniciar Partida', (WidgetTester tester) async {
    //Creamos los widgets
      await tester.pumpWidget(MaterialApp(home: Home()));
      expect (find.text('Iniciar Nueva Partida'), findsOneWidget);
});

  testWidgets('Incremento mazo jugador', (WidgetTester tester) async {
    //Creamos los widgets
    await tester.pumpWidget(MaterialApp(home: Juego()));
    expect (find.text('Cartas: 7'), findsOneWidget);
    expect (find.text('Cartas: 8'), findsNothing);

    await tester.tap(find.text('Robar'));
    await tester.pumpAndSettle(Duration(seconds: 3));



    expect (find.text('Cartas: 7'), findsNothing);
    expect (find.text('Cartas: 8'), findsOneWidget);

  });

  testWidgets('Seleccionar carta de juagador Humano', (WidgetTester tester) async{
    await tester.pumpWidget(MaterialApp(home: Juego()));

    expect(find.text('Mazo: 25'), findsOneWidget);

    await tester.tap(find.text('Robar'));
    await tester.pumpAndSettle(Duration(seconds: 3));

    expect(find.text('Mazo: 25'), findsOneWidget);
  });
}