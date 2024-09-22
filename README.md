# Cucumber DemoBlaze Tests

Este proyecto implementa pruebas automatizadas para la página web [Demoblaze](https://www.demoblaze.com/) utilizando el framework Cucumber con Selenium WebDriver.

## Descripción

El repositorio contiene una suite de pruebas automatizadas utilizando Cucumber como herramienta de BDD (Behavior-Driven Development) junto con Selenium WebDriver. Las pruebas simulan la interacción del usuario con el sitio web de Demoblaze, validando el correcto funcionamiento de varias características, como la navegación de productos, la funcionalidad del carrito de compras, y más.

## Tecnologías utilizadas

- **Lenguaje:** Java
- **Framework de automatización:** Selenium WebDriver
- **Framework BDD:** Cucumber
- **Manejo de dependencias:** Maven
- **IDE:** IntelliJ IDEA
- **Repositorio:** GitHub

## Características principales

- **Escenarios BDD con Gherkin:** Define escenarios de pruebas en lenguaje natural que son fácilmente comprensibles por cualquier persona.
- **Automatización con Selenium WebDriver:** Automatiza la interacción con la interfaz gráfica del sitio web.
- **Manejo de datos de prueba:** Datos de prueba reutilizables para diferentes escenarios.
  
## Estructura del proyecto

```sh
CucumberDemoBlazeTests/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/demoblaze/stepdefinitions/
│   ├── test/
│   │   └── java/
│   │       └── com/demoblaze/tests/
│   └── resources/
│       └── features/
│           └── demoblaze.feature
├── .idea/  # Configuración del proyecto en IntelliJ IDEA
└── pom.xml # Dependencias del proyecto con Maven
```
## Pre-requisitos
Java JDK 8 o superior.
Maven.
Selenium WebDriver.
Cucumber.
IntelliJ IDEA (opcional).

## Instalación

1. Clona este repositorio:

    ```sh
    git clone https://github.com/argenisjpinto/CucumberDemoBlazeTests.git
    ```

2. Importa el proyecto en tu IDE (IntelliJ IDEA recomendado).

3. Descarga las dependencias usando Maven:

    ```sh
    mvn clean install
    ```

## Ejecución de pruebas

Para ejecutar las pruebas desde la línea de comandos, utiliza Maven:

    mvn test
    
También puedes ejecutar las pruebas directamente desde tu IDE si estás usando IntelliJ IDEA.

## Definición de escenarios con Gherkin
```sh
Feature: Comprar un producto en Demoblaze

  Scenario: Usuario agrega un producto al carrito
    Given El usuario está en la página principal de Demoblaze
    When El usuario selecciona un producto
    And El usuario agrega el producto al carrito
    Then El producto debe estar en el carrito de compras
```

Los escenarios de prueba están definidos en el archivo demoblaze.feature utilizando el lenguaje Gherkin. Ejemplo de un escenario de prueba:

## Contribuciones

Si deseas contribuir a este proyecto, por favor abre un *issue* o envía una *pull request*. Asegúrate de seguir las buenas prácticas y realizar pruebas antes de enviar tus cambios.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

---
