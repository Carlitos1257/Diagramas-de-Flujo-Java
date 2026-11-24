# Ejercicio 70: Contar empleados menores de 18 años y clasificar por sexo

**Capítulo:** Capitulo 4 Trabajando con ficheros  
**Estudiante:** Jank Carlos Arias Pérez  
**Modalidad:** Individual

## Objetivo
Desarrollar un programa en Java que resuelva el ejercicio mediante instrucciones básicas de Programación 1.

## Entradas
Archivo empleados.txt con registros nombre;edad;M/F.

## Proceso
Leer cada registro y contar por separado empleados menores de 18 y empleados de sexo femenino.

## Salidas
Cantidad de menores de 18 años y cantidad de mujeres.

## Requerimientos funcionales
1. Abrir y leer el archivo empleados.txt.
2. Separar los campos nombre, edad y sexo de cada registro.
3. Contar los empleados cuya edad sea menor de 18 años.
4. Contar por separado los registros cuyo sexo esté identificado como F.
5. Mostrar los dos contadores al finalizar.
6. Informar errores si el archivo no existe o los datos numéricos no son válidos.

## Requerimientos no funcionales
- Ejecutarse en consola con Java.
- Leer los registros línea por línea.
- Validar que cada registro contenga los campos necesarios y manejar errores de lectura o conversión.

## Requerimientos de dominio
- El archivo se denomina empleados.txt.
- Cada línea debe tener el formato nombre;edad;M/F.
- Se considera menor de edad a quien tenga menos de 18 años; una edad de 18 no se cuenta.
- El conteo de mujeres se realiza cuando el campo sexo contiene F, sin depender de mayúsculas o minúsculas.

## Algoritmo
1. Inicio
2. Abrir empleados.txt
3. Leer hasta fin de archivo
4. Separar nombre, edad y sexo
5. Actualizar contadores según condiciones
6. Mostrar contadores y cerrar
7. Fin

## Implementación
Código fuente: `../java/Ejercicio70.java`.

## Diagrama
Archivo editable: `../diagramas_drawio/Ejercicio70.drawio`.

## Prueba
Ejecutar el archivo Java correspondiente y comprobar que la salida coincide con el objetivo, las entradas y el proceso descritos. En ejercicios que leen archivos, preparar primero los datos con el formato requerido por el programa.
