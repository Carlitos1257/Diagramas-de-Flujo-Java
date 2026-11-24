# Ejercicio 45: Encontrar el mayor valor de una tabla

**Capítulo:** Capitulo 3 Trabajando con tablas  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Cantidad N mayor que cero y N números enteros.

## Proceso
Tomar el primer elemento como mayor inicial y comparar los demás para actualizarlo cuando corresponda.

## Salidas
El mayor elemento de la tabla.

## Requerimientos funcionales
1. Solicitar la cantidad N de elementos de la tabla.
2. Verificar que N sea mayor que cero.
3. Leer y almacenar los N números enteros.
4. Tomar el primer elemento como valor mayor inicial.
5. Comparar los demás elementos y actualizar el mayor cuando corresponda.
6. Mostrar el mayor valor encontrado.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Utilizar un arreglo para almacenar los valores.
- Evitar acceder a una posición del arreglo si N no es válido.

## Requerimientos de dominio
- La tabla debe contener al menos un elemento.
- El primer valor leído se utiliza como referencia inicial; no se debe iniciar el mayor en cero porque todos los datos podrían ser negativos.
- El resultado es el máximo de los N valores ingresados.

## Algoritmo
1. Inicio
2. Leer N y validar que sea mayor que cero
3. Leer los valores
4. mayor = primer valor
5. Comparar los demás y actualizar mayor
6. Mostrar mayor
7. Fin

## Implementación
Código fuente: `../java/Ejercicio45.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio45.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
