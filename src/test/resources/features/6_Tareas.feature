Feature: Automatización de Tareas por hacer

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

    #And el usuario cierra sesion

  Scenario: Finalizar una tarea sin pregunta logica

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
    And el usuario contesta SI en preguntas logicas
    And el usuario selecciona el pais para viajar
    And el usuario selecciona el Estado para viajar
    And el uusuario termina su primera capacitacion
    And el usuario confirma el termino del cuestionario
    And el usuario sale del modulo Tarea por hacer
   # And el usuario cierra sesion