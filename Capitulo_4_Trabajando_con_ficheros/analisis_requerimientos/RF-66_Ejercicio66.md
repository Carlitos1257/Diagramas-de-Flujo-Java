# Ejercicio 66: Crear un fichero secuencial con mil registros

**Capítulo:** Capitulo 4 Trabajando con ficheros  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Un dato de texto para cada uno de los 1000 registros.

## Proceso
Solicitar cada dato y escribirlo secuencialmente en registros.txt junto con su número de registro.

## Salidas
Archivo registros.txt con 1000 registros.

## Requerimientos funcionales
1. Crear o abrir el archivo registros.txt en modo escritura.
2. Solicitar un dato para cada uno de los 1000 registros.
3. Escribir cada registro en una línea, acompañado de su número consecutivo.
4. Cerrar el archivo al terminar la escritura.
5. Informar si el archivo fue creado correctamente o si ocurrió un error.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Escribir los registros en orden secuencial.
- Utilizar un bloque de manejo de excepciones para los errores de entrada/salida.
- Cerrar el archivo al finalizar, incluso si ocurre un error.

## Requerimientos de dominio
- Se deben escribir exactamente 1000 registros.
- El número de registro identifica la posición secuencial de cada dato.
- El archivo de salida se denomina registros.txt y cada registro se escribe en una línea.

## Algoritmo
1. Inicio
2. Abrir registros.txt para escritura
3. Repetir 1000 veces: leer dato y escribir número;dato
4. Cerrar archivo
5. Fin

## Implementación
Código fuente: `../java/Ejercicio66.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio66.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
