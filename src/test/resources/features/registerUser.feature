Feature: Registrar un usuario

  Scenario Outline: Registrar
    Given que estoy en la pagina https://opencart.abstracta.us/
    When Hago click en el boton MyAccount
    And Doy click en el boton Register
    And Lleno el formulario
      | firstname        | lastname | email                  | phone      | password | confirmpassword |
      | <firstname>      | <lastname> | <email>                | <phone>    | <password> | <confirmpassword> |
    And Hago click en el boton Continue
    Then el usuario se registra con exito

    Examples:
      | firstname        | lastname | email                 | phone      | password | confirmpassword |
      | victor manuel    | perez    | victormanuel11@gmail.com | 3005266676 | 123456   | 123456          |