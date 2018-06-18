<?php
	session_start();
	if(!$_SESSION['autentificado']){
		// header('Location: http://187.141.125.250/pruebas/index2.php');
		header("Location: http://192.90.7.100/intranet");
		exit();
	}

	if(substr($_SESSION['sucursal'],0, 2) != 90){
		header("Location: ../index.php");
		exit();
	}
?>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Sistema de Pagos NC</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link href="../bootstrap/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" type="text/css" href="../bootstrap/estilos.css" media="screen"/>
		 <!-- calendario -->
	    <link href="../bootstrap/datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen"/>
		<script src="../bootstrap/jquery-3.2.1.min.js"></script>
		<script src="../bootstrap/bootstrap-3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="../assets/css/main.css" />

   	    <script type="text/javascript">
            $(document).ready(function() {
            	$('#folio').focus();

					    //BUSCAE CON ENTER
					    $('#folio').keypress(function(e){
					        if(e.which == 13){//Enter key pressed
					            $('#buscar').click();//Trigger search button click event
					        }
					    });
					    $('#fecha').keypress(function(e){
					        if(e.which == 13){//Enter key pressed
					            $('#buscar').click();//Trigger search button click event
					        }
					    });

              $('.form_date').datetimepicker({
				        language:  'es',
				        weekStart: 1,
				        todayBtn:  1,
								autoclose: 1,
								todayHighlight: 1,
								startView: 2,
								minView: 2,
								forceParse: 1
						  });
        	});
        </script>
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
				</header>

				<!-- Banner -->
				<section id="banner">
					<div class="content">
						<header>
							<div class="row">
								<h3 class="titulo col-sm-12">CONSULTAS</h3>
							</div>
						</header><br>
						<!-- consultar por centro colectiva amiga -->
						<div class="row">
							<label class="tam12 control-label">Folio Ficha: </label>
							<div class="col-sm-2">
								<input type="text" name="folio" id="folio" class="form-control input-sm col-sm-2">
							</div>
							<label class="tam12 control-label">Fecha: </label>
							<div class="col-sm-3">
								<div class='input-group date form_date col-sm-3' data-date='' data-date-format='yyyy-mm-dd'>
									<input class='' size='16' type='text' value='' name='fecha' id='fecha' placeholder='AAAA-MM-DD' required>
									<span class='input-group-addon'>
										<span class='glyphicon glyphicon-calendar'></span>
									</span>
								</div>
							</div>
 						  	<div class="col-sm-2">
 						  		<button type="button" class="btn btn-primary btn-sm" id="buscar"  onclick="consultarCreditos2()"><span class="glyphicon glyphicon-search"></span> Buscar</button>
 						  	</div>
						</div>
						<hr>
						<!-- aqui se agregará el check -->
						<!-- aqui se agregara el formato de solicitud -->
						<div id="contenido" class="col-sm-12">   </div>
						<hr>
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
							<span class="arial  azul negrita tam10"><?php echo $_SESSION['nombre']; ?> </span>

						</div>
					</div>
					<hr>
 					<ul>
 						<li><strong><a href="consultas2.php">MENU</a></strong></li>
						<li class=""><a href="consultas2.php">CONSULTAS</a></li>
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
		<script src="js/consultas.js"></script>
		<!-- DATE TIMEPICKER -->
		<script type="text/javascript" src="../bootstrap/datetimepicker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../bootstrap/datetimepicker/js/locales/bootstrap-datetimepicker.es.js" charset="UTF-8"></script>

	</body>
</html>
