package br.com.zup.carros

import io.micronaut.test.annotation.TransactionMode
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest(
    rollback = false,
    transactionMode = TransactionMode.SINGLE_TRANSACTION,
    transactional = false

)
class CarroTest {

    @Inject
    lateinit var repository: CarroRepository

    @BeforeEach
    fun setup() {
        repository.deleteAll()
    }

    @AfterEach
    fun cleanUp() {
        repository.deleteAll()
    }

    @Test
    fun `deve inserir um novo carro`() {
        // ação
        repository.save(Carro("Gol", "HPX1234"))


        // validação
        assertEquals(1, repository.count())
    }


    @Test
    fun `deve encontrar carro por placa`() {
        // cenário
        repository.save(Carro("Pálio", "OIP9876"))

        // ação
        val encontrado = repository.existsByPlaca("OIP9876")

        // validação
        assertTrue(encontrado)
    }
}