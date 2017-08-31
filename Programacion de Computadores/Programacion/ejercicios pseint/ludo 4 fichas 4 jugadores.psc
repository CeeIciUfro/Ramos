Algoritmo sin_titulo
	escribir "bienvenidos al juego del ludo"
	cont1<-0
	cont2<-0
	cont3<-0
	cont4<-0
	gana1<-0
	gana2<-0
	gana3<-0
	gana4<-0
	repetir
		posicion<-0
		repetir
			escribir "turno jugador 1 " 
			dado<-(azar(6) +1)
			posicion1 <-dado+ posicion1
			cont1<- cont1+1
			si (posicion1>15) Entonces
				posicion1<- posicion1-15
				gana1<- gana1+1
			FinSi
			escribir "tu ficha quedo en la posicion " posicion1
			escribir "turno jugador 2 " 
			dado<-(azar(6) +1)
			posicion2 <-dado+ posicion2
			cont2<- cont2+1
			si (posicion2>15) Entonces
				posicion2<- posicion2-15
				gana2<- gana2+1
			FinSi
			escribir "tu ficha quedo en la posicion " posicion2
			escribir "turno jugador 3 " 
			dado<-(azar(6) +1)
			posicion3 <-dado+ posicion3
			cont3<- cont3+1
			si (posicion3>15) Entonces
				posicion3<- posicion3-15
				gana3<- gana3+1
			FinSi
			escribir "tu ficha quedo en la posicion " posicion3
			escribir "turno jugador 4 " 
			dado<-(azar(6) +1)
			posicion4 <-dado+ posicion4
			cont4<- cont4+1
			si (posicion4>15) Entonces
				posicion4<- posicion4-15
				gana4<- gana4+1
			FinSi
			escribir "tu ficha quedo en la posicion " posicion4
			
		hasta que (posicion1=15 o posicion2=15 o posicion3=15 o posicion4=15)
		si(posicion1=15) entonces
			gana1<-gana1+1
			
		Sino
			si(posicion2=15)Entonces
				gana2<-gana2+1
			Sino
				si(posicion3=15)Entonces
					gana3<-gana3+1
				Sino
					gana4<-gana4+1
				FinSi
			FinSi
		FinSi
		
	hasta que (gana1=4 o gana2=4 o gana3=4 o gana4=4)
	si (gana1=4) entonces
		escribir "el ganador fue el jugador 1"
		escribir "con " cont1 " lanzamientos"
	sino 
		si (gana2=4) entonces
			escribir "el ganador fue el jugador 2"
			escribir "con " cont2 " lanzamientos"
			Sino
				si (gana3=4) entonces
					escribir "el ganador fue el jugador 3"
					escribir "con " cont3 " lanzamientos"
					Sino
						escribir "el ganador fue el jugador 4"
						escribir "con " cont4 " lanzamientos"
				FinSi
		FinSi
	FinSi
	
FinAlgoritmo

