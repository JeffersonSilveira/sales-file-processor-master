package com.twl.salesfileprocessor.service.impl;

import com.twl.salesfileprocessor.model.Vendedor;
import com.twl.salesfileprocessor.repository.VendedorRepository;
import com.twl.salesfileprocessor.service.VendedorService;
import org.springframework.stereotype.Service;

/**
 * Implementação de {@link VendedorService}.
 *
 *  @author jefferson.rosa
 *  @since 29/09/2020
 */
@Service
public class VendedorServiceImpl implements VendedorService {

    private final VendedorRepository repository;

    public VendedorServiceImpl(VendedorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vendedor save(Vendedor vendedor) {
        return repository.save(vendedor);
    }
}
