package br.com.fiap.model

import kotlin.math.pow

class Usuario {

    var nome: String? = ""
    var peso = 0
    var altura = 0.0

    fun calcularImc() = peso / altura.pow(2)


    fun exibirNome() {
        println(nome)
    }

}