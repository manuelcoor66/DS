#include <iostream>
#include "ComponenteEquipo.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"

using namespace std;

int main() {
    int tipo; 
    Bus *bus;
    Disco *disco;
    Tarjeta *tarjeta;
    VisitantePrecio vp;
    VisitantePrecioDetalle vpd;

    cout << "Introduzca el tipo de cliente [0 = normal, 1 = estudiante(10% descuento), 2 = mayorista(15% descuento)]: ";
    cin >> tipo;

    cout << endl << endl;

    vp.visitarBus(*bus, tipo);
    vp.visitarTarjeta(*tarjeta, tipo);
    vp.visitarDisco(*disco, tipo);

    cout << endl << endl;

    vpd.visitarBus(*bus, tipo);
    vpd.visitarTarjeta(*tarjeta, tipo);
    vpd.visitarDisco(*disco, tipo);
}