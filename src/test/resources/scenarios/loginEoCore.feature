#language: pt
Funcionalidade: Login Eo Core

  @reset
  Cenário: Login com sucesso.
    Dado que o usuario esta na pagina de login
    E o usuario preenche na barra de username "demouser"
    E o usuario preenche na barra de senha "abc123"
    E o usuario clica em login
    Entao o sistema libera o acesso a home

  @reset
  Cenário: Login incorreto (Username com letra maiúscula)
    Dado que o usuario esta na pagina de login
    E o usuario preenche na barra de username "Demouser"
    E o usuario preenche na barra de senha "abc123"
    E o usuario clica em login
    Entao o sistema exibe a mensagem "Wrong username or password."

  @reset
  Cenário: Login incorreto (Username incorreto e senha incorreto)
    Dado que o usuario esta na pagina de login
    E o usuario preenche na barra de username "demouser_"
    E o usuario preenche na barra de senha "xyz"
    E o usuario clica em login
    Entao o sistema exibe a mensagem "Wrong username or password."

  @reset
  Cenário: Login incorreto (Username incorreto e senha incorreto)
    Dado que o usuario esta na pagina de login
    E o usuario preenche na barra de username "demouser"
    E o usuario preenche na barra de senha "nananana"
    E o usuario clica em login
    Entao o sistema exibe a mensagem "Wrong username or password."