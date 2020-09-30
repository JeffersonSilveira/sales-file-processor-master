package com.twl.salesfileprocessor.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * Classe que representa um Vendedor.
 *
 * @author jefferson.rosa
 * @since 29/09/2020
 */
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendedor {

    @Id
    private String cpf;
    private String nome;
    private BigDecimal salario;
}
