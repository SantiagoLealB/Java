package empleados

// import nine.reports.ReportFormat
import nine.jasper.JasperService
import nine.jasper.spring.JasperReportDef
import nine.reports.ReportFormat


class ReportesController {

    List<Map> dataList = [
            [city:"Berne", id:22, name:"Bill Ott", street:"250 - 20th Ave.", country:[name:"US"]],
            [city:"Chicago", id:1, name:"Joshua Burnett", street:"22 3rd", country:[name:"US"]],
            [city:"Chicago", id:1, name:"Joshua Burnett", street:"22 3rd", country:[name:"US"]]
    ]

    def index() {
        // render(view:"demo.jrxml",model:[data:dataList, "ReportTitle":"Controller Report"])
   		reporte("demo.jrxml")
    }

    def accept() {
        String format = response.format
        render format
    }

    def acceptFormat() {
        Map rptModel = [data:dataList, "ReportTitle":"Controller Report"]
        //render "hello"
        render(view:"demo.jrxml",model:rptModel)
    }

    def reporte(String vista) {
        String format = ReportFormat.get(response.format)?:ReportFormat.PDF
        Map rptModel = [format:format, data:dataList, "ReportTitle":"REPORTE SEMANAL LM"]
        //render "hello"
        render(view:vista,model:rptModel)
    }


   // def generate(String name) {
   //      JasperService jasperService
   
   //      List reportData = [] //prepare list of maps which will be feed to jasper report as data.
            
   //      JasperReportDef opts = new JasperReportDef(
   //              name: name, //the name of jrxml or compiled .jasper file
   //              fileFormat: ReportFormat.PDF,
   //              parameters: [param1:'1', param2:'2'], //pass whatever parameter needed.
   //              reportData: reportData
   //      )
   
   // 	    ByteArrayOutputStream out = jasperService.generateReport(opts)
   // 		//do some thing with ByteArrayOutputStream, write to file or stream to browser etc.
   // }

}



// seguridad intranet, fusion de servidores 246  viernes
// solicitud tasa interes
// ventas t24  nc web

