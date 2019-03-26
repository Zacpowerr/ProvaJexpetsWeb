<%-- 
    Document   : index
    Created on : Mar 25, 2019, 8:38:55 AM
    Author     : Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
<html>
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	        <link href = "style.css" rel = "stylesheet"/>
	        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	        <title>Formulario</title>
	</head>
	<body> 
		<form method="post" action="UsuarioControl?cmd=salvar">
			<div id= "lado_1">
			<label> Nome:</label>
			<input class = "inputbox" name="Nome" type="text" required="true"/>
		        <br /><br />
			<label> Telefone:</label>
			<input class = "inputbox" name="Telefone" type="text" required="true"/>
		        <br /><br />
                      
			<label> Cpf:</label>
			<input class = "inputbox" name="Cpf" type="text" required="true"/>
		        <br /><br />
			<label> Email:</label>
			<input class = "inputbox" name="Email" type="text" required="true"/>
		        <br /><br />
			<label> Login:</label>
			<input class = "inputbox" name="Login" type="text" required="true"/>
		        <br /><br />
			<label> Senha:</label>
			<input class = "inputbox" name="Senha" type="password" required="true"/>
		        <br /><br />
			<label> Superior:</label>
			<input class = "inputbox" name="Superior" type="text" required="true"/>
		        <br /><br />
			<label> Cargo:</label>
			<input class = "inputbox" name="Cargo" type="text" required="true"/>
			</div>
			<div id="lado_2">
			<label> Rua:</label>
			<input class = "inputbox" name="Rua" type="text" required="true"/>
		        <br /><br />
			<label> Numero:</label>
			<input class = "inputbox" name="Numero" type="text" required="true"/>
		        <br /><br />
			<label> Complemento:</label>
			<input class = "inputbox" name="Complemento" type="text" required="true"/>
		        <br /><br />
			<label> Cep:</label>
			<input class = "inputbox" name="Cep" type="text" required="true"/>
		        <br /><br />
			<label> Bairro:</label>
			<input class = "inputbox" name="Bairro" type="text" required="true"/>
		        <br /><br />
			<label> Cidade:</label>
			<input class = "inputbox" name="Cidade" type="text" required="true"/>
		        <br /><br />
			<label> Estado:</label>
			<input class = "inputbox" name="Estado" type="text" required="true"/>
		        <br /><br />
			</div>
                     <input id = "botao"value="Salvar" type="submit"/>
		</form>
		
	</body>
	

</html>
