<PARSED TEXT FOR PAGE: 1 / 25>

REQUERIMIENTOS DE LOS 24 EJERCICIOS
                Análisis funcional, no funcional y de dominio

                       Estudiante: Jank Carlos Arias Pérez
                             Modalidad: Individual
                                 Programación


  Contenido organizado según los archivos de análisis de requerimientos del repositorio GitHub.

<PARSED TEXT FOR PAGE: 2 / 25>

                                    CAPÍTULO 2 — EJERCICIO 13
                                Generar los primeros 100 múltiplos de 3
Entradas: No requiere entradas.
Proceso: Contador de 1 a 100; calcular contador × 3.
Salidas: Los primeros 100 múltiplos de 3.

Requerimientos funcionales
1.   Generar y mostrar exactamente los primeros 100 múltiplos positivos de 3.
2.   Usar un contador desde 1 hasta 100.
3.   Calcular cada múltiplo multiplicando el contador por 3.
4.   Mostrar cada resultado en consola, en orden ascendente.

Requerimientos no funcionales
    Ejecutarse en consola con Java.
    Mostrar un resultado legible por línea.
    Finalizar después de mostrar los 100 valores.

Requerimientos de dominio
    Un múltiplo de 3 se obtiene mediante 3 × n.
    La secuencia comienza en 3 y termina en 300.
    Se muestran 100 valores y no se solicita entrada del usuario.

Archivos relacionados: ../java/Ejercicio13.java | ../diagramas_drawio/Ejercicio13.drawio

<PARSED TEXT FOR PAGE: 3 / 25>

                                    CAPÍTULO 2 — EJERCICIO 14
                               Sumar los N primeros múltiplos de cinco
Entradas: Cantidad N de múltiplos.
Proceso: Iniciar suma en cero y acumular i × 5 desde i = 1 hasta N.
Salidas: La suma de los N primeros múltiplos de 5.

Requerimientos funcionales
5.   Solicitar la cantidad N de múltiplos que se van a sumar.
6.   Calcular los primeros N múltiplos positivos de 5.
7.   Acumular los múltiplos calculados en una variable suma.
8.   Mostrar la suma total.

Requerimientos no funcionales
    Ejecutarse en consola con Java.
    Mensajes de entrada y resultado claros.
    Realizar el cálculo con un ciclo y una variable acumuladora.

Requerimientos de dominio
    Los múltiplos son 5, 10, 15 y sucesivamente.
    N representa la cantidad de múltiplos, no el valor máximo.
    Si N es cero o negativo, no se suman múltiplos; la suma es cero.

Archivos relacionados: ../java/Ejercicio14.java | ../diagramas_drawio/Ejercicio14.drawio

<PARSED TEXT FOR PAGE: 4 / 25>

                                    CAPÍTULO 2 — EJERCICIO 18
                                    Calcular el factorial de un número
Entradas: Un entero N entre 0 y 20.
Proceso: Validar que N no sea negativo ni mayor que 20; multiplicar enteros de 1 hasta N.
Salidas: El factorial de N o un mensaje de validación.

Requerimientos funcionales
9. Leer un número entero N.
10. Validar que N esté entre 0 y 20 inclusive.
11. Calcular el factorial multiplicando los enteros desde 1 hasta N.
12. Mostrar el factorial o un mensaje si el valor está fuera del rango.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Identificar claramente el número procesado.
   Evitar desbordamientos del tipo numérico utilizado.

Requerimientos de dominio
   N! = 1 × 2 × ... × N.
   Por definición, 0! = 1.
   El rango de 0 a 20 permite usar long sin desbordamiento.

Archivos relacionados: ../java/Ejercicio18.java | ../diagramas_drawio/Ejercicio18.drawio

<PARSED TEXT FOR PAGE: 5 / 25>

                                     CAPÍTULO 2 — EJERCICIO 20
                            Calcular un tanto por ciento de una cantidad
Entradas: Cantidad base y porcentaje.
Proceso: Calcular cantidad × porcentaje / 100.
Salidas: El valor correspondiente al porcentaje.

Requerimientos funcionales
13. Solicitar una cantidad base.
14. Solicitar el porcentaje que se desea calcular.
15. Calcular cantidad × porcentaje / 100.
16. Mostrar el resultado.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Permitir valores decimales para cantidad y porcentaje.
   Mostrar el resultado con un mensaje comprensible.

