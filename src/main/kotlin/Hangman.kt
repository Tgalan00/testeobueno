
class Hangman(var vidas: Int, val paraulaOriginal: List<Char>, var paraulaAdivinar: ArrayList<Char>) {

    var picture= Picture()
    fun createWord() {
        for (i in 0 .. paraulaOriginal.size -1) {
            paraulaAdivinar.add('-')
        }
        println("La palabra contiene ${paraulaAdivinar.size} letras: $paraulaAdivinar")
    }

    fun showVidas() {

        println("\nVidas: $vidas")
    }

    fun presentacio()  {

        println("██████╗ ██╗███████╗███╗   ██╗██╗   ██╗███████╗███╗   ██╗██╗██████╗  ██████╗ \n" +
                "██╔══██╗██║██╔════╝████╗  ██║██║   ██║██╔════╝████╗  ██║██║██╔══██╗██╔═══██╗\n" +
                "██████╔╝██║█████╗  ██╔██╗ ██║██║   ██║█████╗  ██╔██╗ ██║██║██║  ██║██║   ██║\n" +
                "██╔══██╗██║██╔══╝  ██║╚██╗██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║██║  ██║██║   ██║\n" +
                "██████╔╝██║███████╗██║ ╚████║ ╚████╔╝ ███████╗██║ ╚████║██║██████╔╝╚██████╔╝\n" +
                "╚═════╝ ╚═╝╚══════╝╚═╝  ╚═══╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═╝╚═════╝  ╚═════╝ \n" +
                "                                                                            \n" +
                "\n" +
                "\n")

        println(" █████╗ ██╗              ██╗██╗   ██╗███████╗ ██████╗  ██████╗     ██████╗ ███████╗██╗          █████╗ ██╗  ██╗ ██████╗ ██████╗  ██████╗ █████╗ ██████╗  ██████╗ \n" +
                "██╔══██╗██║              ██║██║   ██║██╔════╝██╔════╝ ██╔═══██╗    ██╔══██╗██╔════╝██║         ██╔══██╗██║  ██║██╔═══██╗██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔═══██╗\n" +
                "███████║██║              ██║██║   ██║█████╗  ██║  ███╗██║   ██║    ██║  ██║█████╗  ██║         ███████║███████║██║   ██║██████╔╝██║     ███████║██║  ██║██║   ██║\n" +
                "██╔══██║██║         ██   ██║██║   ██║██╔══╝  ██║   ██║██║   ██║    ██║  ██║██╔══╝  ██║         ██╔══██║██╔══██║██║   ██║██╔══██╗██║     ██╔══██║██║  ██║██║   ██║\n" +
                "██║  ██║███████╗    ╚█████╔╝╚██████╔╝███████╗╚██████╔╝╚██████╔╝    ██████╔╝███████╗███████╗    ██║  ██║██║  ██║╚██████╔╝██║  ██║╚██████╗██║  ██║██████╔╝╚██████╔╝\n" +
                "╚═╝  ╚═╝╚══════╝     ╚════╝  ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝     ╚═════╝ ╚══════╝╚══════╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ")
        println("\nComo te llamas? ")
        print("Introduce tu nombre: ")
        val name = readln().toString()
        println("Encantado $name, vas a jugar al juego del ahorcado, intenta adivinar la palabra, estas listo?")
    }

    fun proceed2(): Int {

        print("Quieres adivinar la palabra creada por default o prefieres adivinar una creada por uno de tus compañeros? (1-Default, 2-Compañero): ")
        var wordefaultOrFriend = readln().toInt()

        while (wordefaultOrFriend != 1 && wordefaultOrFriend != 2) {
            println("Lo siento pero debes introducir 1 o 2")

            print("Quieres adivinar la palabra creada por default o prefieres adivinar una creada por uno de tus compañeros? (1-Default, 2-Compañero): ")
            wordefaultOrFriend = readln().toInt()
        }
        println("De acuerdo! Nos lo apuntamos para cuando empecemos a jugar al juego!")

        return wordefaultOrFriend
    }

    fun difficulty (): Int {

        print("Por favor, escoge la dificultad (1-Facil, 2-Normal, 3-Dificil): ")
        var dif = readln().toInt()

        while (dif != 1 && dif != 2 && dif != 3) {

                println("Lo siento pero debes introducir 1, 2 o 3")

                print("Por favor, escoge la dificultad (1-Facil, 2-Normal, 3-Dificil): ")
                dif = readln().toInt()
        }

        if (dif == 1) {
            return 1

        } else if (dif == 2) {
            return 2

        } else  {
            return 3

        }
    }

    fun printProcedure () {

        println("Bien! Empecemos a jugar! Como hemos apuntado antes has decidido adivinar la palabra que esta por default, asi que vamos alla!")
    }

