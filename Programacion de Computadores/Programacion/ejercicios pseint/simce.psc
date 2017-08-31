Algoritmo sin_titulo
	contCol<-0
	
	repetir
	escribir "ingrese cantidad de colegios"
	leer cantCol
	si (cantCol<=0)entonces
		escribir "Ingrese un dato correcto"
	FinSi
	hasta que (cantCol>0)
	
	contCol<-0
	mejorPromPtje<-0
	peorPromPtje<-600
	colInsuf<-0
	colBueno<-0
	colSuf<-0
	
	peorPromPtje<-600
	mientras (contCol<cantCol) Hacer
		repetir
			escribir "ingrese cantidad de estudiantes"
			leer cantEst
			si (cantEst<=0)entonces
				escribir "Ingrese un dato correcto"
			FinSi
		hasta que (cantEst>0)
		
		contEst<-0
		acumPtje<-0
		estInsuf<-0
		estBueno<- 0
		estSuf<-0
		
			mientras (contEst<cantEst) Hacer
			repetir
				escribir "ingrese puntaje del estudiante"
				leer ptje
				si (ptje<=0 o ptje>600)entonces
					escribir "Ingrese un dato correcto"
				FinSi
			hasta que (ptje>=0 y ptje<=600)
			acumPtje<- acumPtje+ptje
			si (ptje<300)Entonces
				estInsuf<- estInsuf+1
			Sino
				si(ptje>500)Entonces
					estBueno<- estBueno+1
				Sino
					estSuf<-estSuf+1
				FinSi
			FinSi
			
			contEst<-contEst+1
		FinMientras
		promPtje<- acumPtje/cantEst
		si(promPtje>mejorPromPtje) entonces
			mejorPromPtje <- promPtje
			mejorCol<-contCol
		FinSi
		si(promPtje<peorPromPtje) entonces
			peorPromPtje <- promPtje
			peorCol<-contCol+1
		FinSi
		
		si(estInsuf>0.7*cantEst)Entonces
			colInsuf<- colInsuf+1
			calCol<- "INSUFICIENTE"
		Sino
			si (estBueno>0.7*cantEst)entonces
				colBueno<-colBueno+1
				calCol<- "BUENO"
			Sino
				colSuf<-colSuf+1
				calCol<-"SUFICIENTE"
				
			FinSi
			escribir "El colegio se clasifica como ", calCol
		FinSi
		contCol<-contCol+1
	FinMientras
	escribir "Colegios por clasificacion"
	escribir "Bueno: " colBueno
	escribir "Suficiente: " colSuf
	escribir "Insuficiente: " colInsuf
	escribir "el mejor promedio de puntajes lo tiene el colegio: " mejorCol
	escribir "El peor promedio de puntajes lo tiene el colegio: " peorCol
	
FinAlgoritmo
