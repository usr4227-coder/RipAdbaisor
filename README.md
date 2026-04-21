# Objetivos del proyecto

Este proyecto es una aplicación sencilla en Java centrada en el uso de ventanas con `JOptionPane` y en el manejo de validaciones para evitar errores comunes al introducir datos. El programa permite añadir, editar, mostrar y eliminar elementos, cada uno con nombre, categoría, descripción y puntuación.

## Explicación de cada clase

### Elemento

Clase que representa un elemento con sus atributos básicos. Solo almacena datos y ofrece getters, setters y un método toString.

### ServicioElementos

Gestiona la lista de elementos. Aquí se realizan las operaciones principales: añadir, editar, eliminar y ordenar.  
La ordenación se hace manualmente con dos bucles anidados, comparando puntuaciones para ordenar de mayor a menor.

### MenuPrincipal

Controla el menú del programa y coordina las acciones del usuario.  
Utiliza `Dialogos` para mostrar ventanas y `Validador` para comprobar que los datos introducidos sean correctos.  
Aquí se aplican las validaciones necesarias para evitar errores, comprobando si los textos están vacíos, si los números son válidos o si están dentro del rango permitido.

### Dialogos

Centraliza las ventanas de entrada y salida usando `JOptionPane`.  
Permite mantener el código del menú más limpio y organizado.

### Validador

Incluye métodos estáticos para validar textos y números.  
El único uso de `try/catch` del proyecto está dentro de `esEntero()`, que detecta si un texto puede convertirse a número sin que el programa falle.

### App

Clase principal que inicia el programa creando el servicio y el menú.

## Funcionamiento general del programa

El programa funciona mediante un menú mostrado con `JOptionPane`.  
Cada vez que el usuario introduce un dato, se valida antes de procesarlo para evitar errores:

- Se comprueba si un texto está vacío
- Se verifica si un número es válido
- Se controla si está dentro del rango permitido

Los elementos se guardan en una lista y se ordenan de mayor a menor puntuación mediante un algoritmo sencillo hecho a mano.

## Uso de Git durante el desarrollo

El repositorio se creó en GitHub y luego se clonó en local.  
Durante el desarrollo se hicieron commits pequeños para registrar cada avance.  
Se trabajó con ramas para separar partes del proyecto (interfaz, util, servicio, developer, etc.).  
Cuando una rama estaba lista, se hacía merge a la rama principal.  
Al final se dejó el repositorio limpio y organizado en GitHub.

## Conclusión

Este proyecto ha servido para practicar el uso de `JOptionPane`, validaciones y trabajo básico con Git y GitHub.
