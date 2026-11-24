# Ejercicio 71: Leer registros secuenciales y contar por categoría

**Capítulo:** Capitulo 4 Trabajando con ficheros  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Archivo categorias.txt; el segundo campo de cada línea contiene 1, 2 o 3.

## Proceso
Leer cada línea y aumentar el contador de la categoría indicada; contar registros inválidos.

## Salidas
Cantidad de registros de categorías 1, 2 y 3 y registros inválidos.

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
2. Abrir categorias.txt
3. Leer hasta fin de archivo
4. Separar campos y revisar categoría
5. Aumentar contador 1, 2, 3 o inválidos
6. Mostrar contadores y cerrar
7. Fin

## Implementación
Código fuente: `../java/Ejercicio71.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio71.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
