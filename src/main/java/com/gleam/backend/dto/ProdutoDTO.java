package com.gleam.backend.dto;

import com.gleam.backend.enums.Acabamento;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProdutoDTO {
    private String nome;
    private BigDecimal precoVenda;
    private BigDecimal precoCusto;
    private Integer acabamento;
    private String codigoFornecedor;
    private Long idFornecedor;
    private String categoria;
}