Requerimientos de dominio
   El porcentaje se expresa como un número sobre 100; por ejemplo, 15 representa 15 %.
   La fórmula es (cantidad × porcentaje) / 100.
   No confundir el valor porcentual calculado con la cantidad total más ese valor.

Archivos relacionados: ../java/Ejercicio20.java | ../diagramas_drawio/Ejercicio20.drawio

<PARSED TEXT FOR PAGE: 6 / 25>

                                    CAPÍTULO 2 — EJERCICIO 21
                         Hacer que el ordenador funcione como un reloj
Entradas: No requiere entradas.
Proceso: Recorrer horas 0–23, minutos 0–59 y segundos 0–59; esperar un segundo tras mostrar cada hora.
Salidas: Hora en formato HH:MM:SS.

Requerimientos funcionales
17. Mostrar la hora en formato HH:MM:SS.
18. Incrementar segundos y actualizar minutos al completar 60 segundos.
19. Actualizar la hora al completar 60 minutos.
20. Reiniciar el ciclo diario después de 23:59:59.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Mostrar dos dígitos para horas, minutos y segundos.
   Avanzar aproximadamente cada segundo.

Requerimientos de dominio
   Formato de 24 horas.
   Horas de 00 a 23; minutos y segundos de 00 a 59.
   Después de 23:59:59, el siguiente valor es 00:00:00.

Archivos relacionados: ../java/Ejercicio21.java | ../diagramas_drawio/Ejercicio21.drawio

<PARSED TEXT FOR PAGE: 7 / 25>

                                    CAPÍTULO 2 — EJERCICIO 24
                           Comprobar si un número es múltiplo de cinco
Entradas: Un número entero.
Proceso: Comprobar si el residuo de dividir el número entre 5 es cero.
Salidas: Mensaje que indica si es o no múltiplo de 5.

Requerimientos funcionales
21. Solicitar un número entero.
22. Calcular el residuo de dividir el número entre 5.
23. Determinar si el residuo es cero.
24. Informar si el número es múltiplo de 5.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Aceptar enteros positivos, negativos y cero.
   Indicar claramente la clasificación.

Requerimientos de dominio
   Un entero es múltiplo de 5 si su residuo al dividirlo entre 5 es cero.
   El cero también es múltiplo de 5.
   La regla aplica a enteros positivos y negativos.

Archivos relacionados: ../java/Ejercicio24.java | ../diagramas_drawio/Ejercicio24.drawio

<PARSED TEXT FOR PAGE: 8 / 25>

                                  CAPÍTULO 3 — EJERCICIO 32
               Crear una lista en memoria para almacenar diez elementos
Entradas: Diez números enteros.
Proceso: Guardar cada número en una posición del arreglo y recorrerlo para mostrarlo.
Salidas: Los diez elementos almacenados.

Requerimientos funcionales
25. Crear un arreglo de diez posiciones enteras.
26. Solicitar diez valores al usuario.
27. Guardar cada valor en la posición correspondiente.
28. Recorrer el arreglo y mostrar los diez elementos.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Utilizar un arreglo fijo de diez elementos.
   Mostrar los datos en el mismo orden de ingreso.

Requerimientos de dominio
   Los índices válidos son de 0 a 9.
   El arreglo almacena exactamente diez enteros.
   Cada posición contiene un único elemento.

Archivos relacionados: ../java/Ejercicio32.java | ../diagramas_drawio/Ejercicio32.drawio

<PARSED TEXT FOR PAGE: 9 / 25>

                                    CAPÍTULO 3 — EJERCICIO 36
                           Contar elementos positivos, negativos y ceros
Entradas: Cantidad N y N números enteros.
Proceso: Clasificar cada número como mayor, menor o igual a cero y aumentar el contador correspondiente.
Salidas: Cantidad de positivos, negativos y ceros.

Requerimientos funcionales
29. Solicitar la cantidad N de números.
30. Leer cada uno de los N enteros.
31. Contar por separado positivos, negativos y ceros.
32. Mostrar los tres contadores al finalizar.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Iniciar los contadores en cero y actualizarlos una vez por dato.
   Presentar los resultados separados por categoría.

Requerimientos de dominio
   Positivo es mayor que cero; negativo, menor que cero.
   El cero tiene una categoría independiente.
   N representa la cantidad de valores a procesar.

