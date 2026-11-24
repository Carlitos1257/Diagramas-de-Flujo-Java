# Ejercicio 79: Hallar los N primeros múltiplos de tres

**Capítulo:** Capitulo 5 Organigramas estructurados  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Cantidad N de múltiplos a mostrar.

## Proceso
Recorrer desde 1 hasta N y mostrar i * 3.

## Salidas
Los N primeros múltiplos de 3.

## Requerimientos funcionales
1. Solicitar la cantidad N de múltiplos que se desean mostrar.
2. Generar los primeros N múltiplos positivos de 3.
3. Mostrar cada múltiplo en orden ascendente.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Utilizar un ciclo controlado por la cantidad solicitada.
- Mostrar los resultados de forma legible.

## Requerimientos de dominio
- Los múltiplos se generan como 3 × i, comenzando con i = 1.
- N representa la cantidad de resultados, no el límite numérico.
- Si N es cero o negativo, no se muestran múltiplos.

## Algoritmo
1. Inicio
2. Leer N; i = 1
3. Mientras i <= N: mostrar i * 3
4. Incrementar i
5. Fin

## Implementación
Código fuente: `../java/Ejercicio79.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio79.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
