# Casa do código

## Tecnologias:

* Koltin
* Micronaut
* Gradle



## Configurando No-args

Não foi necessário configurar o plugin no-arg para que a aplicação funcionasse

## Configurando plugin All-open

Para usar a anotação *@Transaction* sem ter que declarar a classe e métodos do *Controller* como *open*, pode-se utilizar o plugin All-open.

O código abaixo deve ser inserido no arquivo build.gradle.kts

```groovy
dependencies {
    annotationProcessor("io.micronaut","micronaut-inject-java","1.5.0")
    compile ("io.micronaut","micronaut-aop", "1.5.0")
}

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin","kotlin-allopen", "1.5.10")
    }
}

apply { plugin("kotlin-allopen") }

allOpen {
    annotation("io.micronaut.http.annotation.Controller")
}
```

