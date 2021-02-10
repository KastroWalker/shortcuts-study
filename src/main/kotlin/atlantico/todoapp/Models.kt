package atlantico.todoapp

import javax.persistence.*

@Entity
data class Todo (
    @Id @GeneratedValue val id:Int? = null,
    @Column val description:String = ""
    )
