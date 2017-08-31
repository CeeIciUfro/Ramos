Algoritmo sin_titulo
	escribir "bienvenidos al juego del ludo"
	cont<- 0
	repetir
		posicion<-0
		repetir
			escribir "¡¡lanzaremos el dado !!"
			dado<-(azar(6) +1)
			posicion <-dado+ posicion
			cont<- cont+1
			si (posicion>15) Entonces
				posicion<- posicion-15
				cont<- cont+1
			FinSi
			escribir "tu ficha quedo en la posicion " posicion
		hasta que (posicion=15)
		gana<- gana+1
		escribir "ganaste con la ficha " gana
	hasta que (gana=4)
	escribir "tus 4 fichas ganaron!"
	Escribir "el total de lanzamientos fue: " cont
FinAlgoritmo

