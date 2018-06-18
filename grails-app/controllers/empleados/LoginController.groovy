package empleados

import java.util.zip.ZipOutputStream
import java.util.zip.ZipEntry
import java.nio.channels.FileChannel
class LoginController {

    def index() {

    	//obtener dato recibido
    	// def id = Empleado.get(params.id) // obtenenr de la tabla empleado
    	def usuario = params.user
    	def pass = params.pass

      //comprimir
      String zipFileName = "C:/Users/DireccionTI/Documents/ProyectosGrails/empleados/grails-app/controllers/empleados/file.zip"
      String inputDir = "C:/Users/DireccionTI/Documents/ProyectosGrails/empleados/grails-app/controllers/empleados/archivos"
      ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream(zipFileName))
      new File(inputDir).eachFile() { file ->
        zipFile.putNextEntry(new ZipEntry(file.getName()))
        def buffer = file.getBytes()
        file.withInputStream { i ->
          def l = i.read(buffer)
          // check wether the file is empty
          if (l > 0) {
            zipFile.write(buffer, 0, l)
          }
        }
        zipFile.closeEntry()
      }
      zipFile.close()

      //decargar
      def file = new File(zipFileName)
      if (file.exists()){
           response.setContentType("application/octet-stream") // descarga cualquier tipo de archivo
           response.setHeader("Content-disposition", "attachment;filename=${file.name}")
           response.outputStream << file.bytes
       }
       else render "Error al descargar!"

    	// if(usuario == "santiago" && pass == "123"){
    	// 	render(view: "index", model:[nombre:"Santiago", apellido:"Leal"]) //acceder a vistas compartidas
    	// }else{
    	// 	render "Datos erroneos"
    	// }

    }

    def acceder() {
    	//obtener dato recibido
    	// def id = Empleado.get(params.id) // obtenenr de la tabla empleado
    	// render(view: "/shared/display", model: map) //acceder a vistas compartidas
    	println("asa")
        render(view:"index")
    }
}
