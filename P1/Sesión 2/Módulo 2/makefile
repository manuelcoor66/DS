ejecutable: Cliente.o ComponenteEquipo.o Disco.o Bus.o Tarjeta.o VisitanteEquipo.o VisitantePrecio.o VisitantePrecioDetalle.o
	g++ Cliente.o ComponenteEquipo.o Disco.o Bus.o Tarjeta.o VisitanteEquipo.o VisitantePrecio.o VisitantePrecioDetalle.o -o ejecutable

Cliente.o: Cliente.cpp Bus.h ComponenteEquipo.h Disco.h Equipo.h Tarjeta.h VisitanteEquipo.h VisitantePrecio.h VisitantePrecioDetalle.h
	g++ -c Cliente.cpp

ComponenteEquipo.o: ComponenteEquipo.cpp ComponenteEquipo.h
	g++ -c ComponenteEquipo.cpp

Disco.o: Disco.cpp Disco.h VisitanteEquipo.h
	g++ -c Disco.cpp

Bus.o: Bus.cpp Bus.h VisitanteEquipo.h
	g++ -c Bus.cpp

Tarjeta.o: Tarjeta.cpp Tarjeta.h VisitanteEquipo.h
	g++ -c Tarjeta.cpp

VisitanteEquipo.o: VisitanteEquipo.cpp VisitanteEquipo.h
	g++ -c VisitanteEquipo.cpp  

VisitantePrecio.o: VisitantePrecio.cpp VisitantePrecio.h
	g++ -c VisitantePrecio.cpp

VisitantePrecioDetalle.o: VisitantePrecioDetalle.cpp VisitantePrecioDetalle.h
	g++ -c VisitantePrecioDetalle.cpp

clean:
	rm -rf *.o ejecutable