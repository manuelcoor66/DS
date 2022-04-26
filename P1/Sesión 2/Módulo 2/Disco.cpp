#include <iostream>
#include "Disco.h"
#include "VisitanteEquipo.h"

using namespace std;

Disco::Disco() {}

void Disco::aceptar(VisitanteEquipo &ve) {
    ve.visitarDisco(*this, tipo);
}