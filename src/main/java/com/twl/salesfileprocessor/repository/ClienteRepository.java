package com.twl.salesfileprocessor.repository;

import com.twl.salesfileprocessor.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repositório para manipulação de {@link Cliente}.
 *
 *  @author jefferson.rosa
 *  @since 29/09/2020
 */
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
