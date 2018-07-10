class Radio(    var encendido: Boolean = false,
                var volumen: Int = 0,
                var estacion: Double = 0.0,
                var sintonia: String = "Fm") {
<<<<<<< HEAD
    fun menu():String{
        return """
            ¿Que opcion desea?
            Ingrese el numero de la opcion que quiere(1-6)
            1.Cambiar de sintonia
            2.Subir volumen
            3.Bajar volumen
            4.Cambiar FM/AM
            5.Encender o apagar la radio
            6.Exit
            """.trimIndent()
    }
    fun encenderApagar(){
        if(encendido == false){
            println("Acaba de encender la radio")
            encendido = true
        }else{
            println("Acaba de apagar la radio")
            encendido = false
        }

    }
=======
>>>>>>> b63939dc631f07890789b2464942a34015eecd22
    fun subirVolumen(int: Int){
        volumen =+ int
        if( volumen > 100){
            volumen = 100
        }

    }
    fun bajarVolumen(int: Int){
        volumen =- int
        if(volumen < 0){
            volumen = 0
        }
    }
    fun cambiarEstacion(d: Double){
        estacion = d
    }

    fun cambiarSintonia(){ if (sintonia.equals("Fm")){
        sintonia = "Am"
    }else{
        sintonia = "Fm"
    }}
<<<<<<< HEAD

=======
    fun encenderApagar(){
        if(encendido == false){
            println("Acaba de encender la radio")
            encendido = true
        }else{
            println("Acaba de apagar la radio")
            encendido = false
        }

    }
>>>>>>> b63939dc631f07890789b2464942a34015eecd22

    override fun toString(): String {
        return """
            Estado actual de la radio:
                Estacion: $estacion
                Fm/Am: $sintonia
                Volumen: $volumen
                Encendido/Apagado: $encendido
        """.trimIndent()
    }

<<<<<<< HEAD

=======
    fun menu():String{
        return """
            ¿Que opcion desea?
            Ingrese el numero de la opcion que quiere(1-6)
            1.Cambiar de sintonia
            2.Subir volumen
            3.Bajar volumen
            4.Cambiar FM/AM
            5.Encender o apagar la radio
            6.Exit
            """.trimIndent()
    }
>>>>>>> b63939dc631f07890789b2464942a34015eecd22
}