Archivos relacionados: ../java/Ejercicio36.java | ../diagramas_drawio/Ejercicio36.drawio

<PARSED TEXT FOR PAGE: 10 / 25>

                                  CAPÍTULO 3 — EJERCICIO 40
                        Sumar los diez primeros elementos de una lista
Entradas: Diez números enteros.
Proceso: Guardar cada elemento y acumular su valor en una variable suma.
Salidas: La suma de los diez elementos.

Requerimientos funcionales
33. Crear un arreglo para diez enteros.
34. Solicitar y guardar los diez valores.
35. Sumar cada valor en una variable acumuladora.
36. Mostrar la suma total.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Utilizar un arreglo de diez posiciones y una variable acumuladora.
   Solicitar datos en orden y mostrar el total al terminar.

Requerimientos de dominio
   Se procesan exactamente diez elementos.
   Los elementos son enteros.
   La suma se inicializa en cero.

Archivos relacionados: ../java/Ejercicio40.java | ../diagramas_drawio/Ejercicio40.drawio

<PARSED TEXT FOR PAGE: 11 / 25>

                                   CAPÍTULO 3 — EJERCICIO 41
                              Contar los elementos mayores de quince
Entradas: Cantidad N y N números enteros.
Proceso: Comparar cada valor con 15 y aumentar el contador cuando sea mayor.
Salidas: Cantidad de valores mayores que 15.

Requerimientos funcionales
37. Solicitar la cantidad N de valores.
38. Leer los N enteros.
39. Comparar cada número con 15.
40. Incrementar el contador solo si el número es mayor que 15.
41. Mostrar la cantidad que cumple la condición.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Procesar cada valor una sola vez.
   Mostrar un contador final claro.

Requerimientos de dominio
   Solo se cuentan valores estrictamente mayores que 15.
   El valor 15 no se incluye.
   N determina cuántos números se leen.

Archivos relacionados: ../java/Ejercicio41.java | ../diagramas_drawio/Ejercicio41.drawio

<PARSED TEXT FOR PAGE: 12 / 25>

                                   CAPÍTULO 3 — EJERCICIO 43
                                 Separar valores positivos y negativos
Entradas: Cantidad N y N números enteros.
Proceso: Almacenar positivos y negativos en arreglos separados; contar los ceros.
Salidas: Listas de positivos y negativos y cantidad de ceros.

Requerimientos funcionales
42. Solicitar la cantidad N de enteros.
43. Leer los N valores.
44. Guardar positivos en un arreglo y negativos en otro.
45. Contar aparte los valores iguales a cero.
46. Mostrar positivos, negativos y total de ceros.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Conservar el orden de aparición dentro de cada grupo.
   Mostrar cada grupo de forma diferenciada.

Requerimientos de dominio
   Positivos son mayores que cero y negativos menores que cero.
   El cero no se almacena en ninguno de los arreglos; se cuenta aparte.
   Cada valor se clasifica una sola vez.

Archivos relacionados: ../java/Ejercicio43.java | ../diagramas_drawio/Ejercicio43.drawio

<PARSED TEXT FOR PAGE: 13 / 25>

                                   CAPÍTULO 3 — EJERCICIO 45
                                Encontrar el mayor valor de una tabla
Entradas: Cantidad N mayor que cero y N números enteros.
Proceso: Tomar el primer elemento como mayor inicial y comparar los demás.
Salidas: El mayor elemento de la tabla.

Requerimientos funcionales
47. Solicitar la cantidad N de elementos.
48. Verificar que N sea mayor que cero.
49. Leer y almacenar los N enteros.
50. Tomar el primer elemento como mayor inicial.
51. Comparar los demás y actualizar el mayor.
52. Mostrar el mayor valor encontrado.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Utilizar un arreglo para almacenar los valores.
   Evitar acceder al arreglo si N no es válido.

Requerimientos de dominio
   La tabla debe contener al menos un elemento.
   El primer valor sirve como referencia inicial; no iniciar mayor en cero porque todos podrían ser negativos.
   El resultado es el máximo de los N valores.

Archivos relacionados: ../java/Ejercicio45.java | ../diagramas_drawio/Ejercicio45.drawio

<PARSED TEXT FOR PAGE: 14 / 25>

                                    CAPÍTULO 4 — EJERCICIO 66
                           Crear un fichero secuencial con mil registros
