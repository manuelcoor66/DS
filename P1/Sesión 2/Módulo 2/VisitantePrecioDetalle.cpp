#include <iostream>
#include "VisitantePrecioDetalle.h"

using namespace std;

VisitantePrecioDetalle::VisitantePrecioDetalle() {}

void VisitantePrecioDetalle::visitarBus(Bus &b, int tipo) {
    switch (tipo) {
        case 0:
            cout << "Bus visitado por un cliente normal, su valor es de " << 20 << "." << endl;
        break;
        case 1:
            cout << "Bus visitado por un cliente estudiante, su valor es de " << 18 << "." << endl;
        break;
        case 2:
            cout << "Bus visitado por un cliente mayorista, su valor es de " << 17 << "." << endl;
        break;
    }
    
}

void VisitantePrecioDetalle::visitarDisco(Disco &d, int tipo) {
    switch (tipo) {
        case 0:
            cout << "Disco visitado por un cliente normal, su valor es de " << 15 << "." << endl;
        break;
        case 1:
            cout << "Disco visitado por un cliente estudiante, su valor es de " << 13.5 << "." << endl;
        break;
        case 2:
            cout << "Disco visitado por un cliente mayorista, su valor es de " << 12.75 << "." << endl;
        break;
    }
}

void VisitantePrecioDetalle::visitarTarjeta(Tarjeta &t, int tipo) {
    switch (tipo) {
        case 0:
            cout << "Tarjeta visitado por un cliente normal, su valor es de " << 30 << "." << endl;
        break;
        case 1:
            cout << "Tarjeta visitado por un cliente estudiante, su valor es de " << 27 << "." << endl;
        break;
        case 2:
            cout << "Tarjeta visitado por un cliente mayorista, su valor es de " << 25.5 << "." << endl;
        break;
    }
}