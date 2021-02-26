# Zaira Jenny Casimiro Ramirez

Feature: Ver Funciones y No Funciones de mi app Zeus

  Scenario: El usuario consulta la pantalla de Funciones
    When El usuario oprime el menu Funciones y no Funciones
    Then El usuario visualiza el bottom sheet Funciones y no Funciones
    When El usuario selecciona Funciones
    Then El usuario visualiza la pantalla funciones
    And  El usuario vuelve al menu
  Scenario: El usuario consulta la pantalla de No Funciones
    When El usuario oprime el menu Funciones y no Funciones
    Then El usuario visualiza el bottom sheet Funciones y no Funciones
    When El usuario selecciona No Funciones
    Then El usuario visualiza la pantalla No funciones
    And  El usuario vuelve al menu