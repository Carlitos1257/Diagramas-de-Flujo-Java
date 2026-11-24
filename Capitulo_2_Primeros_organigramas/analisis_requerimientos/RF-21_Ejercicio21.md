# Ejercicio 21: Hacer que el ordenador funcione como un reloj

**Capítulo:** Capitulo 2 Primeros organigramas  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
No requiere entradas.

## Proceso
Recorrer las horas de 0 a 23, los minutos de 0 a 59 y los segundos de 0 a 59; esperar un segundo después de mostrar cada hora.

## Salidas
La hora en formato HH:MM:SS.

## Requerimientos funcionales
1. Mostrar la hora en formato HH:MM:SS.
2. Incrementar los segundos y actualizar los minutos al completar 60 segundos.
3. Actualizar la hora al completar 60 minutos.
4. Reiniciar el ciclo diario después de las 23:59:59.

## Requerimientos no funcionales
- El programa debe ejecutarse en consola con Java.
- La hora debe mostrarse con dos dígitos para horas, minutos y segundos.
- La visualización debe avanzar aproximadamente cada segundo.

## Requerimientos de dominio
- El reloj utiliza formato de 24 horas.
- Las horas van de 00 a 23; los minutos y segundos van de 00 a 59.
- Después de 23:59:59, el siguiente valor del ciclo diario es 00:00:00.

## Algoritmo
1. Inicio
2. Recorrer hora de 0 a 23
3. Para cada hora, recorrer minuto de 0 a 59
4. Para cada minuto, recorrer segundo de 0 a 59
5. Mostrar HH:MM:SS y esperar un segundo
6. Fin

## Implementación
Código fuente: `../java/Ejercicio21.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio21.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
