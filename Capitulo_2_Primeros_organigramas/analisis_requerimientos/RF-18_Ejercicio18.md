# Ejercicio 18: Calcular el factorial de un número

**Capítulo:** Capitulo 2 Primeros organigramas  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Un entero N entre 0 y 20.

## Proceso
Validar que N no sea negativo ni mayor que 20. Multiplicar los enteros desde 1 hasta N.

## Salidas
El factorial de N o un mensaje de validación.

## Requerimientos funcionales
1. Leer un número entero N.
2. Validar que N esté entre 0 y 20 inclusive.
3. Calcular el factorial multiplicando los enteros desde 1 hasta N.
4. Mostrar el factorial o un mensaje cuando el valor esté fuera del rango permitido.

## Requerimientos no funcionales
- El programa debe ejecutarse en consola con Java.
- El resultado debe mostrarse claramente e identificar el número procesado.
- La solución debe evitar desbordamientos del tipo numérico utilizado.

## Requerimientos de dominio
- El factorial se define como N! = 1 × 2 × ... × N.
- Por definición, 0! = 1.
- El programa limita N al intervalo de 0 a 20 para usar el tipo long sin desbordamiento.

## Algoritmo
1. Inicio
2. Leer N
3. Si N < 0 o N > 20: mostrar error
4. En caso contrario: factorial = 1; recorrer i de 1 a N y multiplicar
5. Mostrar factorial
6. Fin

## Implementación
Código fuente: `../java/Ejercicio18.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio18.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
