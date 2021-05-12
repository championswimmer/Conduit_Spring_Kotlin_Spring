package tech.arnav.conduit.domain.entities

import java.util.*

interface User {
    var username: String
    var email: String
    var password: String
    var image: String?
    var bio: String?
}

interface Article {
    var title: String
    var description: String
    var body: String
    var createdAt: Date
    var updatedAt: Date
    var author: User
    var tags: Array<Tag>
}

interface Comment {
    var body: String
    var author: User
}

interface Tag {
    var name: String
}

