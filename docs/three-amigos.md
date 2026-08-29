\# Sesión Three Amigos - Consulta de saldo



\## Funcionalidad



Consulta de saldo de una cuenta.



\## Participantes



\- Product Owner: define qué necesita el usuario y cuál es el resultado esperado.

\- QA: revisa los posibles casos y situaciones que deben probarse.

\- Desarrollador: analiza cómo implementar la funcionalidad y qué validaciones son necesarias.



\## Criterios acordados



Durante la reunión se definió que:



1\. Si la cuenta existe y está activa, el sistema debe mostrar el saldo disponible.

2\. Si la cuenta está bloqueada, el sistema no debe mostrar el saldo.

3\. Si la cuenta no existe, el sistema debe informar que no es posible realizar la consulta.



\## Ejemplos revisados



\- Cuenta activa con saldo de $100000: se muestra el saldo.

\- Cuenta bloqueada: la consulta es rechazada.

\- Cuenta inexistente: se informa que la cuenta no existe.



\## Acuerdo final



Los tres roles acuerdan utilizar estos casos como base para crear los escenarios BDD y automatizar posteriormente las pruebas.