Entradas: Un dato de texto para cada uno de los 1000 registros.
Proceso: Solicitar cada dato y escribirlo secuencialmente en registros.txt con su número de registro.
Salidas: Archivo registros.txt con 1000 registros.

Requerimientos funcionales
53. Crear o abrir registros.txt en modo escritura.
54. Solicitar un dato para cada uno de los 1000 registros.
55. Escribir cada registro en una línea con su número consecutivo.
56. Cerrar el archivo al terminar.
57. Informar si se creó correctamente o ocurrió un error.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Escribir los registros en orden secuencial.
   Usar manejo de excepciones para errores de entrada/salida.
   Cerrar el archivo al finalizar, incluso si ocurre un error.

Requerimientos de dominio
   Se escriben exactamente 1000 registros.
   El número identifica la posición secuencial.
   El archivo se llama registros.txt y cada registro ocupa una línea.

Archivos relacionados: ../java/Ejercicio66.java | ../diagramas_drawio/Ejercicio66.drawio

<PARSED TEXT FOR PAGE: 15 / 25>

                                    CAPÍTULO 4 — EJERCICIO 67
            Crear un fichero con organización indexada (simulada con clave)
Entradas: Cantidad de registros y una clave y dato por registro.
Proceso: Guardar cada par clave-dato en indexados.txt; la clave representa el índice de identificación.
Salidas: Archivo indexados.txt con claves y datos.

Requerimientos funcionales
58. Solicitar cuántos registros se almacenarán.
59. Crear o abrir indexados.txt.
60. Solicitar una clave y un dato para cada registro.
61. Guardar cada pareja clave-dato.
62. Cerrar el archivo e informar el resultado.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Guardar cada registro en una línea con formato clave;dato.
   Manejar errores de lectura y escritura mediante excepciones.

Requerimientos de dominio
   La clave identifica cada registro y se conserva junto con su dato.
   La organización indexada se simula guardando la clave; no hay índice físico separado.
   El usuario determina la cantidad de registros.

Archivos relacionados: ../java/Ejercicio67.java | ../diagramas_drawio/Ejercicio67.drawio

<PARSED TEXT FOR PAGE: 16 / 25>

                                   CAPÍTULO 4 — EJERCICIO 68
                      Crear un fichero de acceso directo con 200 registros
Entradas: Un dato de texto para cada clave del 1 al 200.
Proceso: Solicitar un dato por clave y escribir clave y dato en directo.txt.
Salidas: Archivo directo.txt con 200 registros identificados por clave.

Requerimientos funcionales
63. Crear o abrir directo.txt.
64. Recorrer claves consecutivas de 1 a 200.
65. Solicitar un dato asociado a cada clave.
66. Guardar cada pareja clave-dato.
67. Cerrar el archivo e informar que se guardaron los registros.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Escribir una clave y un dato por línea.
   Controlar errores de escritura.

Requerimientos de dominio
   Se generan exactamente 200 registros.
   Cada registro tiene clave única entre 1 y 200.
   Se guarda secuencialmente como clave;dato; no equivale a acceso físico directo real.

Archivos relacionados: ../java/Ejercicio68.java | ../diagramas_drawio/Ejercicio68.drawio

<PARSED TEXT FOR PAGE: 17 / 25>

                                    CAPÍTULO 4 — EJERCICIO 69
        Leer un fichero secuencial de empleados y contar registros según año
Entradas: Archivo empleados.txt con registros nombre;año.
Proceso: Leer cada línea, separar campos y contar empleados nacidos en 1940 y 1941.
Salidas: Cantidad de empleados nacidos en 1940 y en 1941.

Requerimientos funcionales
68. Abrir y leer empleados.txt.
69. Separar campos usando punto y coma.
70. Obtener el año de nacimiento.
71. Contar los registros con año 1940 y 1941.
72. Mostrar ambos contadores.
73. Informar si el archivo no existe o hay datos no convertibles.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Leer línea por línea sin cargar todo el archivo en memoria.
   Validar los campos y manejar errores de lectura o conversión.

Requerimientos de dominio
   El archivo se denomina empleados.txt.
   Cada línea debe tener formato nombre;año.
   Se cuentan por separado 1940 y 1941; otros años no incrementan esos contadores.

Archivos relacionados: ../java/Ejercicio69.java | ../diagramas_drawio/Ejercicio69.drawio

