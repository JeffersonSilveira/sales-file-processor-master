package com.twl.salesfileprocessor.repository;

import com.twl.salesfileprocessor.model.Vendedor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositório para manipulação de {@link Vendedor}.
 *
 *  @author jefferson.rosa
 *  @since 29/09/2020
 */
public interface VendedorRepository extends MongoRepository<Vendedor, String> {
}
