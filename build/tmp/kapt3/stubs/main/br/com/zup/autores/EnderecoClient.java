package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/autores/EnderecoClient;", "", "consulta", "Lbr/com/zup/autores/EnderecoResponseViaCep;", "cep", "", "nossa-casa-do-codigo"})
@io.micronaut.http.client.annotation.Client(value = "https://viacep.com.br/ws")
public abstract interface EnderecoClient {
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/{cep}/json/")
    public abstract br.com.zup.autores.EnderecoResponseViaCep consulta(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String cep);
}