package com.twl.salesfileprocessor.service;

import com.twl.salesfileprocessor.model.Vendedor;

/**
 * Serviço com as funcionalidades de {@link com.twl.salesfileprocessor.model.Vendedor}.
 *
 *  @author jefferson.rosa
 *  @since 29/09/2020
 */
public interface VendedorService {

    /**
     * Salva um novo vendedor.
     *
     * @param vendedor {@link Vendedor} a ser salvo
     * @return {@link Vendedor}
     */
    Vendedor save(Vendedor vendedor);
}
