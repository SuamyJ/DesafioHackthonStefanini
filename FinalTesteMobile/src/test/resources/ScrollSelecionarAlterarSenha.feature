#language:pt
#encoding: UTF-8


Funcionalidade: Selecionar alterar lockar confirmar

Contexto:
Dado que eu starto GoogleNote

@cenario5

Cenario: iniciar altera selecionar mover
Quando girar para cima
E clicarei em guia de instrucoes
E clicarei em aletar nota
E digitarei "Jojo"
E clicarei em confirmar edit
E clicarei em colocar senha
E colocarei senha "1234"
E clicarei em confirmar senha 
E recolocarei senha "1234"
E confirmarei a senha
Entao alterarei a nota e colocarei senha
