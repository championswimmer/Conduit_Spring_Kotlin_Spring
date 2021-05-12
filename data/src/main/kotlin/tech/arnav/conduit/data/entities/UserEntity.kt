package tech.arnav.conduit.data.entities

import tech.arnav.conduit.domain.entities.User
import javax.persistence.Entity

@Entity
class UserEntity : BaseEntity(), User {
    override var username: String = ""
    override var email: String = ""
    override var password: String = ""
    override var image: String? = null
    override var bio: String? = null
}