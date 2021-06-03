package br.com.zup.carros

import io.micronaut.core.annotation.Introspected
import javax.persistence.*

import javax.validation.constraints.NotBlank

@Entity
class Carro(
    @field:NotBlank @Column(nullable = false) val modelo: String?,
    @field:NotBlank @field:Placa @Column(nullable = false, unique = true) val placa: String?
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}