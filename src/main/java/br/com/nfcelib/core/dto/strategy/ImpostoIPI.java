package br.com.nfcelib.core.dto.strategy;

import java.math.BigDecimal;

public class ImpostoIPI implements ImpostoStrategy{

    private BigDecimal aliquota;

    public ImpostoIPI(BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public BigDecimal calcularImposto(BigDecimal valor) {
        return valor.multiply(aliquota).setScale(2, BigDecimal.ROUND_HALF_UP);
        /*IPI é calculado como valor * alíquota*/
    }
}
