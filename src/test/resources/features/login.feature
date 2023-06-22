Feature: Loguearse en la pagina de prueba

  Scenario: Login
    Given que ingreso a la pagina https://opencart.abstracta.us/
    When Doy click en el boton MyAccount
    And ingreso los datos de usuario "victorperez105@gmail.com" y contrasena "americadecali"
    Then valido el ingreso exitoso