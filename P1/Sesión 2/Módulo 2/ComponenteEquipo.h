#ifndef COMPENENTEEQUIPO_H
#define COMPONENTEEQUIPO_H

using namespace std;

class VisitanteEquipo;
class Tarjeta;
class Disco;
class Bus;

class ComponenteEquipo {
private:
    double precio;
    string nombre;

public:
    int tipo;
    ComponenteEquipo();

    void aceptar(VisitanteEquipo &ve);
};

#endif