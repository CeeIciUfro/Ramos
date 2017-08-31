Algoritmo sin_titulo
	Escribir "ingrese cantidad de numeros a comparar"
	leer cantNum
	cont<-0
	pos<-0
	Repetir
		escribir "ingrese numero"
		leer num1
		si(num1>numMayor)Entonces
			numMayor<- num1
		FinSi
		cont<-cont+1
		pos<- cont
	Hasta Que (cantNum=cont)
	escribir "el numero mayor es: " numMayor
	escribir "en la posicon: " pos
FinAlgoritmo
