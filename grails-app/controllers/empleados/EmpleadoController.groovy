package empleados

class EmpleadoController {

    def index() { 
    	//obtener dato recibido
    	// def id = Empleado.get(params.id) // obtenenr de la tabla empleado
    	// render(view: "/shared/display", model: map) //acceder a vistas compartidas 
    	
        render(view:"index");

        
        /*
        //REDIRECCIONAR A OTRO METODO O CONTROLADOR
        if(id == "0"){
    		redirect(action: 'mostrar', params:[apellido:"dos"])
            flash.nombre="UNO" //enviar datos, desaparece al complrtarse el request
    		// redirect(controller: 'Otro', action: 'index', datos:params) //redireccionar a otro controlador
    	}
        //ENVIAR A LA VISTA DEL CONTROLADOR
    	else if(id == "1"){
    		//renderiza a la vista con nombre del metodo(index) ya que no se especifica
    		[nombre:"Santiago", apellido:"Leal"]
    	}
        //ENVIAR A UNA VISTA ESPECIFICA
    	else if(id == "2"){
    		def datos = [nombre: "Jose", apellido:"Garcia"]
    		render(view:"mostrar", model:datos)
    	}
//      REDICCIONAR A OTRO METODO
        else{
    		// flash.message = "No se encontro el id ${id}"
    		redirect(action:'mostrar')
    	}*/
    }

    def mostrar(){
    	//renderizar a vista mostrar por default
    	render "Dato no Valido ${params.apellido}"  //solo muestra esto, no envia a ninguna vista
        // render (view:'mostrar')
    }
}
