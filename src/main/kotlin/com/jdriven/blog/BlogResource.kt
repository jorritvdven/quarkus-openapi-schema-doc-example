package com.jdriven.blog

import com.jdriven.blog.model.Author
import com.jdriven.blog.model.Comment
import com.jdriven.blog.model.Post
import java.time.LocalDate
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status

@Path("/blog")
class BlogResource {
    private val posts = mutableListOf<Post>(EXAMPLE_POST)

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun list(): List<Post> {
        return posts
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun create(post: Post): Response {
        posts += post
        return Response.status(Status.CREATED).build()
    }

    companion object {
        private val EXAMPLE_POST = Post(
            author = Author(
                fullName = "Jorrit van der Ven",
                photo = "https://blog.jdriven.com/photos/jorrit.jpg"
            ),
            tags = listOf("Quarkus", "OpenAPI", "Kotlin"),
            publishedOn = LocalDate.of(2022, 10, 14),
            title = "Add response body documentation to your OpenAPI spec with Quarkus",
            post = """Hello, world!""",
            comments = listOf(
                Comment(
                    name = "Jorrit van der Ven",
                    comment = "Awesome post!"
                )
            )
        )
    }
}
