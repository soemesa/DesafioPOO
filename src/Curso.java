
public class Curso extends Conteudo {
    private int cargaHoraria;

    public double calcularXp() {
        return 10.0 * (double)this.cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        String var10000 = this.getTitulo();
        return "Curso{titulo='" + var10000 + "', descricao='" + this.getDescricao() + "', cargaHoraria=" + this.cargaHoraria + "}";
    }
}
