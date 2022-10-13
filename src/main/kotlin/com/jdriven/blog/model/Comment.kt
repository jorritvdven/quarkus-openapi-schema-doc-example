package com.jdriven.blog.model

import org.eclipse.microprofile.openapi.annotations.media.Schema
import org.eclipse.microprofile.openapi.annotations.media.SchemaProperty

@Schema(
    name = "Blog post comment",
    properties = [
        SchemaProperty(
            name = "name",
            title = "Full name of the author.",
        ),
        SchemaProperty(
            name = "comment",
            title = "The comment",
            format = "HTML",
        ),
    ]
)
data class Comment(
    val name: String,
    val comment: String
)
