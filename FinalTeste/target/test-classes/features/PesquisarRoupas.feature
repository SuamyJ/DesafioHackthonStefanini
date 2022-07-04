#language: pt
#enconding: UTF-8
Funcionalidade: Pesquisar roupas

@cenario2
  Cenario: pesquisar roupas
    Dado  estiver pagina principal "My Store"
    E informo a palavra "Dress"
    E o sistema diz quantas pecas de roupa existem
    Entao confirmo a quantidade
