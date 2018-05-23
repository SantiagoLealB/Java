package empleados

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        //configurar vista por default
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
