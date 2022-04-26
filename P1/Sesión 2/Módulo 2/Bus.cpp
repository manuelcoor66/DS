#include <iostream>
#include "Bus.h"
#include "VisitanteEquipo.h"

using namespace std;

Bus::Bus() {}

void Bus::aceptar(VisitanteEquipo &ve) {
        ve.visitarBus(*this, tipo);
}