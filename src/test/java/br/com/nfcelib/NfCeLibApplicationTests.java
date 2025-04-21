package br.com.nfcelib;

import br.com.nfcelib.core.dto.EnderecoDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NfCeLibApplicationTests {

	@Test
	void contextLoads() {
		EnderecoDto endereco = new EnderecoDto();

		endereco.setLogradouro("Rua Exemplo");
		endereco.setNumero("123");
		endereco.setComplemento("Apartamento 101");
		endereco.setBairro("Centro");
		endereco.setCodigoMunicipio("12345");
		endereco.setNomeMunicipio("Cidade Exemplo");
		endereco.setUf("SP");
		endereco.setCep("12345000");
		endereco.setCodigoPais("1058");
		endereco.setNomePais("Brasil");
		endereco.setTelefone("11987654321");

		// Verificando se os valores são corretamente atribuídos
		assertEquals("Rua Exemplo", endereco.getLogradouro());
		assertEquals("123", endereco.getNumero());
		assertEquals("Apartamento 101", endereco.getComplemento());
		assertEquals("Centro", endereco.getBairro());
		assertEquals("12345", endereco.getCodigoMunicipio());
		assertEquals("Cidade Exemplo", endereco.getNomeMunicipio());
		assertEquals("SP", endereco.getUf());
		assertEquals("12345000", endereco.getCep());
		assertEquals("1058", endereco.getCodigoPais());
		assertEquals("Brasil", endereco.getNomePais());
		assertEquals("11987654321", endereco.getTelefone());
	}

}
