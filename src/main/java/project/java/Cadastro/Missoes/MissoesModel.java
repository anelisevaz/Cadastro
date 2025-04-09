package project.java.Cadastro.Missoes;

import jakarta.persistence.*;
import project.java.Cadastro.Pessoas.PessoaModel;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    //@OneToMany - Uma missao pode ter varias pessoas
    @OneToMany(mappedBy = "missoes")
    private List<PessoaModel> pessoa;
}
