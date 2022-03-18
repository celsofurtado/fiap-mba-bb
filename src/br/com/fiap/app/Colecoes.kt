package br.com.fiap.app

fun main() {

    // Criação de Array
    val carros = arrayOf("Gol", "Monza", "Brasilia", "Variante", "Gol")
    val notas = arrayOf<Double>(5.9, 8.0, 7.8)
    val hibrida = arrayOf(65, 8.8, "Maria", true)

    carros[1] = "Monza SL"

    println(hibrida[2])

    val tamanho = carros.size

    if (carros.isEmpty()) println("Vazio") else println("Cheio")

    // Operador Elvis ?:
    // Double bang !!

    var x: Int? = null
    x = 10

    val y = x ?: 5

    println(y)

    println(tamanho)
    println(carros[2])

    val frutas = listOf("Ameixa", "Melancia", "Maçã")
    val frutas2 = arrayOf("Ameixa", "Melancia", "Maçã")

    val encontrou = frutas.contains("Ameixa")

    for (fruta in frutas) {
        println(fruta)
    }

    for (fruta in frutas2) {
        println(fruta)
    }

    val teste: List<String> = ArrayList<String>()

    val filmes = ArrayList<String>()
    filmes.add("Homem Aranha")
    filmes.add("Batman 1")
    filmes.add("Batman 2")
    filmes.add("Batman 3")
    filmes.add("Batman 4")

    filmes[1] = "Rocky 4"

    for (filme in filmes) {

    }

    val alunos = HashSet<String>()

    alunos.add("Maria")
    alunos.add("Pedro")
    alunos.add("Maria")
    alunos.add("Antonio")

    

    println(alunos.size)

    for (aluno in alunos) {
        println(aluno)
    }




}