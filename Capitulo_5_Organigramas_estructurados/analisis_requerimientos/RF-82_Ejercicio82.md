# Ejercicio 82: Mostrar las horas, minutos y segundos de un reloj

**Capítulo:** Capitulo 5 Organigramas estructurados  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
No requiere entradas.

## Proceso
Usar tres ciclos anidados para recorrer horas de 0 a 23, minutos de 0 a 59 y segundos de 0 a 59.

## Salidas
Las horas en formato HH:MM:SS.

## Requerimientos funcionales
1. Generar las horas desde 00 hasta 23.
2. Para cada hora, generar los minutos desde 00 hasta 59.
3. Para cada minuto, generar los segundos desde 00 hasta 59.
4. Mostrar cada combinación en formato HH:MM:SS.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Utilizar ciclos anidados para recorrer las unidades de tiempo.
- Mostrar siempre dos dígitos para cada componente de la hora.

## Requerimientos de dominio
- El reloj utiliza formato de 24 horas.
- Las horas válidas van de 0 a 23.
- Los minutos y segundos válidos van de 0 a 59.
- El recorrido diario contiene 86 400 combinaciones de hora, minuto y segundo.

## Algoritmo
1. Inicio
2. Recorrer h de 0 a 23
3. Para cada h, recorrer m de 0 a 59
4. Para cada m, recorrer s de 0 a 59
5. Mostrar HH:MM:SS
6. Fin

## Implementación
Código fuente: `../java/Ejercicio82.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio82.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
