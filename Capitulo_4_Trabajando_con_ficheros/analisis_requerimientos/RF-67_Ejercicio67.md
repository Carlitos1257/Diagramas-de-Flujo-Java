# Ejercicio 67: Crear un fichero con organización indexada (simulada con clave)

**Capítulo:** Capitulo 4 Trabajando con ficheros  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Cantidad de registros y una clave y dato por registro.

## Proceso
Guardar cada par clave-dato en indexados.txt; la clave representa el índice de identificación.

## Salidas
Archivo indexados.txt con claves y datos.

## Requerimientos funcionales
1. Solicitar cuántos registros se van a almacenar.
2. Crear o abrir el archivo indexados.txt.
3. Solicitar una clave y un dato para cada registro.
4. Guardar cada pareja clave-dato en el archivo.
5. Cerrar el archivo e informar el resultado de la operación.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Guardar cada registro en una línea y mantener el formato clave;dato.
- Manejar errores de lectura y escritura mediante excepciones.

## Requerimientos de dominio
- La clave identifica cada registro y se conserva junto con su dato.
- En esta implementación académica, la organización indexada se representa guardando la clave en el archivo; no se implementa un índice físico separado.
- La cantidad de registros la determina el usuario.

## Algoritmo
1. Inicio
2. Leer cantidad de registros
3. Abrir indexados.txt
4. Para cada registro, leer clave y dato y escribirlos
5. Cerrar archivo
6. Fin

## Implementación
Código fuente: `../java/Ejercicio67.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio67.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