    fun proceed (wordefaultorfriend: Int, dif: Int): Hangman {

        val defaultlist = listOf<List<Char>>(listOf('c','l','a','s','e'),
            listOf('p','a','t','a','t','a'),
            listOf('c','i','e','l','o'),
            listOf('c','u','a','d','r','o'),
            listOf('o','c','e','a','n','o'),
            listOf('m','a','r','a','v','i','l','l','o','s','o'),
            listOf('e','j','e','r','c','i','c','i','o'),
            listOf('p','i','a','n','o'),
            listOf('a','p','r','o','v','a','d','o'),
            listOf('p','r','o','g','r','a','m','a','r'),
            listOf('k','o','t','l','i','n')
        )

        if (dif == 1 && wordefaultorfriend == 1) {

            printProcedure()
            return Hangman(6, defaultlist, arrayListOf())

        }else if (dif == 2 && wordefaultorfriend == 1) {
            printProcedure()
            return Hangman(5, defaultlist, arrayListOf())
        } else if (dif == 3 && wordefaultorfriend == 1) {
            printProcedure()
            return Hangman(4, defaultlist, arrayListOf())
        } else if (dif == 1 && wordefaultorfriend == 2) {
            printProcedure()
            return Hangman(6,palabraCompanero(), arrayListOf())
        }else if (dif == 2 && wordefaultorfriend == 2) {
            printProcedure()
            return Hangman(5,palabraCompanero(), arrayListOf())
        }else {
            printProcedure()
            return Hangman(4,palabraCompanero(), arrayListOf())
        }
    }
    fun palabraCompanero (): List<Char> {
        print("Introduce la palabra que adivinará tu compañero: ")
        val guessingMateWord = readln().toString()
        val guessingMateWordList = arrayListOf<Char>()
        for (i in guessingMateWord) {

            guessingMateWordList.add(i)
        }
        return  guessingMateWordList
    }
    fun insert() {
        var videsPerdudes = true
        print("Inserta una letra: ")
        val x = readln().single().lowercaseChar()
        for (i in 0..paraulaOriginal.size -1) {
            if (x == paraulaOriginal[i]) {

                videsPerdudes = false
                paraulaAdivinar[i] = x
            }
        }
        if (videsPerdudes) {

            println("Lastima! La letra que has introducido no forma parte de la palabra! ")

            restarVida()
        }
        print(paraulaAdivinar)
    }
    fun restarVida(){

        vidas -= 1
    }
    fun showPicture () {

        if (vidas == 6) {



        }
        if (vidas == 5) {


        }
        if (vidas == 4) {


        }
        if (vidas == 3) {


        }
        if (vidas == 2) {


        }
        if (vidas == 1) {


        }
        if (vidas == 0) {


        }
    }
    fun bucle () {
        createWord()
        while (vidas > 0 && paraulaOriginal != paraulaAdivinar) {
            insert()
            showVidas()
        }
        condicion()
    }
    fun replay () {
        print("Quieres volver a jugar? (1-Si, 2-No")
        var retry = readln().toInt()

        while (retry != 1 && retry != 2) {
            println("Lo siento pero debes introducir 1 o 2")

            print("Quieres volver a jugar? (1-Si, 2-No")
            retry = readln().toInt()
        }

        if (retry == 1) {
            println("De acuerdo! Vamos alla!")
            proceed2()
        }
        else if (retry == 2) {
            println("\n" +
                    "┏━┓┏━┓╋╋╋╋╋┏┓\n" +
                    "┃┃┗┛┃┃╋╋╋╋╋┃┃╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋┏┓\n" +
                    "┃┏┓┏┓┣┓┏┳━━┫┗━┳━━┳━━┓┏━━┳━┳━━┳━━┳┳━━┳━━┓┏━━┳━━┳━┓╋┗╋┓┏┳━━┳━━┳━┓\n" +
                    "┃┃┃┃┃┃┃┃┃┏━┫┏┓┃┏┓┃━━┫┃┏┓┃┏┫┏┓┃┏━╋┫┏┓┃━━┫┃┏┓┃┏┓┃┏┛╋┏┫┃┃┃┏┓┃┏┓┃┏┛\n" +
                    "┃┃┃┃┃┃┗┛┃┗━┫┃┃┃┏┓┣━━┃┃┗┛┃┃┃┏┓┃┗━┫┃┏┓┣━━┃┃┗┛┃┗┛┃┃╋╋┃┃┗┛┃┗┛┃┏┓┃┃\n" +
                    "┗┛┗┛┗┻━━┻━━┻┛┗┻┛┗┻━━┛┗━┓┣┛┗┛┗┻━━┻┻┛┗┻━━┛┃┏━┻━━┻┛╋╋┃┣━━┻━┓┣┛┗┻┛\n" +
                    "╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋┏━┛┃╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋┃┃╋╋╋╋╋╋╋┏┛┃╋╋┏━┛┃\n" +
                    "╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋┗━━┛╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋┗┛╋╋╋╋╋╋╋┗━┛╋╋┗━━┛")

            println("\n\n")

            println("\n" +
                    "┏━━━┓╋╋╋╋╋╋╋╋╋┏┓╋╋╋╋╋╋╋╋╋╋╋╋╋┏━━━━┓╋╋╋╋╋╋┏━━━┓╋╋┏┓\n" +
                    "┃┏━┓┃╋╋╋╋╋╋╋╋╋┃┃╋╋╋╋╋╋╋╋╋╋╋╋╋┃┏┓┏┓┃╋╋╋╋╋╋┃┏━┓┃╋╋┃┃\n" +
                    "┃┃╋┗╋━┳━━┳━━┳━┛┣━━┓┏━━┳━━┳━┳┓┗┛┃┃┣┻━┳━┓┏┓┃┃╋┗╋━━┫┃┏━━┳━┓\n" +
                    "┃┃╋┏┫┏┫┃━┫┏┓┃┏┓┃┏┓┃┃┏┓┃┏┓┃┏┻┛╋╋┃┃┃┏┓┃┏┓╋┫┃┃┏━┫┏┓┃┃┃┏┓┃┏┓┓\n" +
                    "┃┗━┛┃┃┃┃━┫┏┓┃┗┛┃┗┛┃┃┗┛┃┗┛┃┃┏┓╋╋┃┃┃┗┛┃┃┃┃┃┃┗┻━┃┏┓┃┗┫┏┓┃┃┃┃\n" +
                    "┗━━━┻┛┗━━┻┛┗┻━━┻━━┛┃┏━┻━━┻┛┗┛╋╋┗┛┗━━┻┛┗┻┛┗━━━┻┛┗┻━┻┛┗┻┛┗┛\n" +
                    "╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋┃┃\n" +
                    "╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋╋┗┛")

        }
    }
    fun condicion() {
        if (vidas > 0) {
            println("Felicidades!!! Has ganado!")
            println("                                                                                                    \n" +
                    "                                                                                                    \n" +
                    "                                              /,,,,,,//                                             \n" +
                    "                                              /,,,,,,,,//                                           \n" +
                    "                                             ./,,,,,,,,,/                                           \n" +
                    "                                             //,,,,,,,,*/                                           \n" +
                    "                                             /,,,,,,,,,/                                            \n" +
                    "                                           /*,,,,,,,,,/*                                            \n" +
                    "                                         //,,,,,,,,,,,/                                             \n" +
                    "                                      //,,,,,,,,,,,,,/////////////////,                             \n" +
                    "                                 ///,,,,,,,,,,,,,,,//*****,,,,,,,,,,,,,/                            \n" +
                    "                            /*,,,,,,,,,,,,,,,,,,,,,//*****,,,,,,,,,,,,*/                            \n" +
                    "                           /,,,,,,,,,,,,,,,,,,,,,,,,///////////////////.                            \n" +
                    "                           /,,,,,,,,,,,,,,,,,,,,,,,,//****,,,,,,,,,,,,,,,/                          \n" +
                    "                           /,,,,,,,,,,,,,,,,,,,,,,,//****,,,,,,,,,,,,,,,,/                          \n" +
                    "                           /,,,,,,,,,,,,,,,,,,,,,,//////***//////*,,,,,//                           \n" +
                    "                           /***,,,,,,,,,,,,,,,,////,//***,,,,,,,,,,,,,,//                           \n" +
                    "                           /******,,,,,,,,,,,,,,,,,//***,,,,,,,,,,,,,,,,/                           \n" +
                    "                           /****//*****,*,,,,,,,,,,,*///**,,,,,,,,,,,,//                            \n" +
                    "                            /***//******************/****,,,,,,,,,,,,//                             \n" +
                    "                                 *//****************/***,,,,,,,,,,,,,,/                             \n" +
                    "                                         ,////////////////////***,,*//                            ")

            replay()
        } else {
            println("Lo siento, has perdido, la palabra era $paraulaOriginal")
            println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@@@#///////#@@@@@@@@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@///**...............////@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@//*.........................///@@@@@@@@@\n" +
                    "@@@@@@@/*,...............................*//@@@@@@\n" +
                    "@@@@@//....................................,//@@@@\n" +
                    "@@@@//..........*&&%...........&&&,..........//@@@\n" +
                    "@@@//..........&&&&&&.........&&&&&&..........//@@\n" +
                    "@@//...........&&&&&&.........&&&&&%.........../*@\n" +
                    "@@//...........................................//@\n" +
                    "@@/*.........................................../*@\n" +
                    "@@//...............&&&&&&&&&&&&/...............//@\n" +
                    "@@//............&&&&&&(.....#&&&&&&............/*@\n" +
                    "@@@//,,,,,,,,,&&&,,,,,,,,,,,,,,,,,&&&,,,,,,,,,//@@\n" +
                    "@@@@//,,,,,,,&*,,,,,,,,,,,,,,,,,,,,,/&,,,,,,,//@@@\n" +
                    "@@@@@//*************************,***********/*@@@@\n" +
                    "@@@@@@@/************************************@@@@@@\n" +
                    "@@@@@@@@@@///*************************///@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@&//*/***************////@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@@@@(*///*(@@@@@@@@@@@@@@@@@@@@@")
            replay()
        }
    }
}