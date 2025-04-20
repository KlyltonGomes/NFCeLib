# 🔥 NFCeLib - Biblioteca Emissora de NFC-e 🚀  
## PROJETO EM DESENVOLVIMENTO- etapa 1

![NFCeLib](https://img.shields.io/badge/NFCeLib-v1.0-blue?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge)
![Spring](https://img.shields.io/badge/SpringBoot-3.2.2-brightgreen?style=for-the-badge)
![License](https://img.shields.io/github/license/KlyltonGomes/NFCeLib?style=for-the-badge)

🔗 **Uma biblioteca Java modular para emissão de NFC-e (Nota Fiscal do Consumidor Eletrônica), projetada para facilitar a integração com a SEFAZ em projetos modernos.**  

---

## ✨ Recursos

✅ Emissão de NFC-e com regras fiscais por estado  
✅ Assinatura digital com certificados A1 (A3 projeto futuro)  
✅ Validação de XML contra XSDs oficiais  
✅ Validações fiscais e normalizações automáticas  
✅ Modularidade para fácil manutenção e extensão  
🧪 Simulador de transmissão (projeto futuro)  
📄 DANFE em HTML e PDF (projeto futuro)

---

## 🧱 Arquitetura Hexagonal

A NFCeLib foi construída seguindo os princípios da **Arquitetura Hexagonal (Ports and Adapters)**, com separação clara entre regras de negócio (core) e mecanismos externos (adapters).

### 🧩 Estrutura Modular

```bash
nfce-lib/
├── nfce-core/         # Núcleo da aplicação - regras, validações e builders
├── nfce-model/        # Entidades, enums e validações do domínio
├── nfce-xml/          # Geração de XML via XSDs estaduais
├── nfce-signature/    # Assinatura digital e certificados
├── nfce-soap/         # Comunicação com SEFAZ (projeto futuro)
├── nfce-danfe-web/    # Renderização de DANFE (projeto futuro)
└── tests/             # Testes unitários e integração

🚀 Como Usar
Adicione a lib como dependência Maven/Gradle (ou clone o projeto e instale localmente):

<dependency>
  <groupId>br.com.nfcelib</groupId>
  <artifactId>nfce-core</artifactId>
  <version>1.0.0</version>
</dependency>





