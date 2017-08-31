Algoritmo sin_titulo
	escribir "bienvenidos al juego del ludo"
	cont<- 0
	repetir
		escribir "¡¡lanzaremos el dado!!"
		dado<-(azar(6) +1)
		posicion <-dado+ posicion
		cont<- cont+1
		si (posicion>15) Entonces
			posicion<- posicion-15
			cont<- cont+1
		FinSi
		escribir "tu ficha quedo en la posicion " posicion
	hasta que (posicion=15)
	escribir "ganaste!"
	Escribir "el total de lanzamientos fue: " cont
FinAlgoritmo

