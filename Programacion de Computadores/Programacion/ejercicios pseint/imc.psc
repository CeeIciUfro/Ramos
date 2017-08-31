Algoritmo imc
	pesoTotal<-0
	estaturaTotal<-0
	contAlumno<-0
	contCol<-0
	repetir
		repetir
			escribir "ingrese cantidad de colegios"
			leer cantCol
		Hasta Que cantCol>0
		
		Repetir
			repetir
				escribir "ingrese peso del estudiante"
				leer peso
				pesoTotal<- pesoTotal+peso
				
				si (peso<=0)entonces
					escribir "error! Ingrese un valor correcto"
				FinSi
			Hasta Que peso>0
			repetir
				escribir "ingrese estatura del estudiante"
				leer estatura
				estaturaTotal<-estaturaTotal+estatura
				si (estatura<=0)entonces
					escribir "error! Ingrese un valor correcto"
				FinSi
			hasta que estatura>0
			iimc<- peso*(estatura*estatura)
			contIimc<-contIimc+iimc
			si (iimc<20)
				categoria<- "DESNUTRICION"
				contDes<- contDes+1
				
			Sino
				si(20<= iimc y iimc<25)Entonces
					categoria<- "NORMAL"
					contNor<-contNor+
				Sino
					si(25<= iimc y iimc<30)Entonces
						categoria<- "SOBRE-PESO"
						contSobre<-contSobre+1
					Sino
						si(30<= iimc y iimc<35)Entonces
							categoria<- "OBESIDAD LEVE"
							contObe<-contObe+1
						Sino
							si(35<= iimc y iimc<40)Entonces
								categoria<- "OBESIDAD MODERADA"
								contObeM<-contObeM+1
							Sino
								categoria<- "OBESIDAD MORBIDA"
								contObeMo<-contObeMo+1
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
			contAlumno<-contAlumno+1
			escribir "Desea evaluar otro estudiante?(si/no)"
			leer resp
		Hasta Que resp= "no"
		promPeso<-pesoTotal/contAlumno
		escribir "el promedio de peso del colegio es: " promPeso
		promEstatura<- estaturaTotal/contAlumno
		escribir "el promedio de estatura del colegio es: " promEstatura
		promImc<- iimc/contAlumno
		escribir "el IMC del colegio es: " promImc
		escribir "alumnos en categoria Normal: " contNor 
		escribir "alumnos en categoria sobre-peso: " conSobre
		escribir "alumnos en categoria obesidad leve : " contObe
		escribir "alumnos en categoria obesidad moderada : " contObeM
		escribir "alumnos en categoria obesidad morbida : " contObeMo
		contCol<-contCol+1
		contTNor<-contNor+contTNo
		
	hasta que cantCol=contCol
	
FinAlgoritmo
