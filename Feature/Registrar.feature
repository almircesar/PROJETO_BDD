
Feature: Registro no site


  Scenario: Registrar com sucesso
    Given Usuario esta na home
    When usuario na pagina de registro
    When Preenche campos
    Then Cadastro feito com sucesso

  Scenario: Registrar com excesso de caracteres
    Given Usuario esta na home
    When usuario na pagina de registro
    When Registra com caracteres a mais
    Then Ficar na mesma pagina e nao registra

