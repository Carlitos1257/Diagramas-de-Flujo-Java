# Ejercicio 14: Sumar los N primeros múltiplos de cinco

**Capítulo:** Capitulo 2 Primeros organigramas  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Cantidad N de múltiplos que se van a sumar.

## Proceso
Iniciar suma en cero y acumular i * 5 desde i = 1 hasta N.

## Salidas
La suma de los N primeros múltiplos de 5.

## Requerimientos funcionales
1. Solicitar la cantidad N de múltiplos que se van a sumar.
2. Calcular los primeros N múltiplos positivos de 5.
3. Acumular los múltiplos calculados en una variable suma.
4. Mostrar la suma total.

## Requerimientos no funcionales
- El programa debe ejecutarse en consola con Java.
- Los mensajes de entrada y el resultado deben ser claros.
- El cálculo debe realizarse con un ciclo y una variable acumuladora.

## Requerimientos de dominio
- Los múltiplos considerados son 5, 10, 15 y así sucesivamente.
- N representa la cantidad de múltiplos, no el valor máximo.
- Si N es cero o negativo, no se deben sumar múltiplos; la suma inicial es cero.

## Algoritmo
1. Inicio
2. Leer N
3. i = 1; suma = 0
4. Mientras i <= N: suma = suma + i * 5; incrementar i
5. Mostrar suma
6. Fin

## Implementación
Código fuente: `../java/Ejercicio14.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio14.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
