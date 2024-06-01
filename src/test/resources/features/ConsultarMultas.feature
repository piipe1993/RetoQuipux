#language: es
Característica: CASO0003 consultar Multas

  @CASO001 @ConsultarMultas @AllCases
  Esquema del escenario: consultar Multas dentro portal movilidad
    Dado     que el usuario acceda a la pagina web "<url>"
    Cuando   el usuario ingrese el documento a consultar "<documento>"
    Entonces el usuario visualizara el listado de multas


    Ejemplos:
      | url                                                        | documento |
  ##@externaldata@./Data/DataQuipux.xlsx@Multas
      | https://digital.quipux.com/portal-movilidad/#/inicio-login | 111       |