

TEMAS con SCANNER:
1.	Métodos void 
2.	Métodos con return 
3.	Sobrecarga de métodos  - Constructor
4.	Get ,Set,Validaciones 
METODOS CON VOID
EJERCICIO 1 - MÉTODOS void
Crear una clase llamada Estudiante que permita registrar la siguiente información:
•	nombre 
•	carrera 
•	edad 
La clase debe contener:
 Métodos obligatorios USANDO VOID
•	registrarDatos() → para ingresar los datos desde teclado 
•	mostrarDatos() → para mostrar la información del estudiante 

 REQUERIMIENTO DE SALIDA 
El programa debe mostrar en pantalla la información con el siguiente formato:
----- DATOS DEL ESTUDIANTE -----
Nombre: Ana López
Carrera: Desarrollo de Software
Edad: 20

 
¿Por qué registrarDatos() es void? 
RegistrarDatos() es void porque solo se encarga de pedir y guardar los datos del estudiante, no necesita devolver ningún valor.
¿Por qué no usamos return en este ejercicio? 
No usamos return porque los datos se almacenan directamente en los atributos del objeto, por lo tanto no es necesario devolverlos.
¿Qué pasaría si este método fuera int o double? 
Si el método fuera int o double, obligatoriamente tendría que retornar un valor con return, lo cual no tendría sentido porque el método no realiza ningún cálculo.
 ¿Cuál es la función de mostrarDatos()?
La función de mostrarDatos() es mostrar en pantalla la información del estudiante con el formato solicitado.







PRÁCTICA 2: MÉTODOS void
Tema
Control de producto
Objetivo
Reforzar el uso de métodos void aplicando ingreso de datos con Scanner, uso de atributos, cálculo simple y presentación clara de resultados.
🟦 CONCEPTO CLAVE
Un método void NO devuelve valores (no usa return). Solo ejecuta acciones como ingresar datos o mostrar información.
Enunciado
Crear una clase llamada Producto que permita registrar:
• nombre del producto
• precio
• cantidad
Requerimientos
El programa debe utilizar métodos void para:
✔ ingresar los datos
✔ calcular el total
✔ mostrar la información
Métodos obligatorios
• ingresarDatos() → ingresar datos con Scanner
• mostrarFactura() → calcular total y mostrar resultados
🟥 ERROR COMÚN
No usar return en este ejercicio. Si lo usas, el método deja de ser void.
Formato de salida esperado
--------------------------------
Ejemplo de ejecución
Ingrese el nombre del producto: Laptop
Ingrese el precio: 800
Ingrese la cantidad: 2

----------- FACTURA -----------

Producto: Laptop
Precio unitario: 800.0
Cantidad: 2

Total a pagar: 1600.0

--------------------------------
 
Análisis
1.	¿Por qué mostrarFactura() es void?
mostrarFactura() es void porque solo muestra información en pantalla y no necesita devolver ningún valor.
2. ¿Dónde se realiza el cálculo?
El cálculo se realiza en el método calcularTotal(), donde se multiplica el precio por la cantidad.
3. ¿Por qué no se usa return?
No se usa return porque el ejercicio pide trabajar con métodos void, es decir, métodos que solo ejecutan acciones sin devolver resultados.
4. ¿Qué ventaja tiene separar métodos?
Separar métodos permite organizar mejor el programa, hacerlo más claro, reutilizable y fácil de mantener o modificar. 

Actividad adicional
Agregar un descuento del 10% si el total es mayor a 1000.
 
		PRÁCTICA -  MÉTODOS CON return
Tema: Cálculo de promedio final
Objetivo
Aplicar métodos con return para devolver resultados numéricos y textuales.
Enunciado
Crear una clase Calificacion con nombre y tres notas. Calcular promedio y estado.
Entrada
- nombre del estudiante
- nota 1, nota 2, nota 3
Proceso
Calcular promedio y determinar estado (>=7 Aprobado, <7 Reprobado).
Salida esperada
-------- REPORTE ACADÉMICO --------
Nombre: Carla Pérez
Promedio final: 8.5
Estado: Aprobado
-----------------------------------
 
MÉTODOS CON return
Tema: Planilla de luz
Objetivo
Aplicar métodos con return para cálculos encadenados.
Entrada
- nombre del cliente
- consumo
- costo por kW
Proceso
Calcular subtotal, IVA 15% y total.
Salida esperada
----------- PLANILLA DE LUZ -----------
Cliente: Luis Andrade
Subtotal: 24.0
IVA: 3.6
Total a pagar: 27.6
---------------------------------------
 
MÉTODOS MIXTOS (void + return)
MÉTODOS MIXTOS (void + return)
Tema: Control de empleado
Objetivo
Combinar métodos void y return.
Entrada
- nombre
- horas trabajadas
- pago por hora
Proceso
Calcular sueldo base, bono y sueldo final.
Salida esperada
----------- REPORTE DE EMPLEADO -----------
Nombre: Andrea López
Sueldo base: 480.0
Bono: 20.0
Sueldo final: 500.0
-------------------------------------------
 
