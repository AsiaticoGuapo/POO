fun main(args: Array<String>){
    var c:String?
    val radio = Radio()
    var isOn = true

    println("Bienvenid@s a RadioAsia")

    do{
        println(radio.toString())
        println()
        println(radio.menu())
        c = readLine()!!


        when(c){
            1.toString()-> {

                if(!radio.encendido){
                    println("Para poder usar la radio debe encenderla primero.")
                }else {
                    var rr: Double
                    println("La estacion actual es:  ${radio.sintonia}\nLas frecuencias que alcanza la radio van de 87 a 104")
                    println("Ingrese la nueva estacion:")
                    println("Primero ingrese el numero entero y luego el decimal EG para 90.1(Primero 90 y luego 1):")

                    do {
                        var tont = false
                        println("Emisora = ")
                        var sl: String? = readLine()!!
                        while(sl!!.toInt() > 200||sl!!.toInt()<87){
                            println("Ingreso un numero invalido, intentelo de nuevo (87 - 104)")
                            sl = readLine()!!
                        }

                        println("Para el decimal ingrese: 0 a 9\nDecimal = ")
                        var D: String? = readLine()!!
                        while (D!!.toInt()>9  || D!!.toInt()<0){
                            println("Ingreso un numero invalido, intentelo de nuevo (0 - 9)")
                            D = readLine()!!
                        }
                        try {
                            rr = sl!!.toDouble()  + (D!!.toDouble() * 0.1)
                            radio.cambiarEstacion(rr)
                            println("Se cambio de estacion!")
                            tont = true
                        }catch(e: Exception){1
                            println("ERROR, Prueba de nuevo.")
                        }
                    }while(!tont)

                }

            }
            2.toString()->{
                if(!radio.encendido){
                    println("Por favor encienda la radio antes de usarla.")
                }else {
                    println("El volumen actual es ${radio.volumen}\nIngrese cuanto desea subir el volumen(MAX 100): ")
                    do {
                        var subvol = readLine()!!
                        var tres = false
                        try {
                            subvol.toInt()
                            println("Volumen cambiado exitosamente.")
                            radio.subirVolumen(subvol.toInt())
                            tres = true
                        } catch (e: Exception) {
                            println("Necesitas ingresar un numero, intentalo de nuevo: ")
                        }
                    } while (!tres)
                }
            }
            3.toString()->{
                if(!radio.encendido){
                    println("Por favor encienda la radio antes de usarla.")
                }else {
                    println("El volumen actual es ${radio.volumen}\nIngrese cuanto desea bajar el volumen(MIN 0): ")
                    do {
                        var bajvol = readLine()!!
                        var tres = false
                        try {
                            bajvol.toInt()
                            println("Volumen cambiado exitosamente.")
                            radio.bajarVolumen(bajvol.toInt())
                            tres = true
                        } catch (e: Exception) {
                            println("Necesitas ingresar un numero, intentalo de nuevo: ")
                        }
                    } while (!tres)
                }
            }
            4.toString()->{
                if(!radio.encendido){
                    println("Por favor encienda la radio antes de usarla.")
                }else {
                    radio.cambiarSintonia()
                    println("Cambiado exitosamente a ${radio.sintonia}")
                }
            }
            5.toString()->{
                radio.encenderApagar()
            }
            6.toString()->{
                println("Gracias por utilizar el programa\nAdios.")
                isOn = false
            }
            else->{
                println("Debe ingresar un numero del 1 al 6.\nIntentelo de nuevo: ")
            }
        }
    }while(isOn)
}