#Autor: Brayant Gamboa Betancur

  @stories2
  Feature:  Como un usuario
            Quiero ingresar a google Translator
            A traducir palabras entre diferentes lenguajes
  @traducir
  Scenario: Traducir de Ingles a Español
    Given que Brayant quiere usar el traductor de google
    When el traduce una palabra de inglés a español
    |origen  |destino  |palabrai    |
    |Inglés  |español  |table       |
    Then el debería ver la palabra traducida del idioma origen a idioma destino
    |palabrae  |
    |mesa      |