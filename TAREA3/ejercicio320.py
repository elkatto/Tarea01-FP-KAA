Np : int
modelo : int
talla : int
costo : float
total : float
manoobra : float
tela : float

modelo = int(input("Selecciona un modelo 1 = A O 2 = B: "))
if modelo==1 or modelo==2:
		Np = int(input("Ingresa el numero de pantalones a fabricar: "))
		
		costo = float(input("Ingresa el costo por metro de tela: "))
		if modelo==1:
			tela = (costo*1.5)
			manodeobra = tela*0.8
		else:
			tela = (costo*1.8)
			manodeobra = tela*0.95
		total = tela+manodeobra
		
		talla = int(input("Ingresa la talla 1 = talla 30 O 2 = talla 32 O 3 = talla 36: " ))
		if talla>=1 and talla<=3:
			if talla==2 or talla==3:
				print("Se aplico un 4% extra por la talla s./",total*.04)
				total = total+(total*.04)
			print("El gasto por tela de 1 pantalon es: s./",tela)
			print("El gasto por mano de obra de 1 pantalon es: s./",manodeobra)
			print("Cargo extra del 30% de ganancia s./",total*.30)
			total = total+(total*.30)
			print("El precio final de venta de 1 pantalon s./",total)
			print("La ganancia total de 1 pantalon es: s./",total-(tela+manodeobra))
			print("")
			print("El gasto en tela por ",Np," pantalones es: s./",tela*Np)
			print("El gasto por mano de obra en ",Np," pantalones es: s./",manodeobra*Np)
			print("El total por la venta de ",Np," pantalones es: s./",total*Np)
			print("La ganancia total por ",Np," pantalones es: s./",(total-(tela+manodeobra))*Np)
		else:
			print("ingrese una talla correcta")
else:
	print("ingrese un modelo corecto")
