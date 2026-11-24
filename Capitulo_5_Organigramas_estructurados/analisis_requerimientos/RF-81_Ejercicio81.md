# Ejercicio 81: Calcular el factorial de N números

**Capítulo:** Capitulo 5 Organigramas estructurados  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Cantidad de números a procesar y cada valor entre 0 y 20.

## Proceso
Para cada valor, validar el rango y calcular su factorial con un ciclo multiplicativo.

## Salidas
Factorial de cada valor válido o mensaje de rango.

## Requerimientos funcionales
1. Solicitar la cantidad de números que se van a procesar.
2. Leer cada número individualmente.
3. Validar que cada número esté entre 0 y 20 inclusive.
4. Calcular el factorial de cada número válido.
5. Mostrar el factorial o un mensaje cuando el valor esté fuera del rango.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Utilizar ciclos para procesar la cantidad solicitada y calcular cada factorial.
- Mostrar el resultado correspondiente a cada número ingresado.

## Requerimientos de dominio
- El factorial de N es el producto de los enteros desde 1 hasta N.
- Por definición, 0! = 1.
- Se limita la entrada al rango de 0 a 20 para evitar desbordamiento del tipo long.
- Cada número se valida de manera independiente.

## Algoritmo
1. Inicio
2. Leer cantidad
3. Repetir cantidad veces: leer N
4. Validar 0 <= N <= 20
5. Calcular factorial y mostrarlo; continuar
6. Fin

## Implementación
Código fuente: `../java/Ejercicio81.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio81.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
