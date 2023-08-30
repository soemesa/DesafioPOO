import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSoe = new Dev();
        devSoe.setNome("Soe");
        devSoe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Soe:" + devSoe.getConteudosInscritos());
        devSoe.progredir();
        devSoe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Soe:" + devSoe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Soe:" + devSoe.getConteudosConcluidos());
        System.out.println("XP:" + devSoe.calcularTotalXp());

        System.out.println("-------");

        Dev devAndy = new Dev();
        devAndy.setNome("Andy");
        devAndy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andy:" + devAndy.getConteudosInscritos());
        devAndy.progredir();
        devAndy.progredir();
        devAndy.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andy:" + devAndy.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Andy:" + devAndy.getConteudosConcluidos());
        System.out.println("XP:" + devAndy.calcularTotalXp());

    }
}


