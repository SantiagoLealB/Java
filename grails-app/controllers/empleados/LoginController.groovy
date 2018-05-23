package empleados

class LoginController {

    def index() { 
    	//obtener dato recibido
    	// def id = Empleado.get(params.id) // obtenenr de la tabla empleado
    	def usuario = params.user
    	def pass = params.pass
    	if(usuario == "santiago" && pass == "123"){
    		render(view: "index", model:[nombre:"Santiago", apellido:"Leal"]) //acceder a vistas compartidas 
    	}else{
    		render "Datos erroneos"
    	}
    	
    }

    def acceder() { 
    	//obtener dato recibido
    	// def id = Empleado.get(params.id) // obtenenr de la tabla empleado
    	// render(view: "/shared/display", model: map) //acceder a vistas compartidas 
    	println("asa")
        render(view:"index")
    }
}
