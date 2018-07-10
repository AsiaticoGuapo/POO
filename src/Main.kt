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