<PARSED TEXT FOR PAGE: 18 / 25>

                                    CAPÍTULO 4 — EJERCICIO 70
                 Contar empleados menores de 18 años y clasificar por sexo
Entradas: Archivo empleados.txt con registros nombre;edad;M/F.
Proceso: Leer cada registro y contar menores de 18 y empleados de sexo femenino.
Salidas: Cantidad de menores de 18 años y cantidad de mujeres.

Requerimientos funcionales
74. Abrir y leer empleados.txt.
75. Separar nombre, edad y sexo.
76. Contar empleados con edad menor de 18.
77. Contar por separado los registros cuyo sexo sea F.
78. Mostrar ambos contadores.
79. Informar errores si el archivo no existe o los datos numéricos no son válidos.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Leer registros línea por línea.
   Validar campos y manejar errores de lectura o conversión.

Requerimientos de dominio
   El archivo se denomina empleados.txt y cada línea usa nombre;edad;M/F.
   Menor de edad significa menos de 18; edad 18 no cuenta.
   El conteo de mujeres reconoce F sin depender de mayúsculas/minúsculas.

Archivos relacionados: ../java/Ejercicio70.java | ../diagramas_drawio/Ejercicio70.drawio

<PARSED TEXT FOR PAGE: 19 / 25>

                                   CAPÍTULO 4 — EJERCICIO 71
                       Leer registros secuenciales y contar por categoría
Entradas: Archivo categorias.txt; el segundo campo contiene 1, 2 o 3.
Proceso: Leer cada línea y aumentar el contador de categoría indicada; contar registros inválidos.
Salidas: Cantidad de registros de categorías 1, 2 y 3 y registros inválidos.

Requerimientos funcionales
80. Abrir y leer categorias.txt.
81. Separar los campos de cada registro.
82. Leer el segundo campo como categoría.
83. Incrementar el contador para categorías 1, 2 o 3.
84. Contar registros incompletos o con otra categoría como inválidos.
85. Mostrar contadores de las tres categorías y los inválidos.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Procesar el archivo línea por línea.
   Controlar errores de lectura y registros con formato incorrecto.

Requerimientos de dominio
   El archivo se denomina categorias.txt.
   El segundo campo contiene la categoría.
   Las categorías válidas son 1, 2 y 3.
   Sin segundo campo o con categoría distinta se considera inválido.

Archivos relacionados: ../java/Ejercicio71.java | ../diagramas_drawio/Ejercicio71.drawio

<PARSED TEXT FOR PAGE: 20 / 25>

                                      CAPÍTULO 5 — EJERCICIO 77
                        Hallar la suma de los diez primeros números pares
Entradas: No requiere entradas.
Proceso: Recorrer del 1 al 10 y acumular i × 2.
Salidas: Suma de los diez primeros números pares.

Requerimientos funcionales
86. Inicializar una variable acumuladora en cero.
87. Generar los diez primeros números pares positivos.
88. Sumar cada número par en la variable acumuladora.
89. Mostrar el resultado.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Utilizar un ciclo que procese exactamente diez números.
   Mostrar el resultado final mediante un mensaje claro.

Requerimientos de dominio
   Los diez primeros pares positivos son 2, 4, 6, ..., 20.
   El cero no se incluye.
   La suma esperada de referencia es 110.

Archivos relacionados: ../java/Ejercicio77.java | ../diagramas_drawio/Ejercicio77.drawio

<PARSED TEXT FOR PAGE: 21 / 25>

                                     CAPÍTULO 5 — EJERCICIO 78
                          Determinar si un número es positivo o negativo
Entradas: Un número entero.
Proceso: Comparar el número con cero para clasificarlo como positivo, negativo o cero.
Salidas: Mensaje de clasificación del número.

Requerimientos funcionales
90. Solicitar un número al usuario.
91. Comparar el número con cero.
92. Mostrar si es positivo, negativo o igual a cero.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Aceptar números enteros.
   Presentar una única clasificación para el valor ingresado.

Requerimientos de dominio
   Mayor que cero es positivo.
   Menor que cero es negativo.
   El cero es un caso independiente; no es positivo ni negativo.

Archivos relacionados: ../java/Ejercicio78.java | ../diagramas_drawio/Ejercicio78.drawio

