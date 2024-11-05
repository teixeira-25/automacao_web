#language: pt
Funcionalidade: Login Fluentz

  @reset
  Cenario: Login com sucesso
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teste.gabriel@gmail.com"
    E preenche a senha "1234"
    E clica em entrar
    Entao o sistema da acesso a home

  @reset
  Cenario: Email incorreto e senha correta
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha123@gmail.com"
    E preenche a senha "1234"
    E clica em entrar
    Entao o sistema exibe a mensagem "User not found"

  @reset
  Cenario: Email invalido
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teste.teixeira"
    E preenche a senha "1234"
    E clica em entrar
    Entao o sistema exibe a mensagem "Invalid email"

  @reset
  Cenario: Email invalido e senha incorreta
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha123"
    E preenche a senha "qwe123"
    E clica em entrar
    Entao o sistema exibe a mensagem "Invalid email"

  @reset
  Cenario: Email correto e senha incorreta
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teste.gabriel@gmail.com"
    E preenche a senha "qwe123"
    E clica em entrar
    Entao o sistema exibe a mensagem "Incorrect password"

  @reset
  Cenario: Email e senha incorretos
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha123@gmail.com"
    E preenche a senha "qwe123"
    E clica em entrar
    Entao o sistema exibe a mensagem "User not found"

  @reset
  Cenario: Email e senha nao preenchidos
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email ""
    E preenche a senha ""
    E clica em entrar
    Entao o sistema exibe a mensagem "Fill in email"

  @reset
  Cenario: Senha nao preenchida
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teste.gabriel@gmail.com"
    E preenche a senha ""
    E clica em entrar
    Entao o sistema exibe a mensagem "Fill in password"