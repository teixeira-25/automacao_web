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
    Entao a pagina de envoice mostra no campo de Hotel name "Rendezvous Hotel"
    Entao a pagina de envoice mostra no campo de Invoice Date "Invoice Date: 14/01/2018"
    Entao a pagina de envoice mostra no campo de Due Date "Due Date: 15/01/2018"
    Entao a pagina de envoice mostra no campo de Invoice Number "Invoice #110 details"
    Entao a pagina de envoice mostra no campo de Booking Code "0875"
    Entao a pagina de envoice mostra no campo de Customer Details "JOHNY SMITH R2, AVENUE DU MAROC 123456"
    Entao a pagina de envoice mostra no campo de Room "Superior Double"
    Entao a pagina de envoice mostra no campo de Check In "14/01/2018"
    Entao a pagina de envoice mostra no campo de Check Out "15/01/2018"
    Entao a pagina de envoice mostra no campo de Total Stay Count "1"
    Entao a pagina de envoice mostra no campo de Total Stay Amount "$150"
    Entao a pagina de envoice mostra no campo de Deposit Now "USD $20.90"
    Entao a pagina de envoice mostra no campo de Tax & VAT "USD $19.00"
    Entao a pagina de envoice mostra no campo de Total Amount "USD $209.00"

