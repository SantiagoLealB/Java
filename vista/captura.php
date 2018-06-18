<?php
	include('../controlador/sesion.php');
	include('../controlador/noCache.php');
	// ECHO 111;
?>
<!DOCTYPE HTML>
<html lang="en">
	<head>
		<title>Sistema de Pagos NC</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<!-- NO CACHE -->
		<!-- <meta http-equiv="expires" content="Sun, 01 Jan 2014 00:00:00 GMT"/> -->
		<!-- <meta http-equiv="pragma" content="no-cache" /> -->

		<link href="../bootstrap/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" type="text/css" href="../bootstrap/estilos.css" media="screen"/>
		 <!-- calendario -->
	    <link href="../bootstrap/datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen"/>
		<script src="../bootstrap/jquery-3.2.1.min.js"></script>
		<script src="../bootstrap/bootstrap-3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="../assets/css/main.css" />
		<!-- aceptar input number -->
		<!-- <script src="../assets/number-polyfill/number-polyfill.js"></script> -->


        <script type="text/javascript">
            $(document).ready(function() {
               	$(function(){
               		$('#solicitud').focus();
               	});

              //BUSCAE CON ENTER
			    $('#solicitud').keypress(function(e){
			        if(e.which == 13){//Enter key pressed
			            $('#buscar').click();//Trigger search button click event
			        }
			    });
            });
        </script>
		<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 -->
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
<body>
		<!-- Wrapper -->
	<div id="wrapper">
		<!-- Main -->
		<div id="main">
			<div class="inner">
				<!-- Header -->
				<header id="header">
					<p class="tituloProyecto centrar">SISTEMA DE PAGOS NUESTRA CAJA</p>
					<!-- <ul class="icons">
						<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon fa-snapchat-ghost"><span class="label">Snapchat</span></a></li>
						<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="#" class="icon fa-medium"><span class="label">Medium</span></a></li>
					</ul> -->
				</header>

				<!-- Banner -->
				<section id="banner">
					<div class="content">
						<header>
							<div class="row">
								<h3 class="titulo col-sm-12">CAPTURA DE INFORMACIÓN</h3>
							</div>
						</header><br>

						<div class="row">
							<label class="tam12 control-label"><?php echo $_SESSION['sucursal']==5008 ? "Centro / Solicitud: " : 'Solicitud: ';  ?> </label> 
							<div class="col-sm-2">
								<input type="text" name="solicitud" id="solicitud" class="form-control input-sm col-sm-2">
							</div>
 						  	<div class="col-sm-2">
 						  		<button type="button" class="btn btn-primary btn-sm" id="buscar" onclick="buscarCreditos()"><span class="glyphicon glyphicon-search"></span> Buscar</button>

 						  	</div>
						</div>
						<hr>
						<!-- aqui se agregará el check -->
						<!-- aqui se agregara el formato de solicitud -->
						<div id="contenido" class="col-sm-12">   </div>
						<!-- inicia hoja beneficiarios -->
						<div id="contenido2" class="col-sm-12"> </div>

						<div id="contenido3" class="col-sm-12">	</div>
					</div>
				</section>
			</div>
		</div>

		<!-- Sidebar -->
		<div id="sidebar">
			<div class="inner">
				<nav id="menu">
  					<div class="row">
						<div class="col-sm-4">
							<img src="../images/logo.jpg" id="logoChico">
						</div>
						<div class='col-sm-8 centrar'><br>
							<span class="arial  azul negrita tam10"><?php echo $_SESSION['nombre']; ?></span>
						</div>
					</div>
					<hr>
 					<ul>
 						<li><strong><a href="../index.php">MENU</a></strong></li>
						<li class=""><a href="captura.php">CAPTURA</a></li>
						<li class=""><a href="consultas.php">CONSULTAS</a></li>
						<!-- <li class=""><a href="../vista/archivos.php">GENERAR ARCHIVOS</a></li> -->
						<li class=""><a href="../controlador/cerrarSesion.php">SALIR</a></li>
					</ul>
				</nav>

				<!-- Footer -->
				<footer id="footer">
					<p class="copyright">&copy; NUESTRA CAJA S.A DE C.V<!-- <a href="https://unsplash.com">Unsplash</a>. Design: <a href="https://html5up.net">HTML5 UP</a> -->.</p>
				</footer>
			</div>
		</div>
	</div>

		<!-- Scripts -->

		<script src="../assets/js/skel.min.js"></script>
		<script src="../assets/js/util.js"></script>
		<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
		<script src="../assets/js/main.js"></script>

		<!-- dibujar formato de la solicitud -->
		<script src="js/capturaInformacion.js"></script>
		<!-- DATE TIMEPICKER -->
		<script type="text/javascript" src="../bootstrap/datetimepicker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../bootstrap/datetimepicker/js/locales/bootstrap-datetimepicker.es.js" charset="UTF-8"></script>

	</body>
</html>
