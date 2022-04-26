#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H

#include "VisitanteEquipo.h"

using namespace std;

class VisitantePrecio : public VisitanteEquipo { 
private:
    double valor;

public:
    VisitantePrecio();

    VisitantePrecio(int v);

    void visitarBus(Bus &b, int tipo) override;

    void visitarDisco(Disco &d, int tipo) override;

    void visitarTarjeta(Tarjeta &t, int tipo) override;
};

#endif