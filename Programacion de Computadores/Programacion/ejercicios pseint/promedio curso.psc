Proceso sin_titulo
	cont<-0
	suma<-0
	contAlumno<-0
	contReprobado<-0
	contExamen<-0
	contAprobado<-0
	Escribir 'ingrese cantidad de alumnos'
	Leer cantAlumnos
	Repetir
		Repetir
			Escribir 'ingrese cantidad de notas del alumno ',contAlumno+1
			Leer cantNotas
		Hasta Que (cantNotas>0)
		contAlumno<-contAlumno+1
		Repetir
			Repetir
				Escribir 'ingrese nota ',cont+1
				Leer nota
			Hasta Que (nota>=1 Y nota<=7)
			suma<-suma+nota
			cont<-cont+1
			
		Hasta Que (cantNotas=cont)
		cont<-0
		
		prom<-suma/cantNotas
		Escribir "Promedio alumno " contAlumno " es: ",prom
		Si (prom<3.6) Entonces
			Escribir 'Reprobado'
			contReprobado<-contReprobado+1
		Sino
			Si (prom>3.6 Y prom<4) Entonces
				Escribir 'Examen'
				contExamen<-contExamen+1
			Sino
				Escribir 'Aprobado'
				contAprobado<-contAprobado+1
			FinSi
		FinSi
		suma<-0
	Hasta Que (cantAlumnos=contAlumno)
	
	Escribir 'cantidad de alumnos reprobados ' ,contReprobado
	Escribir 'cantidad de alumnos en examen ',contExamen
	Escribir 'cantidad de alumnos aprobados ',contAprobado
FinProceso

