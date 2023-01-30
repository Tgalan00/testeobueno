fun main () {

    var hangman = Hangman (0, listOf(), arrayListOf())
    hangman.presentacio()
    hangman= hangman.proceed(hangman.proceed2(),hangman.difficulty())
    hangman.bucle()
}

