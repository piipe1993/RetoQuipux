#language: es
Característica: CASO0002 Crear Cuenta

  @CASO001 @logIn @AllCases
  Esquema del escenario: Iniciar sesion dentro portal movilidad
    Dado     que el usuario acceda a la pagina web "<url>"
    Cuando   el usuario diligencie el formulario de inicio de sesion con los datos "<correo>" "<contraseña>"
    Entonces el usuario visualizara el home del portal


    Ejemplos:
      | url                                                        | correo              | contraseña |
  ##@externaldata@./Data/DataQuipux.xlsx@IniciarSesion
      | https://digital.quipux.com/portal-movilidad/#/inicio-login | Andresp@hotmail.com | Andres123* |
