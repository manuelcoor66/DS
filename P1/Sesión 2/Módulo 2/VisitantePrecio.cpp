#include <iostream>
#include "VisitantePrecio.h"

using namespace std;


VisitantePrecio::VisitantePrecio() {}

VisitantePrecio::VisitantePrecio(int v) : valor(v) {}

void VisitantePrecio::visitarBus(Bus &b, int tipo) {
    switch(tipo) {
        case 0:
            valor += 20;
            cout << "Tarjeta visitado por un cliente normal, el valor del equipo es de " << valor << "." << endl;
        break;
        case 1:
            valor += 18;
            cout << "Tarjeta visitado por un cliente estudiante, el valor del equipo es de " << valor << "." << endl;
        break;
        case 2:
        valor += 17;
            cout << "Tarjeta visitado por un cliente mayorista, el valor del equipo es de " << valor << "." << endl;
        break;
    }
}

void VisitantePrecio::visitarDisco(Disco &d, int tipo) {
    switch(tipo) {
        case 0:
            valor += 15;
            cout << "Tarjeta visitado por un cliente normal, el valor del equipo es de " << valor << "." << endl;
        break;
        case 1:
            valor += 13.5;
            cout << "Tarjeta visitado por un cliente estudiante, el valor del equipo es de " << valor << "." << endl;
        break;
        case 2:
        valor += 12.75;
            cout << "Tarjeta visitado por un cliente mayorista, el valor del equipo es de " << valor << "." << endl;
        break;
    }
}

void VisitantePrecio::visitarTarjeta(Tarjeta &t, int tipo) {
    switch(tipo) {
        case 0:
            valor += 30;
            cout << "Tarjeta visitado por un cliente normal, el valor del equipo es de " << valor << "." << endl;
        break;
        case 1:
            valor += 27;
            cout << "Tarjeta visitado por un cliente estudiante, el valor del equipo es de " << valor << "." << endl;
        break;
        case 2:
        valor += 25.5;
            cout << "Tarjeta visitado por un cliente mayorista, el valor del equipo es de " << valor << "." << endl;
        break;
    }
}