<%@page import="java.util.*,
				java.text.*,
				br.com.caelum.jdbc.dao.*,
				br.com.caelum.modelo.*"
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Nome</td>
			<td>Email</td>
			<td>Endereco</td>
			<td>Data de Nascimento</td>
		</tr>
		<% 
		ContatoDao dao = new ContatoDao();
	
		List<Contato> contatos = dao.getLista();
		
		String dataFormatada;
		
		for(Contato contato : contatos){
			
			//dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(contato.getDataNascimento());
		%>
		<tr>
			<td><%= contato.getNome() %></td>
			<td><%= contato.getEmail() %></td>
			<td><%= contato.getEndereco() %></td>
			<td><%= contato.getDataNascimento().getTime() %></td>
		</tr>
		<%
		}		
		%>
	</table>
</body>
</html>