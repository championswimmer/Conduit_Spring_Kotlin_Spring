package tech.arnav.conduit.data.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tech.arnav.conduit.data.entities.UserEntity

@Repository
interface UserRepository : JpaRepository<UserEntity, Long> {

}