Algoritmo sin_titulo
	Repetir
		escribir "ingrese el primer numero"
		leer num1
		escribir "ingrese el segundo numero"
		leer num2
		escribir "ingrese el tercer numero"
		leer num3
		escribir "ingrese el cuarto numero"
		leer num4 
		
	Hasta Que (num1>0 y num2>0 y num3>0 y num4>0)
	
	Si(num1>num2 y num1>num3 y num1>num4) entonces
		Escribir "el primer numero es el mayor"
	Sino
		Si (num2>num1 y num2>num3 y num2>num4) entonces
			Escribir "el segundo numero es el mayor"
		Sino
			Si (num3>num1 y num3>num2 y num3>num4) entonces
				Escribir "el tercer numero es el mayor"
			Sino
				Si(num4>num1 y num4>num2 y num4>num3) entonces
					Escribir "el cuarto numero es el mayor"
				Sino
					Si (num1=num2 y num1>num3 y num1>num4)entonces
						Escribir "el primer y el segundo son iguales y mayores"
					Sino
						Si (num1=num3 y num1>num2 y num1>num4)entonces
							Escribir "el primer y el tercero son iguales y mayores"
						Sino
							Si(num1=num4 y num1>num2 y num1>num3)entonces
								Escribir "el primero y el cuarto son iguales y mayores"
							Sino
								Si(num2=num3 y num2>num4 ) entonces
									Escribir "el segundo y tercero iguales y mayores "
								Sino
									Si (num2=num4 y num2>num3)entonces
										Escribir "el segundo y cuarto iguales y mayores" 
									Sino
										Si ( num3=num4 y num3>num1 y num3>num2 )entonces
											Escribir "el tercero y cuarto iguales y mayores"
										Sino
											Escribir" todos los números son iguales"
											
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		finsi
	FinSi
	
											
FinAlgoritmo
