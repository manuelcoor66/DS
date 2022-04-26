#ifndef VISITANTEPRECIODETALLE_H
#define VISITANTEPRECIODETALLE_H

#include "VisitanteEquipo.h"

class Bus;
class Disco;
class Tarjeta;

using namespace std;

class VisitantePrecioDetalle : public VisitanteEquipo {
public:
    VisitantePrecioDetalle();

    void visitarBus(Bus &b, int tipo) override;

    void visitarDisco(Disco &d, int tipo) override;

    void visitarTarjeta(Tarjeta &t, int tipo) override;
};

#endif