Feature: Pruebas Generales

  Scenario: Iniciar la sesión con la aplicación Zeus con un usuario corporativo.

    Given El usuario tenga sus credenciales vigentes
    When  El usuario ejecute la aplicacion en su dispositivo
    Then  El usuario captura el numero del empleado
    And   El usuario da clic en continuar en la pantalla empleado
    And   El usuario ingresa el password
    And   El usuario da clic en continuar en la pantalla password
    And   El usuario captura el numero de celular
    And   El usuario da clic en continuar en la pantalla numero de celular
    And   El usuario captura el numero de activacion
    And   El usuario da clic en continuar en la pantalla numero de activacion

  Scenario:El usuario recorre las opciones de Mision y Vision

    And   el usuario ingresa al modulo Vision y mision
    And   el usuario selecciona el apartado del video Mision y lo reproduce
    And   el usuario sale del modulo Vision y mision
    And   el usuario ingresa al modulo Vision y mision
    And   el usuario selecciona el apartado del video Vision y lo reproduce
    And   el usuario sale del modulo Vision y mision

  Scenario:El usuario consulta la pantalla de valores

    When El usuario oprime el menu de Valores
    Then El usuario visualice la pantalla de Valores

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

  Scenario:El usuario consulta la pantalla de Grupo Salinas

    When El usuario oprime el menu de Grupo Salinas
    Then El usuario visualice la pantalla de Grupo Salinas


  Scenario: Finalizar una tarea con pregunta logica

    And el usuario ingresa al modulo Tareas por hacer
    And el usuario busca una Tarea por hacer
    And el usuario selecciona Tarea Automatizacion Zeus
    And el usuario muestra el documento adjunto y continua
    And el usuario contesta las pregunta de respuestas multiples y continua
    And el usuario captura la pregunta abierta y continua
    And el usuario contesta la pregunta de respuesta unica
    And el usuario descarga el video y lo reproduce
    And el usuario toma una selfie y continua
    And el usuario carga una imagen y continua
    And el usuario graba un audio y continua
    And el usuario graba un video y continua
    And el usuario contesta NO en preguntas logicas
    And el usuario confirma el termino del cuestionario
    And el usuario sale del modulo Tarea por hacer






