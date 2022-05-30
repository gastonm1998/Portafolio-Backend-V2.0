# Portafolio web v2.0 backend
- https://portafolio-gaston-monasterio.herokuapp.com/

#### Objetivo del programa:
- El programa tiene por objetivo poder realizar todas las operaciones CRUD e implementar el JWT para darle nuevas funciones al frontend el mismo está realizado en el framework Springboot que usa java 11 como lenguaje principal, Maven como gestor de proyectos, hibernate y Está conectado a una base de datos SQL

#### Funcionamiento del programa
- Para empezar a ver el funcionamiento de backend lo primero que se tiene que hacer es ingresar al modo editor del programa con el usuario y la contraseña.

[![f1](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f1.png "f1")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f1.png "f1")

- El backend se encargará de ver si el formulario es valido la contraseña para el modo editor se encuentra encriptada

[![f2](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f2.png "f2")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f2.png "f2")

- Si el usuario y la contraseña son correctos el JWT generara un token que al ser leído por el frontend permite el ingreso al modo editor

[![f3](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f3.png "f3")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f3.png "f3")

- Una vez ingresado al modo editor el frontend mostrara los botones con las funciones de agregar, editar y eliminar.

- [![f4](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f4.png "f4")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f4.png "f4")

- Se usará como ejemplo del funcionamiento del backend la sección de educación. 

### Funciones CRUD

#### Función agregar
- Primero veremos como esta compuesta la base de datos que compone los ítems de educación.

[![f5](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f5.png "f5")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f5.png "f5")


- Procederemos a agregar un nuevo ítem y al darle al botón de agregar podremos ver en nuestra base como se agregó la nueva información ingresada.

[![f6](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f6.png "f6")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f6.png "f6")

[![f7](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f7.png "f7")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f7.png "f7")

- Y como podemos observar el frontend procesa la nueva información de lavase de datos y agrega el nuevo ítem

[![](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f8.png)](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f8.png)

#### Función editar

- Para la función editar usaremos nuestro ítem de ejemplo. Hacemos clic en el botón editar y veremos una pantalla similar a la de agregar un nuevo ítem
La misma nos trae los datos de la base de datos para editar. Seleccionamos el ítem que queremos modificar y procedemos a la edición 

[![f9](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f9.png "f9")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f9.png "f9")

- Ahora podemos ver e la base de datos como la información cambio.

[![](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f10.png)](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f10.png)

- Y el frotend ya tomo la información editada.

[![f11](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f11.png "f11")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f11.png "f11")

#### Función eliminar.

- Para la función eliminar usaremos el ítem de ejemplo. Cada ítem siempre tendrá un botón de eliminar debido a que es una función que elimina datos tendremos un paso previo a la eliminación para asegurarnos de que esta seguro de que desea eliminar 

[![](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f12.png)](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f12.png)

- Si confirmamos la eliminación el ítem seleccionado desaparecerá de la base de datos.

[![f13](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f13.png "f13")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f13.png "f13")

- Y el frontend cargara nuevamente los datos con los ítems restantes

[![](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f14.png)](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f14.png)

###Cerrar sesión 

- Una vez finalizado todos los cambios que el usuario haya realizado se procederá a salir del modo editor con el botón de cerrar sesión.

[![](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f15.png)](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/f15.png)

- Una vez finalizada la sesión quedaran todos los cambios que el usuario haya realizado 

### Composición del programa

### Base de datos:

- Se uso para el programa una base de datos SQL desplegada en clever cloud y para su administración se usó MySQL y en el archivo application Properties de Springboot se realizó la configuración de la base de datos.

[![db](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/db1.png "db")](https://raw.githubusercontent.com/gastonm1998/Portafolio-v2.0-backend-springboot/despliegue/src/main/java/com/backend/portafoliobackend/assets/db1.png "db")

#### Models 

- Los models contienen la forma en como los datos serán almacenados en la base de datos

####Repository

- El repository en una interface que heredará las clases de CRUDrepository y nos dará las funciones de leer editar agregar y eliminar

####Service

- En service haremos una inyección de dependencia del repository e implementaremos los métodos que necesitemos

#### Controller

- En controller configuraremos la dirección a la cual le haremos la petición del crud y se configurara el cross origin para no tener problemas con CORS 

#### JWT

- En este programa el JWT (JSON Web Token) tiene la finalidad de crear un usuario, encriptar la contraseña, generar los tokens al momento de iniciar la sesión, no se usaron las funciones de roles ya que el programa esta pensado para ser usado por solo una persona  
