Algoritmo sin_titulo
	cont<-0
	suma<-0
	repetir
		escribir "ingrese cantidad de notas"
		leer cantNotas
	hasta que (cantNotas>0)
	
	Repetir
		repetir 
			Escribir "ingrese nota " cont+1
			leer nota
		hasta que (nota>=1 y nota<=7)
			suma<-suma+nota
			cont<-cont+1
	Hasta Que (cantNotas=cont)
	prom<-suma/cantNotas
	escribir "su promedio es: " prom
	
	si(prom<3.6) entonces 
		escribir "Reprobado"
	Sino
		si(prom>3.6 y prom<4)Entonces
			escribir "Examen"
		Sino
			escribir "Aprobado"
		FinSi
	FinSi
FinAlgoritmo
