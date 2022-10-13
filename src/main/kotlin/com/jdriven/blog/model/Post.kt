package com.jdriven.blog.model

import org.eclipse.microprofile.openapi.annotations.media.Schema
import java.time.LocalDate

@Schema(name = "Blog post response")
data class Post(
    @field:Schema(implementation = Author::class)
    val author: Author,

    @field:Schema(
        title = "One or more tags which describe the subject of the post.",
        minItems = 1,
    )
    val tags: List<String>,

    @field:Schema(
        title = "The publication date of this post.",
        format = "ISO8601 date",
        example = "2022-10-14",
    )
    val publishedOn: LocalDate,

    @field:Schema(title = "The title of this blogpost.")
    val title: String,

    @field:Schema(
        title = "The content of this blogpost",
        format = "HTML"
    )
    val post: String,

    @field:Schema(implementation = Comment::class)
    val comments: List<Comment>,
)
