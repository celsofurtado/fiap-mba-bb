package br.com.fiap.app

import br.com.fiap.model.Paciente
import br.com.fiap.model.Usuario

fun main() {

    val paciente1 = Paciente()
    paciente1.nome = "Pedro"
    paciente1.email = "pedro@terra.com.br"
    paciente1.nome = "Ana"

    val usuario = Usuario()
    usuario.nome = null!! // double bang

    println(usuario.nome)

    var kotlin = "FIAP"

    kotlin = "Banco do Brasil"
    println(kotlin)

    var peso: Int? = null
    peso = 58
    val expectativaPerdaPeso = 3
    val nome = "Fabiana"

    println("O nome da faculdade é: $kotlin")
    println("O peso da ${nome.uppercase()} é $peso kg")
    println("O seu peso será ${peso - expectativaPerdaPeso}")

    val base = 2.0
    val expoente = 3.0

    val resultado = Math.pow(base, expoente)

    println(resultado)

}