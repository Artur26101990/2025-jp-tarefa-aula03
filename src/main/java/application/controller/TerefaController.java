package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.repository.TarefaReository;


@Controller
@RequestMapping("/tarefas")
public class TerefaController {
    @Autowired
    private TarefaReository tarefaRepo;

    public String select (Model ui) {
        ui.addAtribute("tarefas", tarefaRepo.findAll());       
        return "list";
    }
        @RequestMapping("/insert")
        public String insert () {
            return "forInsert"
        }
}
