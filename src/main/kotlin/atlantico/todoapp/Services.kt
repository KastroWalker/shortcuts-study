package atlantico.todoapp

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service
import javax.inject.Inject
import javax.inject.Singleton

interface CRUDService<T>{
    fun getById(id: Int):T
    fun getAll():MutableIterable<T>
    fun delete(id: Int)
    fun update(t: T)
    fun save(t: T)
}
interface IServiceTODO: CRUDService<Todo>
@Singleton
@Service
class TodoService(@Inject val todoRepository: TodoRepository) : IServiceTODO{

    override fun getById(id: Int): Todo {
        return todoRepository.findById(id).get()
    }

    override fun getAll(): MutableIterable<Todo> {
        return todoRepository.findAll()
    }

    override fun delete(id: Int) {
        todoRepository.deleteById(id)
    }

    override fun update(t: Todo) {
        todoRepository.save(t)
    }

    override fun save(t: Todo) {
        todoRepository.save(t)
    }
}