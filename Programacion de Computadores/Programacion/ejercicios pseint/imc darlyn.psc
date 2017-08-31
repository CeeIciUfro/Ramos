Algoritmo sin_titulo
	alumno<-0
	pesoalumno<-0
	estaturaalumno<-0
	cont<-0
	sumapeso<-0
	sumaestatura<-0
	imccolegio<-0
	contcolegio<-0
	escribir " numero de colegios participantes "
	leer colegios
	
	repetir 
		cont<-0
		Escribir " cantidad de alumnos por colegio " 
		leer alumno
			
		Repetir
			escribir " peso del alumno "
			Leer pesoalumno
			Escribir "estatura del alumno "
			Leer estaturaalumno
			imcalumno<-pesoalumno/estaturaalumno*estaturaalumno
			si(imcalumno<20) entonces
				categoria<-"DESNUTRICION"
				contd<-contd+1
			Sino
				si(20<=imcalumno y imcalumno<25)entonces
					categoria<-"NORMAL"
					contn<-contn+1
				Sino
					si(25<=imcalumno y imcalumno<30) Entonces
						categoria<- "SOBRE-PESO"
						contso<-contso+1
					Sino
						si(30<=imcalumno y imcalumno<35)entonces
							categoria<-"OBESIDAD LEVE"
							conto<-conto+1
						Sino
							SI(35<=imcalumno y imcalumno<40)Entonces
								categoria<-"OBESIDAD MODERADA"
								contob<-contob+1
							Sino
								categoria<-"OBESIDAD MORBIDA"
								contom<-contom+1
							FinSi
						FinSi
					FinSi
					
				FinSi
			FinSi
			cont<-cont+1
			
		hasta que cont=alumno
		sumapeso<-sumapeso+pesoalumno
		prompeso<-sumapeso/alumno
		sumaestatura<- sumaestatura+estaturaalumno
		promestatura<-sumaestatura/alumno
		imccolegio<-sumapeso/sumaestatura*sumaestatura
		escribir "IMC del colegio es: " imccolegio
		escribir "promedio peso del colegio es: " prompeso
		escribir "promedio estatura del colegios es: " promestatura
		escribir "alumnos en categoria normal: " contn
		
		contcolegio<-contcolegio+1
		
	Hasta Que colegios=contcolegio
	
FinAlgoritmo
