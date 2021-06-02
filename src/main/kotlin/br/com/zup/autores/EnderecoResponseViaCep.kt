package br.com.zup.autores

import io.micronaut.core.annotation.Introspected
import io.micronaut.http.HttpResponse

@Introspected
data class EnderecoResponseViaCep(
    val logradouro: String,
    val localidade: String,
    val uf: String
) {

    fun paraEndereco(): EnderecoResponse {
        return EnderecoResponse(logradouro, localidade, uf)
    }
}

