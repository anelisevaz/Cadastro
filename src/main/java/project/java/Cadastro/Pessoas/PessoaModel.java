package project.java.Cadastro.Pessoas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //@ManyToOne - uma pessoa tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //chave estrangeira foreign key
    private MissoesModel missoes;


}
