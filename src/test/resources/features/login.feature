Feature: Checkout

  Scenario: completar el proceso de Checkout
    Given que el usuario abre la aplicación y se encuentra en la pantalla de Login
    When el usuario ingresa las credenciales válidas
    And selecciona el producto Sauce Labs Backpack para añadirlo al carrito
    And completa el proceso de Checkout con datos ficticios
    Then el sistema debe mostrar una pantalla de confirmación con el mensaje de éxito.