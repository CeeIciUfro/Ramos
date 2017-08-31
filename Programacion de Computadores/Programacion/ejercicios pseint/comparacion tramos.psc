Algoritmo sin_titulo
	repetir 
		escribir "Ingresar hora del dia"
		leer hora
		si(hora<7 o hora >20) entonces
			escribir "Error! Intente nuevamente"
		FinSi
	hasta que (hora>=7 y  hora<=20)
	Si (hora >=7 y hora <9) entonces
		velProm<- (10+11+10+7)/4
		tiempoR1<- 10/velProm
		velProm<- (10+8+9+10)/4
		tiempoR2<- 12/velProm
		velprom<- (10+11+9+10)/4
		tiempoR3<- 9/velprom
	Sino
		si(hora >=9 y hora <13) entonces
			velProm<- (20+18+30+27)/4
			tiempoR1<- 10/velProm
			velProm<- (20+25+25+27)/4
			tiempoR2<- 12/velProm
			velprom<- (20+18+25+27)/4
			tiempoR3<- 9/velprom
		Sino
			si(hora >=13 y hora <15) entonces
				velProm<- (15+12+15+6)/4
				tiempoR1<- 10/velProm
				velProm<- (15+7+9+6)/4
				tiempoR2<- 12/velProm
				velprom<- (10+11+9+10)/4
				tiempoR3<- 9/velprom
			Sino
				velProm<- (18+10+8+10)/4
				tiempoR1<- 10/velProm
				velProm<- (18+12+12+10)/4
				tiempoR2<- 12/velProm
				velprom<- (18+10+12+10)/4
				tiempoR3<- 9/velprom
			FinSi
		FinSi
	FinSi
	si(tiempoR1<tiempoR2 y tiempoR1<tiempoR3) entonces
		escribir "la mejor es la ruta 1, " tiempoR1 " hrs."
	Sino
		si(tiempoR2<tiempoR1 y tiempoR2<tiempoR3) entonces
			escribir "la mejor es la ruta 2, " tiempoR2 " hrs."
		Sino
				si(tiempoR3<tiempoR2 y tiempoR3<tiempoR1) entonces
					escribir "la mejor es la ruta 3, " tiempoR3 " hrs."
				Sino
					si(tiempoR1=tiempoR2 y tiempoR1<tiempoR3) entonces
						escribir "las mejores rutas son: "
						escribir "Ruta1 - Tiempo: " tiempoR1, " hrs"
						escribir "Ruta2 - Tiempo: " tiempoR2, " hrs"
					Sino
						si(tiempoR1=tiempoR3 y tiempoR1<tiempoR2) entonces
							escribir "las mejores rutas son: "
							escribir "Ruta1 - Tiempo: " tiempoR1, " hrs"
							escribir "Ruta3 - Tiempo: " tiempoR3, " hrs"
						Sino
							si(tiempoR3=tiempoR2 y tiempoR3<tiempoR1) entonces
								escribir "las mejores rutas son: "
								escribir "Ruta3 - Tiempo: " tiempoR3, " hrs"
								escribir "Ruta2 - Tiempo: " tiempoR2, " hrs"
							
							FinSi
						FinSi
					FinSi
				FinSi
				
			FinSi
		
	FinSi
	
	
	
	
FinAlgoritmo
