import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descirção Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + camila.getConteudosInscritos());
        camila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + camila.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + camila.getConteudosConcluidos());
        System.out.println("XP: " + camila.calcularXp());

        System.out.println("-----------------------");

        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + joao.getConteudosInscritos());
        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + joao.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularXp());

    }
}
