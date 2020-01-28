#Feature: Pesquisa Lupa.

Feature: Title of your feature
  I want to use this template for my feature file


  Scenario: Pesquisa Lupa funcionando
    Given Usuario esta na home
    When Procurando produto especifico
    Then pesquisa concluida

  Scenario: Pesquisa Falha
    Given Usuario esta na home
    When procurando produto invalido
    Then pesquisa invalida
    
