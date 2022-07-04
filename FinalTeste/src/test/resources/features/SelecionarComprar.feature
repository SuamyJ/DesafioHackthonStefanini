#language: pt
#enconding: UTF-8
Funcionalidade: Selecionar

@cenario3
  Cenario: selecionar roupas
    Dado  estiver feito o login
    Quando mover para a aba "Dresses"
    E mover para aba "Summer Dresses"
    E clicar em "Add to cart"
    E clicar na opcao "continue shopping"
    E o carrinho mostrar a quantidade de itens no carro
    E clicar de novo em "Add to car"
    E clicar na opcao "Proceed to Checkout"
    E deseleciono um outro vestido "printed summer dress"
    E proceed "CheckOut"
    E proceed "to checkout"
    E clico em "aceitar termos"
    E clico para ler "termos do serviço"
    E clico em fechar o botao
    E clico no botao proceed CheckOut
    
    
    
