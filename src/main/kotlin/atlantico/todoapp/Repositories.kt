package atlantico.todoapp

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import javax.inject.Singleton

@Repository
@Singleton
interface TodoRepository : CrudRepository<Todo, Int> {

}