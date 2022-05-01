from datetime import date
'''ejercicio 2.3 ''' 
import os

os.system("cls")

año = int(input("ingrese su año de nacimiento: "))
mes = int(input("ingrese su mes de nacimiento: "))
dia = int(input("ingrese su dia de nacimiento: "))

añoActual = date.today().year
mesActual = date.today().month
diaActual = date.today().day

edad = añoActual - año

print(edad)