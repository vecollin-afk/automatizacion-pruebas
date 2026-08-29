Feature: Consulta de saldo

  Como usuario
  Quiero consultar el saldo de mi cuenta
  Para conocer el dinero disponible

  Scenario: Consulta de saldo de una cuenta activa
    Given que existe una cuenta activa con saldo de 100000
    When el usuario consulta el saldo
    Then el sistema debe mostrar el saldo disponible de 100000

  Scenario Outline: Consulta de saldo segun estado de la cuenta
    Given que existe una cuenta con estado "<estado>"
    When el usuario consulta el saldo
    Then el sistema debe responder "<resultado>"

    Examples:
      | estado       | resultado                         |
      | activa       | SALDO DISPONIBLE                  |
      | bloqueada    | CONSULTA NO DISPONIBLE            |
      | inexistente  | CUENTA NO EXISTE                  |