package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.Entites.ListeNoir;

@Repository
public interface Listenoirrepository extends JpaRepository<ListeNoir,Long> {

}

