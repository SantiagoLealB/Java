<!doctype html>
<html>
<head>
    %{-- <meta name="layout" content="main"/> --}%
    <title>Empleado</title>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:stylesheet src="application.css"/>
    <asset:stylesheet src="estilos.css"/>

</head>
<body>
    <div class="col-sm-12 divHead">
        <h4 class="col-sm-6">Bienvenido</h4>
         <h4 class="text-right col-sm-6">${nombre} ${apellido} </h4>
    </div>
     <div class="col-sm-12 divTitle">
     	<g:link controller="book" action="list">Book List</g:link>
         <g:link controller="empleados" action="index" > EMPLEADOS</g:link>
    </div>

    <div id="content" >
        <section class="row colset-2-its">
        	

             
        </section>
    </div>

     <asset:javascript src="application.js"/>
</body>
</html>