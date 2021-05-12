package tech.arnav.conduit.data

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.EnableTransactionManagement
import tech.arnav.conduit.data.repositories.UserRepository
import javax.persistence.EntityManager

@Component
@EnableAutoConfiguration
@EnableJpaRepositories("tech.arnav.conduit.data.repositories")
class DataApplication {
    @Autowired lateinit var userRepository: UserRepository
}

fun main(args: Array<String>) {
    runApplication<DataApplication>(*args)
}
