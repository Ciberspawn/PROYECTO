<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
<STYLE>
.hideable { position: relative; visibility: visible;  }
</STYLE>
<SCRIPT>
function Mostrar_Ocultar(hide) {
if (document.layers)
/*aqui se cambian los valores 'show' y 'hide' para cultarlo o mostrarlo
aqui la variable  (hide) esta en show para ver los campos
document.contenido.visibility = ****variable(hide)**** ? ****estado('show') ****y despues *****: 'hide'; */
document.contenido.visibility = hide ? 'show' : 'hide';
else {
var g = document.all ? document.all.contenido :
document.getElementById('contenido');
g.style.visibility = hide ? 'visible' : 'hidden';
}
}
</SCRIPT>
</HEAD>
<BODY>
<TABLE>
<TR>
<TD VALIGN="top">
<FORM NAME="form0">
Marcalo Para Ver los Campos?
  <INPUT NAME="Accion" TYPE="checkbox"
ONCLICK="Mostrar_Ocultar(this.checked);"
>
</FORM></TD>
<TD>
<SPAN ID="contenido" CLASS="hideable">
<FORM NAME="form1">
  <p>
    <select name="nombre">
      <option>Tipo Documento
        <option value="Cedula Ciudadania">CC
          <option value="Tarjeta Indentidad">TI
            <option value="Cedula Extranjeria">CE
          </select>
  </p>
  <p>
    <label>
    <input type="text" name="Observaciones" id="Observaciones">
    <br>
    <br>
    <textarea name="Observ" id="Observ" cols="45" rows="5">Introduce un texto</textarea>
    </label>
</p>
</FORM>
</SPAN></TD>
</TR>
</TABLE>
</BODY>
</HTML>