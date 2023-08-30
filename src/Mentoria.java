import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public double calcularXp() {
        return 30.0;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        String var10000 = this.getTitulo();
        return "Mentoria{titulo='" + var10000 + "', descricao='" + this.getDescricao() + "', data=" + this.data + "}";
    }
}

