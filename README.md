# rufus
Este proyecto contiene las pruebas automatizadas para la aplicación http://opencart.abstracta.us/.

# Requisitos
Antes de ejecutar las pruebas automatizadas, asegúrate de tener instalados los siguientes requisitos:

Java JDK 8 o superior
Maven
Selenium WebDriver
Cucumber
Serenity BDD
Chromedriver

# Dependencias
Serenity Core: 2.6.0
Serenity Cucumber: 2.6.0
JUnit: 4.13.2
AssertJ Core: 3.20.2
SLF4J Simple: 2.0.0-alpha4
Apache POI: 5.0.0

#Patron de diseño
Page Object Model (POM)

# Configuración
1.Clona el repositorio en tu máquina local.
2.Navega al directorio del proyecto.
3.Configura las dependencias del proyecto. Asegúrate de tener las versiones correctas en el archivo pom.xml.
4.Descargar los controladores de navegador necesarios ChromeDriver y asegúrate de que estén en tu PATH o configura la ubicación en el archivo de configuración.

# Ejecución de las Pruebas
1. Abre el archivo src/test/resources/features en tu IDE.
2. Ejecuta las pruebas automatizadas utilizando el runner correspondiente, por ejemplo, RunnerLogin.java para las pruebas de inicio de sesión

# casos de prueba
Se automatizaron los procesos de :
Registro
Login
Checkout
RegistarProducto
Historial de ordenes de compra
