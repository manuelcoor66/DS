#ifndef BUS_H
#define BUS_H

using namespace std;
#include "ComponenteEquipo.h"

class VisitanteEquipo;


class Bus : public ComponenteEquipo {
public:
    Bus();

    void aceptar(VisitanteEquipo &ve);
};

#endif