Algoritmo sin_titulo
	ingVenta<-0
	pizza1<-0
	pizza2<-0
	pizza3<-0
	repetir
	escribir "ingrese ingrediente bases de pizzas"
	leer base
	hasta que (base>=10 y base<=50)
	repetir
		escribir "ingrese ingrediente queso(Kg.)"
		leer queso
	hasta que (queso>=10 y queso<=20)
	repetir
		escribir "ingrese ingrediente jamon(Kg.) "
		leer jamon
	hasta que (jamon>=5 y jamon<=10)
	repetir
		escribir "ingrese ingrediente tomate(Kg.)"
		leer tomate
	hasta que (tomate>=10 y tomate<=15)
	repetir
		escribir "ingrese ingrediente champiñones(Kg.)"
		leer champ
	hasta que (champ>=5 y champ<=10)
	costoTotal<- base*500+queso*5000+jamon*2500+tomate*900+champ*3500
	
	repetir
		repetir
			escribir "ingrese tipo de pizza"
			leer tipoPizza
		Hasta Que tipoPizza>=1 y tipoPizza<=3
		repetir
			escribir "ingrese cantidad "
			leer cantPizza
		Hasta Que cantPizza>0
		si(tipoPizza=1) entonces
			si(base>=1*cantPizza y queso>=0.1*cantPizza y tomate>=0.2*cantPizza y jamon>=0.1*cantPizza)
			venta1<- venta1+cantPizza*2500
			base<-base-1*cantPizza
			queso<-queso-0.1*cantPizza
			tomate<- tomate-0.2*cantPizza
			jamon<-jamon-0.1*cantPizza
			pizza1<-pizza1+cantPizza
			escribir "el pedido cuesta:" cantPizza*2500
			sino
				escribir "No se puede realizar este pedido"
			finsi
		Sino
			si(tipoPizza=2) entonces
				si(base>=1*cantPizza y queso>=0.2*cantPizza y tomate>=0.2*cantPizza y champ>=0.1*cantPizza)
					venta2<- venta2+cantPizza*3000
					base<-base-1*cantPizza
					queso<-queso-0.2*cantPizza
					tomate<- tomate-0.2*cantPizza
					champ<-champ-0.1*cantPizza
					pizza2<-pizza2+cantPizza
					escribir "el pedido cuesta:" cantPizza*3000
				sino
					escribir "No se puede realizar este pedido"
				finsi
			Sino
				si(tipoPizza=3) entonces
					si(base>=1*cantPizza y queso>=0.2*cantPizza y champ>=0.2*cantPizza y jamon>=0.2*cantPizza)
						venta3<- venta3+cantPizza*3500
						base<-base-1*cantPizza
						queso<-queso-0.1*cantPizza
						champ<- champ-0.2*cantPizza
						jamon<-jamon-0.2*cantPizza
						pizza3<-pizza3+cantPizza
						escribir "el pedido cuesta:" cantPizza*3500
					sino
						escribir "No se puede realizar este pedido"
					finsi
				FinSi
			FinSi
		FinSi
		
		
	
		escribir "Desea continuar (si/no)"
		leer resp
	Hasta Que resp="no" o base=0 o queso <0.1
	venTotal<- venta1+venta2+venta3
	utilidad<- venTotal-costoTotal
	escribir"ventas de pizza 1" venta1	
	escribir"ventas de pizza 2" venta2
	escribir"ventas de pizza 3" venta3
	escribir "La utilidad del dia fue de $" utilidad
	escribir "ventas totales: $ " venTotal
	escribir "cantidad de pizza 1: " pizza1
	escribir "cantidad de pizza 2: " pizza2
	escribir "cantidad de pizza 3: " pizza3
	escribir "Cantidad total de pizzas: " pizza1+pizza2+pizza3
	escribir "Stock Bases " base
	escribir "Stock queso " queso
	escribir "Stock tomate " tomate
	escribir "stock jamon" jamon
	escribir "Stock champiñon " champ
	
	
	
	
FinAlgoritmo
