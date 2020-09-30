package com.twl.salesfileprocessor.repository;

import com.twl.salesfileprocessor.model.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositório para manipulação de {@link Venda}.
 *
 *  @author jefferson.rosa
 *  @since 29/09/2020
 */
public interface VendaRepository extends MongoRepository<Venda, Long> {
}
