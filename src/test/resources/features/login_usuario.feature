  @login
  Feature: Login de usuario
    Eu como usuario cadastrado
    Quero fazer login
    Para realizar uma compra

    @login_sucesso
    Scenario: Fazer login com sucesso
      Given que estou na tela de login
      And preencho email e senha
      When clico em login
      Then o login e realizado
      And vejo a mensagem de login realizado com sucesso