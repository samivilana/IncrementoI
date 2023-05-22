<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
    <head></head>
    <body>
        <h1>Registrar Cliente</h1>
       <form method="POST" action="restauranteControlador?ruta=registrarCliente">
            <fieldset>
                Nombre: <input type="text" name="nombre"><br><br>
                Apellido: <input type= "text" name= "apellido"><br><br>
                Dirección: <input type = "text" name= "direccion"><br><br>
                Cédula: <input type = "text" name= "cedula"><br><br>                
                Correo electrónico: <input type="text" name="correo"><br><br>               
                Teléfono: <input type="text" name="telefono"><br><br>                
                <input type="submit" value="Registrar Cliente" >
            </fieldset>
        </form>             
    </body>
</html>