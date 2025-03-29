package br.com.nfcelib.core.dto.strategy;

import java.math.BigDecimal;

public interface ImpostoStrategy {
    /*Metodo para calcular os impostos*/
    /*Todas as interfaces de imposto seguirão o contrato dessa interface*/
    BigDecimal calcularImposto(BigDecimal valor);

}
