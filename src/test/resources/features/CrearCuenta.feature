#language: es
Característica: CASO0001 Crear Cuenta

  @CASO001 @crearCuenta @AllCases
  Esquema del escenario: Crear cuenta de usuario dentro portal movilidad
    Dado     que el usuario acceda a la pagina web "<url>"
    Cuando   el usuario diligencie el formulario completo de registro con los datos
      | tipoDoc   | documento   | nombres   | apellidos   | celular   | correo   | contraseña   |
      | <tipoDoc> | <documento> | <nombres> | <apellidos> | <celular> | <correo> | <contraseña> |
    Entonces el usuario visualizara el mensaje de confirmacion


    Ejemplos:
      | url                                                                                            | tipoDoc                     | documento | nombres | apellidos | celular | correo                 | contraseña   |
  ##@externaldata@./Data/DataQuipux.xlsx@CrearCuenta
   |https://digital.quipux.com/portal-movilidad/#/inicio-login   |CC   |1017211   |Andres   |Cardona   |3201254749   |Andresp@hotmail.com   |Andres123*|

