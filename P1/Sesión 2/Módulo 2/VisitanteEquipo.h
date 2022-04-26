#ifndef VISITANTEEQUIPO_H
#define VISITANTEEQUIPO_H

#include <iostream>

class Tarjeta;
class Disco;
class Bus;

using namespace std;

class VisitanteEquipo { //Es abstracta
public:
    VisitanteEquipo();

    virtual void visitarTarjeta(Tarjeta &t, int tipo);

    virtual void visitarDisco(Disco &d, int tipo);

    virtual void visitarBus(Bus &b, int tipo);
};

#endif