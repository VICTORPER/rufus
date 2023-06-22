Feature: Ver historial de compras
  Background:
    Given que ingreso a la pagina https://opencart.abstracta.us/
    When Doy click en el boton MyAccount
    And ingreso los datos de usuario "victormanuel10@gmail.com" y contrasena "123456"
    Then valido el ingreso exitoso
  Scenario: Ver historial de compra
    Given valido el ingreso exitoso
    When Doy click en la opcion Order History
    Then carga la pagina que muestra el historial de las compras