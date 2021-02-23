package atlantico.todoapp



import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import javax.inject.Inject

@Controller("/")
class Hello{
    @Get("/")
    fun getH() = "Hello World Again!!!"
}

@Controller("/todo")
class HelloController(@Inject val service: TodoService) {
    @Get("/")
    fun find():ResponseEntity<MutableIterable<Todo>> {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }
    @Post("/")
    fun <T> create(@Body todo:Todo):ResponseEntity<T> {
        service.save(todo)
        return ResponseEntity.status(HttpStatus.OK).build()
    }
    @Delete("/{id}")
    fun <T> remove(@PathVariable id: Int):ResponseEntity<T> {
        service.delete(id)
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @Put("/")
    fun <T> remove(@Body todo: Todo):ResponseEntity<T> {
        service.update(todo)
        return ResponseEntity.status(HttpStatus.OK).build()
    }
}