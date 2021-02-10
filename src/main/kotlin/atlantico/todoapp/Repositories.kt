package atlantico.todoapp

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import javax.inject.Singleton

@Repository
@Singleton
interface TodoRepository : CrudRepository<Todo, Int>{

}