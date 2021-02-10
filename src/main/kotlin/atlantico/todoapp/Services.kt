package atlantico.todoapp

import org.springframework.stereotype.Service
import javax.inject.Singleton

@Singleton
@Service
class TodoService() {
    fun getAll(): List<String> {
        return mutableListOf("Todo 1", "Todo 2", "Todo 3");
    }
}