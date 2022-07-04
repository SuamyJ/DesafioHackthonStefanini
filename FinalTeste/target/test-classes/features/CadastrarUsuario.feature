#language: pt
#enconding: UTF-8


Funcionalidade: Cadastrar usuario
		
@cenario1	
	Cenario: cadastrar usuario
		Dado que estou na pagina principal "My Store"
		Quando eu acionar a aba SignIn
		E informar o campo email "JosephJoestar@gmail.com"
		E acionar o botao CreateAnAccount
		E selecionar o campo "Mr."
		E informar no campo Firstname "JojoJoseph"
		E informar no campo Last "Joestar"
		E informar no campo  password "12345678"
		E informar no campo adress "AvenidaDr.JoséRufino"
		E informar no campo State "Alabama"
		E informar no campo city "Recife"
		E informar no campo Zip/PostalCode "00000"
		E informar no campo MobilePhone "81988848520"
		E acionar o botao Register
		Entao o sistema cadastra o usuario exibindo a mensagem "Welcome to your account. Here you can manage all of your personal information and orders."

##.feature – serve para que o eclipse entenda que feature é do cucumber
## Features – serve para buscar o local do src
