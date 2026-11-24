# Ejercicio 80: Clasificar varios números como pares o impares y contar

**Capítulo:** Capitulo 5 Organigramas estructurados  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Cantidad N y N números enteros.

## Proceso
Comprobar el residuo al dividir cada número entre 2 y aumentar el contador de pares o impares.

## Salidas
Cantidad de números pares e impares.

## Requerimientos funcionales
1. Solicitar la cantidad N de números a clasificar.
2. Leer cada uno de los N números enteros.
3. Determinar si cada número es par o impar mediante el residuo de dividir entre 2.
4. Incrementar el contador de pares o impares según corresponda.
5. Mostrar la cantidad total de pares y de impares.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Procesar cada dato una sola vez.
- Mostrar ambos contadores al finalizar.

## Requerimientos de dominio
- Un número es par cuando su residuo al dividirlo entre 2 es cero.
- Un número es impar cuando su residuo al dividirlo entre 2 es distinto de cero.
- Los números negativos también pueden clasificarse como pares o impares.
- El cero se considera par.

## Algoritmo
1. Inicio
2. Leer N; pares = 0; impares = 0
3. Leer cada número
4. Si número % 2 == 0: pares++; en caso contrario: impares++
5. Mostrar contadores
6. Fin

## Implementación
Código fuente: `../java/Ejercicio80.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio80.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
