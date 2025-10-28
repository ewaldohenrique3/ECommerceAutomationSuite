  @cadastro
  Feature: Cadastro de usuário
    Eu como novo usuario
    Quero me cadastrar
    Para fazer compras

    @cadastro_sucesso
    Scenario: Registrar novo usuario com sucesso
      Given que estou na tela de login
      And acesso o cadastro de usuario
      When eu preencho o formulario de cadastro
      And clico em registrar
      Then vejo a mensagem de login realizado com sucesso