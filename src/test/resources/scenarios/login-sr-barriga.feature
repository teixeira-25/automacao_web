#language: pt
Funcionalidade: Login Sr Barriga

  @reset
  Cenario: Login com sucesso
    Dada que eu estou na pagina de Login do Sr Barriga
    Quando eu preencher o email "ytalo@teste.local"
    E eu preencher a senha "1234"
    E eu clico em Entrar
    Entao o sistema exibe a mensagem: "Bem vindo, Ytalo Pegador!"

  @reset
  Cenario: Email valido de usuario nao cadastrado
    Dada que eu estou na pagina de Login do Sr Barriga
    Quando eu preencher o email "xuxinha@teste.local"
    E eu preencher a senha "1234"
    E eu clico em Entrar
    Entao o sistema exibe a mensagem: "Problemas com o login do usuário"

  @reset
  Cenario: Email em branco e Senha preenchida
    Dada que eu estou na pagina de Login do Sr Barriga
    Quando eu preencher o email ""
    E eu preencher a senha "1234"
    E eu clico em Entrar
    Entao o sistema exibe a mensagem: "Email é um campo obrigatório"

  @reset
  Cenario: Email correto e Senha errada
    Dada que eu estou na pagina de Login do Sr Barriga
    Quando eu preencher o email "ytalo@teste.local"
    E eu preencher a senha "xcxcxcxcxc"
    E eu clico em Entrar
    Entao o sistema exibe a mensagem: "Problemas com o login do usuário"

  @reset
  Cenario: Email correto e Senha e branco
    Dada que eu estou na pagina de Login do Sr Barriga
    Quando eu preencher o email "ytalo@teste.local"
    E eu preencher a senha ""
    E eu clico em Entrar
    Entao o sistema exibe a mensagem: "Senha é um campo obrigatório"

 @reset
 Cenario: Email e senha em branco
   Dada que eu estou na pagina de Login do Sr Barriga
   Quando eu preencher o email ""
   E eu preencher a senha ""
   E eu clico em Entrar
   Entao o sistema exibe a mensagem: "Email é um campo obrigatório"
   E o sistema exibe a segunda mensagem: "Senha é um campo obrigatório"

 @reset
 Cenario: Email invalido
   Dada que eu estou na pagina de Login do Sr Barriga
   Quando eu preencher o email "teste.local"
   E eu preencher a senha "1234"
   E eu clico em Entrar
   Entao o sistema continua na pagina de login
