Algoritmo accionistas
	Escribir "ingrese riesgo del proyecto 1"
	leer riesgo1
	Escribir "ingrese rentabilidad del proyecto 1"
	leer rent1
	Escribir "ingrese riesgo del proyecto 2"
	leer riesgo2
	Escribir "ingrese rentabilidad del proyecto 2"
	leer rent2
	Escribir "ingrese el factor de crecimiento de la empresa"
	leer crecimiento
	//INTENCION DE VOTO ACCIONISTA 1
	si(rent1>rent2)entonces
		si(riesgo1>60)Entonces
			si(crecimiento>40)Entonces
				proyElegA1<- 1
				contP1<- contP1+1
			Sino
				si(riesgo2>60)Entonces
					proyElegA1<-0
				Sino
					proyElegA1<-2
					contP2<- contP2+1
				FinSi
			FinSi
		Sino
			proyElegA1<-1
			contP1<- contP1+1
			
		FinSi
	sino 
		si(riesgo2>60)Entonces
			si(crecimiento>40)Entonces
				proyElegA1<-2
				contP2<- contP2+1
			Sino
				si(riesgo1>60)Entonces
					proyElegA1<-0
				Sino
					proyElegA1<-1
					contP1<- contP1+1
				FinSi
			FinSi
		Sino
			proyElegA1<-2
			contP2<- contP2+1
		FinSi
	FinSi
	//INTENCION DE VOTO ACCIONISTA 2
	si(rent1>rent2)entonces
		si(riesgo1>30)Entonces
			si(crecimiento>20)Entonces
				proyElegA2<- 1
				contP1<- contP1+1
			Sino
				si(riesgo2>30)Entonces
					proyElegA2<-0
				Sino
					proyElegA2<-2
					contP2<- contP2+1
				FinSi
			FinSi
		Sino
			proyElegA2<-1
			contP1<- contP1+1
			
		FinSi
	sino 
		si(riesgo2>30)Entonces
			si(crecimiento>20)Entonces
				proyElegA2<-2
				contP2<- contP2+1
			Sino
				si(riesgo1>30)Entonces
					proyElegA2<-0
				Sino
					proyElegA2<-1
					contP1<- contP1+1
				FinSi
			FinSi
		Sino
			proyElegA2<-2
			contP2<- contP2+1
		FinSi
	FinSi
	//INTENCION DE VOTO ACCIONISTA 3
	si((rent1-rent2<=10)y rent1-rent2>=-10 )entonces
		proyElegA3<- proyElegA2
				
	FinSi
	si(riesgo1<10 y riesgo2<10)entonces
		si(rent1>rent2)Entonces
			proyElegA3<-1
			contP1<- contP1+1
		sino 
			proyElegA3<-2
			contP2<- contP2+1
			
		FinSi
		
	Sino
		Si(riesgo1>riesgo2)entonces
			si(riesgo1>60 y rent1>40)entonces
				proyElegA3<-1
				contP1<- contP1+1
			Sino
				proyElegA3<-2
				contP2<- contP2+1
			FinSi
		sino
			si(riesgo2>60 y rent2>40)entonces
				proyElegA3<-2
				contP2<- contP2+1
			Sino
				proyElegA3<-1
				contP1<- contP1+1
			FinSi
		FinSi
	FinSi
	
	escribir "Intencion de voto accionista 1 es el proyecto" proyElegA1
	
	escribir "Intencion de voto accionista 2 es el proyecto" proyElegA2
	
	escribir "Intencion de voto accionista 3 es el proyecto" proyElegA3
	
	
	si(contP1>contP2)Entonces
		escribir "se elige el proyecto 1"
		si (contP2<contP1)Entonces
			escribir"se elige el proyecto 2"
		Sino
			escribir "empate"
		FinSi
	FinSi
FinAlgoritmo
