package empleados

class BootStrap {
    //lo que hace ala iniciar la app
    def init = { servletContext ->

      // User user = new User(username: 'santiago', password: '123456').save() //crear un usuario
      // Role role = new Role(authority: 'ROLE_ADMIN').save()  //crear un rol
      // UserRole.create(user, role)  //relacionar usuario rol
    }

    //al finalizar la app
    def destroy = {
    }
}
