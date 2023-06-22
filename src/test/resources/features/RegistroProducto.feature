Feature: Registrar producto
  Background:
    Given me encuentro en la pagina de inicio
    And estoy en la pantalla MyAccount
    And Inicio sesion con mi usuario y contrasena "victorperez105@gmail.com" y contrasena "americadecali"

  Scenario: Agregar producto al carrito despues de iniciar sesión
    Given Que me encuentro logueado en la pagina
    When Doy click en el boton Phones & PDAs
    And Doy click en boton ADD TO CARD
    Then se agrega el producto al carrito

