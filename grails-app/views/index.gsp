<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>bienvenidos</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <content tag="nav">
       
    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Bienvenidos</h1>

            
            <h2>Este es un cambio de la rama master</h2>

            <div id="controllers" role="navigation" class="text-center">
                %{-- <h2>Available Controllers:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">empleaado</g:link>
                        </li>
                    </g:each>
                </ul> --}%
                
                %{-- LINK --}%
                %{-- <g:link controller="empleado" params="[id:1, nombre:'MARCOS']">link</g:link> --}%
                
                %{-- importar elementos  --}%
                %{-- <%@ page import="java.awt.*" %> --}%
                %{-- tipo de contenido para render --}%
                %{-- <%@ page contentType="application/json" %> --}%

                %{-- declarar variables, variables predefinidas: flash, aut, params, request, respons, sesion --}%
                <% fecha = new Date() %> 
                %{-- acceder a variables --}%
                <%= fecha %>

                %{-- iterar datos --}%
                 %{-- <p>
                <% [1,2,3,4].each { num -> %>
                    <%= "--- Hello ${num}!" %>
                <%}%>
                </p> --}%

                %{-- PASAR ATRIBUTOS A TAGS --}%
                %{-- <g:example attr="${new Date()}" attr2="[one:1, two:'two']">
                   Hello world
                </g:example> --}%

                %{-- CREAR VARIABLES CON TAGS--}%
                %{-- <g:set var="now" value="${new Date()}" />
                <g:set var="fecha">
                   valor a asignar ${new Date()}
                </g:set>
                <%= fecha%> --}%

                %{-- IF ELSE --}%
                %{-- <g:if test="${session.role == 'admin'}">
                    <% x=5 %>
                </g:if>
                <g:else>
                    <% x=6 %>

                </g:else>
                -----
                <%=  x  %> --}%

                %{-- EACH AND WHILE --}%
                %{-- <g:each in="${[1,2]}" var="num"> --}%
              
               %{--     <p>EACH. Number ${num}</p>
                </g:each>

                <g:set var="num" value="${1}" />
                <g:while test="${num < 3 }">
                    <p>WHILE. Number ${num++}</p>
                </g:while> --}%

                %{-- LINKS 
                <g:link controller="book" action="list">Book List</g:link>
                <g:link url="[action: 'list', controller: 'book']">Book List</g:link>
                <g:link params="[sort: 'title', order: 'asc', author: currentBook.author]"
                        action="list">Book List</g:link>
                --}%

                %{-- EXPRESIONES --}%
                 %{-- Hello ${params.name} --}%

                 %{-- FORMS --}%


                <g:form name="miForm" url="[controller:'login', action:'index']" method="post">
                    <br>
                    <g:textField name="user" value="" class='input-sm' placeholder="Usuario" /><br><br>
                    <g:passwordField name="pass" placeholder='password' class='input-sm'/>
                    <br><br>
                    <g:actionSubmit value="Acceder" action="index" class='btn btn-sm btn-success'/>
                </g:form>
                   
                %{-- OTRA FORMA DE ACCEDER         --}%
                %{-- <g:form name="form" controller="empleado"  method='post'  params="[id:1]" > --}%
                    %{-- <g:field type='text' name='nombre'/> --}%
                    %{-- <g:actionSubmit value="enviar" action='index'  onclick="return confirm('Are you sure???')" />
                </g:form> --}%
            </div>
        </section>
    </div>

</body>
</html>
