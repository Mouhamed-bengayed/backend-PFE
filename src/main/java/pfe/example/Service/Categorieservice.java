package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import pfe.example.Dao.ProjectRepository;
import pfe.example.Entites.Project;

import java.util.List;

public class Categorieservice {
    @Autowired
    ProjectRepository projectRepository;

public List<Project> getAllproject(){
    projectRepository.findAll();
    return getAllproject();

}

}
