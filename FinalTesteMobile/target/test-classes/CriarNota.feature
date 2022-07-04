#language:pt
#encoding: UTF-8


Funcionalidade: GoogleNote

Contexto:
Dado que eu starto GoogleNote

@cenario1
Cenario: criar nota
Quando eu acionar o menu para criar nota
E eu clicar na opcao note
E digitar title "Jotaro"
E digitar no content "Kujo"
E clicar em salvar
Entao fica criado a nota