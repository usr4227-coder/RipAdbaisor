# Objetivos del proyecto

Este proyecto es una aplicación sencilla en Java centrada en el uso de ventanas con `JOptionPane` y en el manejo de errores mediante validaciones y bloques `try/catch`. El programa permite añadir, editar, mostrar y eliminar elementos, cada uno con nombre, categoría, descripción y puntuación.

## Explicación de cada clase

### Elemento

Clase que representa un elemento con sus atributos básicos. Solo almacena datos y ofrece getters, setters y un método toString.

### ServicioElementos

Gestiona la lista de elementos. Aquí se realizan las operaciones principales: añadir, editar, eliminar y ordenar. La ordenación se hace manualmente con dos bucles anidados.

### MenuPrincipal

Controla el menú del programa y coordina las acciones del usuario. Utiliza `Dialogos` para mostrar ventanas y `Validador` para comprobar que los datos introducidos sean correctos. Aquí es donde más se aplica el manejo de errores, evitando que el programa falle si el usuario introduce datos no válidos.

### Dialogos

Centraliza las ventanas de entrada y salida usando `JOptionPane`. Permite mantener el código del menú más limpio.

### Validador

Incluye métodos estáticos para validar textos y números. Se usa junto con `try/catch` para evitar errores al convertir cadenas a enteros o al comprobar rangos.

### App

Clase principal que inicia el programa creando el servicio y el menú.

## Funcionamiento general del programa

El programa funciona mediante un menú mostrado con `JOptionPane`.  
Cada vez que el usuario introduce un dato, se valida y se controla con `try/catch` para evitar errores comunes, como escribir letras en lugar de números o dejar campos vacíos.  
Los elementos se guardan en una lista y se ordenan de mayor a menor puntuación mediante un algoritmo sencillo hecho a mano.

## Uso de Git durante el desarrollo

El repositorio se creó en GitHub y luego se clonó en local.  
Durante el desarrollo se hicieron commits pequeños para registrar cada avance.  
Se trabajó con ramas para separar partes del proyecto (interfaz, utilidades, servicio, etc.).  
Cuando una rama estaba lista, se hacía merge a la rama principal.  
Al final se dejó el repositorio limpio y organizado en GitHub.

## Conclusión

Este proyecto ha servido para practicar el uso de `JOptionPane`, validaciones, manejo de errores con `try/catch`, organización por paquetes y un flujo de trabajo básico con Git y GitHub.
