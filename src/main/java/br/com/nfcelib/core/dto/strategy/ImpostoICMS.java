package br.com.nfcelib.core.dto.strategy;

import java.math.BigDecimal;

public class ImpostoICMS implements ImpostoStrategy {

    private BigDecimal aliquota;

    public ImpostoICMS(BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public BigDecimal calcularImposto(BigDecimal valor) {
        return valor.multiply(aliquota).setScale(2, BigDecimal.ROUND_HALF_UP);
        /* ICMS é calculado como valor * alíquota */
    }
}
