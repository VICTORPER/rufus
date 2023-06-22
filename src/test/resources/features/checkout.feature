Feature: Chekout producto
  Background:
    Given Abro la pagina de inicio
    And Ingreso sesion con mi usuario y contrasena "victormanuel10@gmail.com" y contrasena "123456"
    And Agrego un producto al carrito
  Scenario: Gestionar la compra del producto
    Given Que me encuentro con productos agregados al carrito
    When Doy click en la pestana Checkout
    And Doy click en el boton Continue de la seccion step2
    And Doy click en el boton Continue de la seccion step3
    And Doy click en el boton Continue de la seccion step4
    And Doy click en la caja de texto I have read and agree to the Terms & Conditions
    And Doy click en el boton Continue de la seccion step5
    And Doy click en el boton Confirm Order de la seccion step6
    Then Se confirma la orden de compra