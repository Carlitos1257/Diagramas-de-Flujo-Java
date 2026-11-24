# Ejercicio 68: Crear un fichero de acceso directo con 200 registros

**Capítulo:** Capitulo 4 Trabajando con ficheros  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Un dato de texto para cada clave del 1 al 200.

## Proceso
Solicitar un dato para cada clave y escribir la clave y el dato en directo.txt.

## Salidas
Archivo directo.txt con 200 registros identificados por clave.

## Requerimientos funcionales
1. Crear o abrir el archivo directo.txt.
2. Recorrer las claves consecutivas desde 1 hasta 200.
3. Solicitar un dato asociado a cada clave.
4. Guardar cada pareja clave-dato en el archivo.
5. Cerrar el archivo e informar que se guardaron los registros.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Escribir los registros con una clave y un dato por línea.
- Controlar los errores que puedan presentarse al escribir el archivo.

## Requerimientos de dominio
- Se generan exactamente 200 registros.
- Cada registro tiene una clave única entre 1 y 200.
- El programa guarda los registros secuencialmente en texto con el formato clave;dato; esta representación no equivale a acceso físico directo real.

## Algoritmo
1. Inicio
2. Abrir directo.txt
3. Recorrer claves de 1 a 200
4. Leer dato y escribir clave;dato
5. Cerrar archivo
6. Fin

## Implementación
Código fuente: `../java/Ejercicio68.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio68.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
