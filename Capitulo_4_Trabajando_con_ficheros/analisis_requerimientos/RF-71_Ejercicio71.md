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
1. Abrir y leer el archivo categorias.txt.
2. Separar los campos de cada registro.
3. Leer el valor del segundo campo como categoría.
4. Incrementar el contador correspondiente para las categorías 1, 2 o 3.
5. Contar los registros incompletos o con categorías diferentes de 1, 2 y 3 como inválidos.
6. Mostrar los contadores de las tres categorías y los registros inválidos.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Procesar el archivo línea por línea.
- Controlar errores de lectura y registros que no cumplan el formato esperado.

## Requerimientos de dominio
- El archivo se denomina categorias.txt.
- El segundo campo de cada línea contiene la categoría.
- Las categorías válidas son 1, 2 y 3.
- Un registro sin el segundo campo o con una categoría distinta se considera inválido.

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
