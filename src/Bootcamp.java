import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;

    public Bootcamp() {
        this.dataFinal = this.dataInicial.plusDays(45L);
        this.devsInscritos = new HashSet();
        this.conteudos = new LinkedHashSet();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return this.dataInicial;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return this.devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return this.conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Bootcamp bootcamp = (Bootcamp)o;
            return Objects.equals(this.nome, bootcamp.nome) && Objects.equals(this.descricao, bootcamp.descricao) && Objects.equals(this.dataInicial, bootcamp.dataInicial) && Objects.equals(this.dataFinal, bootcamp.dataFinal) && Objects.equals(this.devsInscritos, bootcamp.devsInscritos) && Objects.equals(this.conteudos, bootcamp.conteudos);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome, this.descricao, this.dataInicial, this.dataFinal, this.devsInscritos, this.conteudos});
    }
}





