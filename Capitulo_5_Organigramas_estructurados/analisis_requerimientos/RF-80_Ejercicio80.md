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
1. Recibir o preparar los datos necesarios para el ejercicio.
2. Procesar la información según el algoritmo descrito.
3. Presentar el resultado en la consola o guardar los registros en el archivo indicado.
4. Informar los casos de validación o errores de lectura y escritura cuando correspondan.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Utilizar estructuras básicas de secuencia, decisión, ciclos, arreglos o archivos según el ejercicio.
- Presentar mensajes claros para el usuario.
- Mantener los nombres de archivos y formatos descritos en el código fuente.

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
