package com.twl.salesfileprocessor.service;

import com.twl.salesfileprocessor.model.Venda;

import java.util.Optional;

/**
 * Serviço com as funcionalidades de {@link com.twl.salesfileprocessor.model.Venda}.
 *
 *  @author jefferson.rosa
 *  @since 29/09/2020
 */
public interface VendaService {

    /**
     * Salva uma nova venda.
     *
     * @param venda {@link Venda} a ser salva
     * @return {@link Venda} salva
     */
    Venda save(Venda venda);

    /**
     * Busca a venda mais cara.
     *
     * @return {@link Venda} mais cara
     */
    Optional<Venda> findVendaMaisCara();

    /**
     * Busca a venda com o pior vendedor.
     *
     * @return {@link Venda} com o pior vendedor
     */
    Optional<Venda> findVendaComPiorVendedor();

    /**
     * Deleta todos os documentos.
     */
    void deleteAll();
}
