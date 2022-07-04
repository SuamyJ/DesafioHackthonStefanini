#language:pt
#encoding: UTF-8


Funcionalidade: Alterar nota e pasta


Contexto:
Dado que eu starto GoogleNote

@cenario4

Cenario: iniciar altera selecionar mover
Quando eu segurar a nota
E selecionar para mudar de pasta
E selecionar outra pasta
E confirmo que mudei de pasta
E seleciono a nota
E seleciono para excluir
Entao confirmo selecionando o botao delete
