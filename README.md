Proyecto de Conversión de Monedas


Descripción

Este programa Java está diseñado para convertir montos de una moneda a otra utilizando la API de ExchangeRate-API. Utiliza las bibliotecas json-simple y gson para manejar la respuesta de la API y realizar las conversiones de manera eficiente.
Funcionalidades

    Conversión de Monedas: Convierte un monto dado de una moneda de origen a una moneda de destino utilizando los tipos de cambio actuales de la API.
    Interfaz de Usuario: Aunque inicialmente se desarrolló sin interfaz gráfica (GUI), el programa ofrece funcionalidades a través de la línea de comandos.

Requisitos

    Java JDK 8 o superior
    IntelliJ IDEA (o cualquier otro entorno de desarrollo compatible con Java)
    Bibliotecas json-simple-1.1.1 y gson-2.11.0 (automáticamente manejadas por IntelliJ a través del archivo pom.xml o build.gradle)

Configuración

    Clonación del Repositorio: Clone este repositorio en su máquina local utilizando el siguiente comando:

    bash

    git clone https://github.com/shomes333/RateExchange.git

    Importar Proyecto en IntelliJ IDEA:
        Abra IntelliJ IDEA.
        Seleccione File -> Open y navegue hasta el directorio del repositorio clonado.
        IntelliJ debería detectar automáticamente el archivo de configuración del proyecto y cargarlo.

    Configuración de las Bibliotecas:
        Las bibliotecas json-simple-1.1.1 y gson-2.11.0, debes descargarlas y añadirlas

Para importar la biblioteca Gson en IntelliJ, sigue estos pasos:

    Abre tu proyecto en IntelliJ.
    Haz clic derecho sobre la carpeta del proyecto en el panel izquierdo.
    Selecciona "Open Module Settings" en el menú contextual.
    En la ventana que se abre, ve a la pestaña "Dependencies".
    Haz clic en el signo "+" en la esquina inferior izquierda y elige "Library".
    Busca "gson" en el cuadro de búsqueda.
    Selecciona la versión de Gson que desees utilizar.
    Haz clic en "OK" para cerrar la ventana.
    Ahora lo mismo, pero con json-simple-1.1.1.


    Configuración de la API de ExchangeRate-API:
        Obtén una clave de API gratuita en ExchangeRate-API.
        Reemplaza la variable API_KEY en el código con tu clave de API para poder realizar las consultas a la API de manera efectiva.

Uso

    Ejecución del Programa:
        Desde IntelliJ IDEA, ejecuta la clase principal Main.java.
        Sigue las instrucciones en la consola para ingresar la moneda de origen, la moneda de destino y el monto que deseas convertir.

    Ejemplo de Uso:

    Elige una opción del 1 al 6,
    Ingrese el monto que deseas convertir, y listo. Tienes tu moneda convertida al valor actual del mercado, en el futuro puede que agregue más funcionalidades.
    Con la opción 7 puedes salir.

Contribución

    Si deseas contribuir a este proyecto, por favor crea un "pull request" en GitHub.
    Si encuentras algún problema o tienes sugerencias, por favor abre un "issue" en el repositorio.

Créditos

    Este proyecto utiliza las bibliotecas json-simple y gson para manejar datos en formato JSON.
    Utiliza la API de ExchangeRate-API para obtener los tipos de cambio actuales.
    Gracias Alura por la oportunidad de este gran aprendizaje.
