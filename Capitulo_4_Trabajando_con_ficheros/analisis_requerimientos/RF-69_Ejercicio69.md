# Ejercicio 69: Leer un fichero secuencial de empleados y contar registros según año

**Capítulo:** Capitulo 4 Trabajando con ficheros  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Archivo empleados.txt con registros nombre;año.

## Proceso
Leer cada línea, separar los campos y contar los empleados nacidos en 1940 y 1941.

## Salidas
Cantidad de empleados nacidos en 1940 y en 1941.

## Requerimientos funcionales
1. Abrir y leer el archivo empleados.txt.
2. Separar los campos de cada registro usando el punto y coma.
3. Obtener el año de nacimiento de cada empleado.
4. Contar los registros cuyo año sea 1940 y los cuyo año sea 1941.
5. Mostrar ambos contadores al terminar la lectura.
6. Informar si el archivo no existe o contiene datos que no pueden convertirse.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Leer el archivo línea por línea sin cargarlo completo en memoria.
- Validar que cada línea contenga los campos requeridos y manejar errores de lectura o conversión.

## Requerimientos de dominio
- El archivo se denomina empleados.txt.
- Cada línea debe tener el formato nombre;año.
- Se cuentan por separado los años 1940 y 1941; los demás años no incrementan esos contadores.

## Algoritmo
1. Inicio
2. Abrir empleados.txt
3. Leer registros hasta fin de archivo
4. Separar campos y revisar el año
5. Actualizar contador 1940 o 1941
6. Mostrar contadores y cerrar
7. Fin

## Implementación
Código fuente: `../java/Ejercicio69.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio69.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
