package com.br.projetoEstudo.demo.service;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);
    //foi usado o T pois não sabemos qual entidade será retornada, essa interface foi criada para tornar mais
    //genérica essa classe.

}
