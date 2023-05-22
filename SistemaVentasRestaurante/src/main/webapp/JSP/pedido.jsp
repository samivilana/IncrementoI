<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head></head>
    <body>

    <h2>Selección de menú</h2>
    <form action="form-result.php" method="post" target="_blank">

<p>

  <input type="radio" name="plato" value="Hamurguesasimple"> Hamburguesa simple<br>

  <input type="radio" name="plato" value="Hamburguesadoble"> Hamburguesa doble<br>

  <input type="radio" name="plato" value="Hamburguesaconpapas"> Hamburguesa con papas

</p>
<br>
Cantidad: <input type = "text" name = "cantidad"><br>

<p><input type="submit" value="Enviar pedido"></p>

</form>
    </form>
    </body>
</html>