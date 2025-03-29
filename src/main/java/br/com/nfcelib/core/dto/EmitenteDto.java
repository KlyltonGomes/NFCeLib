package br.com.nfcelib.core.dto;

public class EmitenteDto {

    private String cnpj;            // C02 - CNPJ do emitente
    private String razaoSocial;     // C03 - Razão Social
    private String nomeFantasia;    // C04 - Nome Fantasia (opcional)
    private String inscricaoEstadual; // C05 - Inscrição Estadual
    private String inscricaoMunicipal; // C06 - Inscrição Municipal (opcional)
    private String cnaeFiscal;      // C07 - CNAE Fiscal (opcional)
    private String crt;             // C08 - Código de regime tributário (1, 2 ou 3)

    private EnderecoDto endereco;   // Endereço completo

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCnaeFiscal() {
        return cnaeFiscal;
    }

    public void setCnaeFiscal(String cnaeFiscal) {
        this.cnaeFiscal = cnaeFiscal;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDto endereco) {
        this.endereco = endereco;
    }
}
