package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tarefas")

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;

    public void setId(lonf id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setDescricao(String Descricao)

    
}
