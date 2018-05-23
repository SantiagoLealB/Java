package empleados

class Usuarios {
	// static mapping = {
 //      datasource 'use'
 //   }

	int dao
	String login
	String pass
	String nombre
	int idSucursal
	String correo
	String puesto
	Date fechaIngreso
	

    static constraints = {
  		dao(bank:false, size:8)
  		login(bank:false, size:6..10)
  		pass(bank:false, size:6..8)
  		idSucursal(bank:false, size:4..6)
  		correo(email:true)
  		puesto(bank:false)
  		fechaIngreso(bank:false)
    }
}
