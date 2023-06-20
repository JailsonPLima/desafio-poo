import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String args[]) throws Exception {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso de Java");
    curso1.setDescricao("Descrição do curso de Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de JavaScript");
    curso2.setDescricao("Descrição do curso de JavaScript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria sobre Java");
    mentoria.setDescricao("Descrição da mentoria sobre Java");
    mentoria.setData(LocalDate.now());
    
    // System.out.println(curso1);
    // System.out.println(curso2);
    // System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev dev1 = new Dev();
    dev1.setNome("Jailson");
    System.out.println(dev1.situacao());
    dev1.inscreverBootcamp(bootcamp);
    System.out.println(dev1.situacao());
    dev1.progredir();
    dev1.progredir();
    dev1.progredir();
    System.out.println(dev1.situacao());

    Dev dev2 = new Dev();
    dev2.setNome("João");
    System.out.println(dev2.situacao());
    dev2.inscreverBootcamp(bootcamp);
    System.out.println(dev2.situacao());
    dev2.progredir();
    System.out.println(dev2.situacao());
  }
}
