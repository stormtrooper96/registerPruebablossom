# Proyecto de prueba registro Blossom - Jonathan andres Pardo

es una aplicación de ejemplo que permite a los usuarios registrarse en el sitio web para acceder a sus funciones. Está desarrollado siguiendo el patrón Screenplay de Serenity BDD y utiliza Cucumber para la definición de escenarios de prueba.


## Estructura del Proyecto
El proyecto está organizado en diferentes paquetes que cumplen diferentes funciones:

- constants: Contiene constantes utilizadas en el proyecto.
- model: Contiene clases de modelo que representan las entidades de la aplicación.
    - RegisterPage: Representa la página de registro y proporciona métodos para interactuar con ella.
- questions: Contiene clases que definen preguntas para obtener información de la aplicación.
    - HaveWelcomeMessage: Define una pregunta para verificar si se muestra un mensaje de bienvenida.
    - TakeScreenshot: Define una pregunta para tomar una captura de pantalla.
- runner: Contiene la clase de ejecución de pruebas de Cucumber.
- steps: Contiene las clases de definición de pasos para los escenarios de Cucumber.
- tasks: Contiene las clases de tareas que representan las acciones realizadas por los actores.
- util: Contiene clases de utilidad utilizadas en el proyecto.
    - RandomNumber: Proporciona métodos para generar números aleatorios.
    - ScreenshotUtil: Proporciona métodos para guardar capturas de pantalla.

- CucumberTestSuite: Define la suite de pruebas de Cucumber.
### Reportes


El proyecto utiliza Serenity BDD para generar informes detallados y claros sobre la ejecución de las pruebas. Serenity proporciona dos tipos de informes: el informe "One Page" y el informe "Detallado".

## Informe One Page
El informe "One Page" es un resumen conciso de los resultados de las pruebas. Proporciona una visión general de los casos de prueba ejecutados, los resultados de cada caso de prueba y los pasos que se llevaron a cabo durante la ejecución. Este informe es ideal para obtener una visión rápida de la calidad de las pruebas y los resultados obtenidos.
Url:

## **Informe Detallado**
El informe "Detallado" ofrece una visión más completa de la ejecución de las pruebas. Proporciona información detallada sobre cada caso de prueba, incluyendo los pasos ejecutados, los resultados obtenidos y cualquier captura de pantalla relevante. Además, este informe incluye métricas adicionales como el tiempo de ejecución, la cobertura de código y los errores encontrados. Es especialmente útil para un análisis exhaustivo de los resultados y la identificación de posibles problemas o áreas de mejora.
Url:

## **Informe Detallado**
El informe "Detallado" ofrece una visión más completa de la ejecución de las pruebas. Proporciona información detallada sobre cada caso de prueba, incluyendo los pasos ejecutados, los resultados obtenidos y cualquier captura de pantalla relevante. Además, este informe incluye métricas adicionales como el tiempo de ejecución, la cobertura de código y los errores encontrados. Es especialmente útil para un análisis exhaustivo de los resultados y la identificación de posibles problemas o áreas de mejora.
Url:

## Escenario de pruebas  
```gherkin
Feature: User Registration
As a user, I want to register on the page to create my account and access the features.

Scenario Outline: Successful registration with all required fields
Given Jhon is on the registration page
When Jhon enters his first name as <First Name> and his last name as <Last Name> and his address as <Address>
And Jhon enters his city as <City> and his state as <State> and his zip code as <Zip Code>
And Jhon enters his phone number as <Phone Number>
And Jhon enters his SSN as <SSN>
And Jhon enters his username as <Username> with a random number, his password as <Password>, and his confirm password as <Confirm Password>
And Jhon clicks on the register button
Then Jhon should see a registration success message
Then Jhon takes a screenshot of the registration success message

Examples:
| First Name | Last Name | Address | City | State | Zip Code | Phone Number | SSN | Username | Password | Confirm Password |
| John | Doe | 123 Main St | Miami | FL | 12345 | 1234567890 | 3123456789 | JohnDoe4 | mypassword | mypassword |
```
Describe el escenario de un registro exitoso con todos los campos requeridos. Jhon, como usuario, comienza en la página de registro. Él ingresa su información personal, incluyendo su nombre, apellido y dirección. Luego ingresa su ciudad, estado y código postal. Jhon también proporciona su número de teléfono y SSN (número de seguro social). Establece su nombre de usuario con un número aleatorio y elige una contraseña, junto con su confirmación. Después de ingresar todos los detalles, hace clic en el botón de registro. Jhon espera ver un mensaje de éxito de registro y toma una captura de pantalla como referencia. La tabla de ejemplos proporciona valores específicos para los diferentes campos utilizados en el escenario.

## Ejecución de las pruebas
Para ejecutar el proyecto de muestra, puedes simplemente ejecutar la clase de prueba CucumberTestSuite en el paquete com.jandrespardos.registerBlossom.runner, o ejecutar mvn verify

Por defecto, las pruebas se ejecutarán utilizando Chrome. Puedes ejecutarlas en Firefox sobrescribiendo la propiedad del sistema driver, por ejemplo:

```json
$ mvn clean verify -Ddriver=firefox
```



Para seleccionar el  qué entorno ejecutar las pruebas. puedes ejecutar el siguiente comando:
```json
$ mvn clean verify -Denvironment=dev
```

