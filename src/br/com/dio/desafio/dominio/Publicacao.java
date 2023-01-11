package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Publicacao {
    private Mensagem msg;
    private Set<Mensagem> respostas = new LinkedHashSet<>();

    public Mensagem getMsg() {
        return msg;
    }

    public void setMsg(Mensagem msg) {
        this.msg = msg;
    }

    public Set<Mensagem> getRespostas() {
        return respostas;
    }

    public void addRespostas(Mensagem resposta) {
        this.respostas.add(resposta);
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "msg=" + msg +
                ", respostas=" + respostas +
                '}';
    }
}
