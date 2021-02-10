package atlantico.todoapp

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Controller("/todo")
class TodoController(@Autowired val todoService: TodoService){


    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllTodo(): List<String>{
       return  todoService.getAll()
    }
}