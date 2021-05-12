package tech.arnav.conduit.data.entities

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long = 0

    @CreationTimestamp
    val createdAt: Date = Date()

    @UpdateTimestamp
    val updatedAt: Date = Date()


}