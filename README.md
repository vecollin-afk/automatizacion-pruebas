# \# Proyecto Automatización de Pruebas

# 

# \## Objetivo

# 

# El objetivo de este proyecto es implementar un flujo básico de pruebas automatizadas utilizando Java, Maven, JUnit, Git y GitHub Actions.

# 

# La idea es que cada cambio realizado en el proyecto pueda ser probado automáticamente, permitiendo detectar errores antes de incorporar nuevas modificaciones.

# 

# \## Tecnologías utilizadas

# 

# \- Java 17

# \- Maven

# \- JUnit 5

# \- Git

# \- GitHub

# \- GitHub Actions

# 

# \## Estructura del proyecto

# 

# src/main/java/cl/automatizacion/

# \- Calculadora.java

# 

# src/test/java/cl/automatizacion/

# \- CalculadoraTest.java

# 

# .github/workflows/

# \- ci.yml

# 

# Archivos principales:

# \- pom.xml

# \- .gitignore

# \- README.md

# 

# \## Pruebas implementadas

# 

# Se implementaron dos pruebas unitarias independientes:

# 

# 1\. Prueba de suma de dos números.

# 2\. Prueba de resta de dos números.

# 

# Cada prueba se ejecuta de forma independiente y no depende del resultado de la otra.

# 

# \## Ejecución local

# 

# Para ejecutar las pruebas se utiliza:

# 

# mvn test

# 

# El resultado obtenido fue:

# 

# Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

# 

# BUILD SUCCESS

# 

# \## Control de versiones

# 

# El proyecto utiliza Git para mantener el historial de cambios.

# 

# Se trabajó inicialmente en una rama:

# 

# feature/configuracion-maven

# 

# Posteriormente los cambios fueron integrados a la rama principal main.

# 

# Se realizaron commits separados para documentar los principales avances del proyecto.

# 

# \## Integración Continua

# 

# Se configuró un pipeline mediante GitHub Actions.

# 

# El archivo utilizado es:

# 

# .github/workflows/ci.yml

# 

# El pipeline se ejecuta automáticamente cuando se realiza un push o un pull request hacia la rama main.

# 

# El flujo realiza las siguientes acciones:

# 

# 1\. Descarga el código del repositorio.

# 2\. Configura Java 17.

# 3\. Ejecuta las pruebas con Maven.

# 4\. Genera un reporte HTML.

# 5\. Guarda los resultados como artefactos de GitHub Actions.

# 

# \## Reporte de pruebas

# 

# Maven genera un reporte HTML utilizando Surefire.

# 

# El reporte permite revisar:

# 

# \- Cantidad de pruebas ejecutadas.

# \- Errores.

# \- Fallos.

# \- Pruebas omitidas.

# \- Porcentaje de éxito.

# \- Tiempo de ejecución.

# 

# En la ejecución realizada se obtuvo un 100% de pruebas exitosas.

# 

# El reporte HTML también queda almacenado como artefacto dentro del pipeline de GitHub Actions.

# 

# \## Conclusión

# 

# Con este proyecto se implementó un flujo básico de automatización de pruebas, desde el control de versiones hasta la ejecución automática mediante integración continua.

# 

# Esto permite que los cambios puedan ser revisados rápidamente y que el equipo tenga acceso a los resultados de las pruebas sin necesidad de ejecutarlas manualmente.

