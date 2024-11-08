#language: pt
Funcionalidade: Fatura

  Cenário:  Validar detalhes da fatura
    Dado que o usuario esta na pagina de login
    E o usuario preenche na barra de username "demouser"
    E o usuario preenche na barra de senha "abc123"
    E o usuario clica em login
    E o sistema libera o acesso a home
    E o usuario clica para ver a fatura
    E o sistema da acesso a pagina da fatura
    Entao as informacoes sao correspondentes