package br.com.nfcelib.core.dto;

import br.com.nfcelib.core.dto.strategy.ImpostoStrategy;

import java.math.BigDecimal;


public class ImpostoDto {


    private ImpostoStrategy impostoStrategy;
    /*Estratégia para o cálculo do imposto*/

    public ImpostoDto(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    public BigDecimal calcularImposto(BigDecimal valor) {
        return impostoStrategy.calcularImposto(valor);
        /*Delegando o cálculo para a estratégia*/
    }

}