<PARSED TEXT FOR PAGE: 22 / 25>

                                    CAPÍTULO 5 — EJERCICIO 79
                                Hallar los N primeros múltiplos de tres
Entradas: Cantidad N de múltiplos a mostrar.
Proceso: Recorrer desde 1 hasta N y mostrar i × 3.
Salidas: Los N primeros múltiplos de 3.

Requerimientos funcionales
93. Solicitar la cantidad N de múltiplos.
94. Generar los primeros N múltiplos positivos de 3.
95. Mostrar cada múltiplo en orden ascendente.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Utilizar un ciclo controlado por la cantidad solicitada.
   Mostrar los resultados de forma legible.

Requerimientos de dominio
   Los múltiplos se generan como 3 × i, comenzando con i = 1.
   N es la cantidad de resultados, no el límite numérico.
   Si N es cero o negativo, no se muestran múltiplos.

Archivos relacionados: ../java/Ejercicio79.java | ../diagramas_drawio/Ejercicio79.drawio

<PARSED TEXT FOR PAGE: 23 / 25>

                                    CAPÍTULO 5 — EJERCICIO 80
                  Clasificar varios números como pares o impares y contar
Entradas: Cantidad N y N números enteros.
Proceso: Comprobar el residuo al dividir cada número entre 2 y aumentar el contador correspondiente.
Salidas: Cantidad de números pares e impares.

Requerimientos funcionales
96. Solicitar la cantidad N de números.
97. Leer cada uno de los N enteros.
98. Determinar si cada número es par o impar mediante el residuo al dividir entre 2.
99. Incrementar el contador de pares o impares.
100. Mostrar ambos totales.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Procesar cada dato una sola vez.
   Mostrar ambos contadores al finalizar.

Requerimientos de dominio
   Es par si el residuo al dividir entre 2 es cero.
   Es impar si el residuo es distinto de cero.
   Los negativos también se clasifican; el cero es par.

Archivos relacionados: ../java/Ejercicio80.java | ../diagramas_drawio/Ejercicio80.drawio

<PARSED TEXT FOR PAGE: 24 / 25>

                                    CAPÍTULO 5 — EJERCICIO 81
                                     Calcular el factorial de N números
Entradas: Cantidad de números a procesar y cada valor entre 0 y 20.
Proceso: Para cada valor, validar el rango y calcular su factorial con un ciclo multiplicativo.
Salidas: Factorial de cada valor válido o mensaje de rango.

Requerimientos funcionales
101. Solicitar la cantidad de números que se procesarán.
102. Leer cada número individualmente.
103. Validar que cada número esté entre 0 y 20 inclusive.
104. Calcular el factorial de cada número válido.
105. Mostrar el factorial o un mensaje si está fuera del rango.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Utilizar ciclos para procesar la cantidad solicitada y calcular cada factorial.
   Mostrar el resultado correspondiente a cada número.

Requerimientos de dominio
   El factorial es el producto de los enteros desde 1 hasta N.
   Por definición, 0! = 1.
   Se limita la entrada de 0 a 20 para evitar desbordamiento de long.
   Cada número se valida de manera independiente.

Archivos relacionados: ../java/Ejercicio81.java | ../diagramas_drawio/Ejercicio81.drawio

<PARSED TEXT FOR PAGE: 25 / 25>

                                   CAPÍTULO 5 — EJERCICIO 82
                       Mostrar las horas, minutos y segundos de un reloj
Entradas: No requiere entradas.
Proceso: Usar tres ciclos anidados para recorrer horas 0–23, minutos 0–59 y segundos 0–59.
Salidas: Las horas en formato HH:MM:SS.

Requerimientos funcionales
106. Generar las horas desde 00 hasta 23.
107. Para cada hora, generar minutos desde 00 hasta 59.
108. Para cada minuto, generar segundos desde 00 hasta 59.
109. Mostrar cada combinación en formato HH:MM:SS.

Requerimientos no funcionales
   Ejecutarse en consola con Java.
   Utilizar ciclos anidados para recorrer las unidades de tiempo.
   Mostrar siempre dos dígitos para cada componente.

Requerimientos de dominio
   Formato de 24 horas.
   Horas válidas de 0 a 23.
   Minutos y segundos válidos de 0 a 59.
   El recorrido diario contiene 86 400 combinaciones.

Archivos relacionados: ../java/Ejercicio82.java | ../diagramas_drawio/Ejercicio82.drawio
