#ifndef TARJETA_H
#define TARJETA_H

#include "ComponenteEquipo.h"

class Tarjeta : public ComponenteEquipo {
public:
    Tarjeta();

    void aceptar(VisitanteEquipo &ve);
};

#endif