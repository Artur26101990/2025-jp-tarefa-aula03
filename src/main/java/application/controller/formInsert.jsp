<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pt-br">

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Mensagem</title>
    </head>
    <body>
        <h1>Nova Tarefa</h1>
        <form action="/tarefas/insert" method="post">
            <label> Descricao</label>
            <input> type="text" name="descricao" />
            <button type="submit">Salvar</button> 
        </form>
    </body>
</html>