#language: pt
Funcionalidade: Login Sr Barriga

  Cenario: Login com sucesso
    Dada que eu estou na pagina de Login do Sr Barriga
    Quando eu preencher o email "ytalo@teste.local"
    E eu preencher a senha "1234"
    E eu clico em Entrar
    Entao o sistema exibe a mensagem: "Bem vindo, Ytalo Pegador!"

#  Cenario: Email valido de usuario nao cadastrado
#  Cenario: Email em branco e Senha preenchida
#  Cenario: Email correto e Senha errada
#  Cenario: Email correto e Senha e branco
#  Cenario: Email e senha em branco
#  Cenario: Email invalido

