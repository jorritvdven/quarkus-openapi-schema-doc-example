package com.jdriven.blog.model

import org.eclipse.microprofile.openapi.annotations.media.Schema
import org.eclipse.microprofile.openapi.annotations.media.SchemaProperty

@Schema(
    name = "Blog post author",
    properties = [
        SchemaProperty(
            name = "fullName",
            title = "Full name of the author."
        ),
        SchemaProperty(
            name = "photo",
            title = "A picture of the author.",
            format = "URL",
            example = "https://example.com/picture.jpg",
        ),
    ]
)
data class Author(
    val fullName: String,
    val photo: String,
)
