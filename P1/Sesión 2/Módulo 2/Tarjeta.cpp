#include <iostream>
#include "Tarjeta.h"
#include "VisitanteEquipo.h"

using namespace std;

Tarjeta::Tarjeta() {}

void Tarjeta::aceptar(VisitanteEquipo &ve) {
    ve.visitarTarjeta(*this, tipo);
}