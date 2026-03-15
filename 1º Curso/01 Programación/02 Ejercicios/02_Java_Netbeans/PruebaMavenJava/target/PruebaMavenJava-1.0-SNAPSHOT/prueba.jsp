<%-- 
    Document   : prueba
    Created on : 14 dic 2025, 22:04:46
    Author     : Ulises III
--%>
<%@page import="clases.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba de Conexión Oracle (JSP)</title>
    </head>
    <body>
        <h1>Resultado de la Prueba de Conexión JDBC a Oracle XE</h1>
        
        <% 
       
            
            System.out.println("--- JSP: INICIANDO PRUEBA DE CONEXIÓN A ORACLE ---");
            
            // Instancia la clase 'conexion' (la inicialización intenta conectar)
            conexion testConexion = new conexion(); 
            
            // Verifica si la conexión fue exitosa revisando el Statement
            if (testConexion.getEstado() != null) {
                out.println("<h2> CONEXIÓN EXITOSA!</h2>");
                out.println("<p>Verifique la consola de su IDE/Tomcat para el detalle.</p>");
            } else {
                out.println("<h2> ERROR DE CONEXIÓN</h2>");
                out.println("<p>Revise el mensaje de error ORA-xxxx en la consola de su IDE/Tomcat.</p>");
            }
            
           
           // 3. Muestra detalles y cierra
            out.println("<h2> Detalles de Conexión: " + testConexion.toString() + "</h2>"); 
         
            
            // Cierra la conexión
            testConexion.cerrarConexion(); 
            
            System.out.println("--- JSP: PRUEBA FINALIZADA ---");
        %>

    </body>
</html>
