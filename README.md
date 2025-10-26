# TiendaVidejuegos_XML_MVC
<h1>Proyecto TiendaVideojuegos</h1>

<p>
El proyecto <strong>TiendaVideojuegos</strong> es una aplicación de escritorio desarrollada en <strong>Java</strong> que permite gestionar el inventario de una tienda de videojuegos. 
Su propósito es facilitar el registro, consulta y modificación de los productos disponibles, como videojuegos y periféricos.
</p>

<h2>Descripción de las clases principales</h2>

<p>
En la capa del <strong>modelo</strong> se encuentran las clases que representan los datos y la lógica principal del sistema. 
La clase <code>Videojuego</code> define los atributos básicos de un videojuego, como título, plataforma, precio y cantidad en stock. 
De forma similar, <code>Periferico</code> representa los dispositivos complementarios, como mandos o teclados, con sus características y precios.
</p>

<p>
La clase <code>Tienda</code> actúa como un contenedor general, ya que almacena las listas de todos los videojuegos y periféricos de la tienda. 
Sobre esta base, <code>TiendaModelo</code> se encarga de gestionar los datos: leer y guardar la información en el archivo <code>Tienda.xml</code>, 
así como realizar las operaciones principales, como agregar, eliminar o buscar productos en el inventario.
</p>

<p>
La capa de la <strong>vista</strong> está representada por la clase <code>TiendaVista</code>. 
Su función es presentar los datos al usuario y notificar al controlador cuando se realiza alguna acción, como añadir o eliminar un artículo.
</p>

<p>
En la capa del <strong>controlador</strong> se encuentra la clase <code>TiendaControlador</code>, que actúa como enlace entre la vista y el modelo. 
El controlador escucha las acciones que se producen en la interfaz y solicita al modelo que realice los cambios correspondientes. 
Una vez modificados los datos, el controlador actualiza la vista para reflejar la información más reciente.
</p>

<p>
Por último, la clase <code>Main</code> es el punto de entrada de la aplicación. 
Su responsabilidad es inicializar las tres partes del sistema (modelo, vista y controlador), conectarlas entre sí y poner en marcha la aplicación.
</p>

<h2>Interacción entre las clases</h2>

<p>
Cuando el usuario realiza una acción desde la interfaz —por ejemplo, agregar un videojuego—, la vista notifica al controlador. 
Este recibe la información y la envía al modelo, que se encarga de procesarla y actualizar los datos almacenados. 
Finalmente, el controlador solicita a la vista que muestre los cambios reflejados en pantalla.
</p>


