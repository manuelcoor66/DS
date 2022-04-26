#ifndef DISCO_H
#define DISCO_H

#include <iostream>
#include "ComponenteEquipo.h"

class VisitanteEquipo;

using namespace std;

class Disco : public ComponenteEquipo {
public:
    Disco();

    void aceptar(VisitanteEquipo &ve);
};

#endif