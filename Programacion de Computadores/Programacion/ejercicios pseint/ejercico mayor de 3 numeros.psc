Proceso sin_titulo
	Leer N1
	Leer N2
	Leer N3
	Si (N1>N2 y N1>N3 ) Entonces
			Escribir N1 " Es el numero mayor "
		Sino
			Si (N2>N1 y N2>n3 ) Entonces
				Escribir N2 " es el numero mayor "
			Sino
				si (N3>N1 y N3>N2) entonces
					escribir N3 " es el numero mayor"
				FinSi
				si ( N1=N2 y N1>N3) entonces				
					Escribir N1 " y " N2 " Iguales Mayores a " N3
				sino 
					si (N2=N3 y N2>N1 ) entonces
						escribir N2 " Y " N3 " iguales y mayores a " N1
					sino 
						si (N1=N3 y N1>N2) entonces
							Escribir N1 " y " N3 " iguales y mayores a " N2
						FinSi
					FinSi
			FinSi
		FinSi
	FinSi
	
	Si (N1=N2 y N2=N3 y N1=N3) entonces
		escribir " todos los numeros son iguales"
	FinSi
	
	
FinProceso
