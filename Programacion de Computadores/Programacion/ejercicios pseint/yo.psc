Algoritmo eleccion_fila
	Escribir "ingrese clientes en la fila 1"
	leer cFila1
	Escribir "ingrese clientes en la fila 2"
	leer cFila2
	Escribir "ingrese clientes en la fila 3"
	leer cFila3
	Escribir "ingrese clientes con mas de 20 productos en la fila 1"
	leer c20Fila1
	Escribir "ingrese clientes con mas de 20 productos en la fila 2"
	leer c20Fila2
	Escribir "ingrese clientes con mas de 20 productos en la fila 3"
	leer c20Fila3
	escribir "ingrese fila en la que hay amigo (si no hay, ingrese 0)"
	leer amigo
	si(amigo<>0) Entonces
		escribir"ingrese posicion del amigo"
		leer posAmigo
	Sino		//comparar cajas 1, 2 y 3
		si(cFila1<cFila2)Entonces
			si(cFila1<cFila3)
				filaMenor<- fila1
				posMenor<-cFila1
			sino
				si(cFila1>cFila3)Entonces
					filaMenor<- fila3
					posMenor<- cFila3
				Sino
					filaMenor<- fila1  //empate entre fila 1 y fila 3
					posMenor<-cFila1
				FinSi
			FinSi
		Sino
			si(cFila2<cFila1)Entonces
				si(cFila2<cFila3)Entonces
					filaMenor<-fila2
					posMenor<-cFila2
				Sino
					si(cFila3<cFila2)Entonces
						filaMenor<-fila3
						posMenor<-cFila3
					Sino
						filaMenor<- fila2 	//empate entre fila 2 y fila 3
						posMenor<-cFila2
					FinSi
				FinSi
				
			FinSi
			si(cFila2=cFila1)
			Sino //empate entre fila 1 y fila 2
			FinSi
			si(cFila3<cFila1)entonces
				cajaMenor<- fila3
				posMenor<-  cFila3
			Sino
				si(cFila1<cFila3)Entonces
					cajaMenor<- fila1 // fila 1 y fila 2 iguales
					posMenor<- cFila1
				Sino
					cajaMenor<-fila1	//todas las filas iguales
					posMenor<- cFila1 
				FinSi
			FinSi
		FinSi
		
	FinSi
	
	//seleccionar caja
	
	si (amigo<>0 y posAmigo<posMenor)Entonces
			caja<- posAmigo
		Sino
			si(cajaMenor=fila1)Entonces
				si()Entonces
					
				FinSi
				
				
				
			FinSi
	FinSi
	
FinAlgoritmo