MÉTODOS MIXTOS (void + return)
Tema: Pedido restaurante
Objetivo
Diferenciar métodos de cálculo y de salida.
Entrada
- cliente
- plato
- precio
- cantidad
Proceso
Calcular subtotal, descuento 10% (>25) y total final.
Salida esperada
------------- CUENTA DEL PEDIDO -------------
Cliente: María Silva
Plato: Encebollado
Precio: 4.5
Cantidad: 6
Subtotal: 27.0
Descuento: 2.7
Total final: 24.3
 












Práctica  Control de inventario y reposición de productos
Enunciado
Una empresa distribuidora necesita desarrollar un sistema para administrar información de sus productos y tomar decisiones de reposición de inventario.
De cada producto se requiere conocer:
•	código del producto, 
•	nombre comercial, 
•	categoría, 
•	precio unitario, 
•	stock disponible, 
•	stock mínimo permitido. 
La empresa desea que la información descriptiva del producto pueda consultarse de manera sencilla, pero que los datos críticos de control, como precio, stock y stock mínimo, sean protegidos y modificados únicamente bajo condiciones válidas.

El sistema debe permitir registrar productos, actualizar su información y evaluar automáticamente su estado dentro del inventario.
Además, el sistema debe ser capaz de determinar:
•	el valor total del inventario de un producto, 
•	si el producto necesita reposición, 
•	si el stock es crítico, 
•	y si los cambios realizados cumplen reglas válidas de negocio. 

Reglas del negocio
El sistema debe considerar lo siguiente:
1.	El precio unitario no puede ser menor o igual a cero. 
2.	El stock disponible no puede ser negativo. 
3.	El stock mínimo no puede ser negativo. 
4.	Si el stock actual es menor que el stock mínimo, el producto debe marcarse como “Requiere reposición”. 
5.	Si el stock actual es igual a cero, el producto debe marcarse como “Producto agotado”. 
6.	Si el stock actual es mayor al mínimo, el producto debe marcarse como “Stock suficiente”. 

Situación de trabajo
La gerencia desea registrar inicialmente un producto y luego realizar una actualización de datos para verificar si el sistema valida correctamente la información antes de aceptar cambios.
También desea obtener un reporte final con:
•	datos generales del producto, 
•	valor total del inventario, 
•	estado del stock, 
•	y mensajes de validación. 

Datos de prueba sugeridos
Caso inicial:
•	Código: PRD-105 
•	Nombre: Disco SSD 1TB 
•	Categoría: Almacenamiento 
•	Precio unitario: 89.50 
•	Stock disponible: 12 
•	Stock mínimo: 8 
Posteriormente, se desea intentar actualizar:
•	Precio unitario a 95.00 
•	Stock disponible a 5 
Y luego probar un caso inválido:
•	Stock disponible a -3 

Preguntas de análisis
1.	¿Qué atributos del problema deberían mantenerse privados? 
Los atributos que deben mantenerse privados son: precioUnitario, stockDisponible y stockPermitido, porque son datos sensibles que afectan decisiones del sistema.
2.	¿Qué atributos podrían ser públicos sin comprometer la integridad del sistema? 
Los atributos que pueden ser públicos son: código, nombre y categoría, ya que solo describen el producto y no afectan la lógica del negocio.
3.	¿Por qué el stock no debería modificarse directamente desde cualquier clase?
El stock no debe modificarse directamente porque podría tomar valores inválidos (como negativos) y romper las reglas del sistema. Debe pasar por validaciones. 
4.	¿Qué ventajas tiene usar métodos set con validación? 
Los métodos set con validación aseguran que los datos sean correctos antes de guardarse, evitan errores, mantienen la integridad del sistema y aplican las reglas del negocio.
5.	¿Qué papel cumple el constructor en el registro inicial del producto? 
El constructor permite inicializar el objeto producto con valores válidos desde el inicio, garantizando que el sistema comience con datos correctos.
6.	¿Qué métodos serían necesarios para resolver este caso? 
Los métodos necesarios serían: registrarDatos(), setPrecioUnitario(), setStockDisponible(), setStockPermitido(), valorTotalInventario(), evaluarEstado(), mostrarReporte().

7.	¿Cómo debería responder el sistema si se intenta asignar un valor inválido? 
El sistema debería rechazar el valor inválido y mostrar un mensaje de error, sin cambiar el valor actual almacenado.
8.	¿Qué información debería mostrarse en el reporte final? 
El reporte final debe mostrar: código, nombre, categoría, precio unitario, stock disponible, stock mínimo, valor total del inventario, estado del stock y mensajes de validación.

Alcance esperado
Se espera que el estudiante proponga una solución orientada a objetos donde:
•	los datos sensibles estén encapsulados, 
•	la modificación de información pase por métodos controlados, 
•	se apliquen validaciones, 
•	se utilicen métodos get para consultar información privada, 
•	se calculen resultados del inventario, 
•	y se muestre una salida clara y profesional.


 
 
 
 
 

Enlace GitHub

