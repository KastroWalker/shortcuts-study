package atlantico.todoapp

import javax.persistence.*

@Entity
data class Todo (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Int? = null,
    @Column val description:String = ""
    )
