package pfe.example.Entites;

import lombok.Data;
import org.springframework.dao.support.DaoSupport;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
@Data
public class Comptes implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String numerocompte;
    private String email;
    private String password;
    private Date datedecreation;
    @ManyToOne
    private Utilisateur utilisateur;


}
