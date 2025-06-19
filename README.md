# 🔥 NFCeLib - Biblioteca Emissora de NFC-e 🚀  
## PROJETO EM DESENVOLVIMENTO – Etapa 1

![NFCeLib](https://img.shields.io/badge/NFCeLib-v1.0-blue?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge)
![Spring](https://img.shields.io/badge/SpringBoot-3.2.2-brightgreen?style=for-the-badge)
![License](https://img.shields.io/github/license/KlyltonGomes/NFCeLib?style=for-the-badge)

🔗 **Uma biblioteca Java modular para emissão de NFC-e (Nota Fiscal do Consumidor Eletrônica), projetada para facilitar a integração com a SEFAZ em projetos modernos.**  

---

## ✨ Recursos

 Emissão de NFC-e com regras fiscais por estado  🚧 Em progresso

 Assinatura digital com certificados A1 (A3 será suportado futuramente)  🚧 Em progresso

 Validação de XML contra XSDs oficiais da SEFAZ  🚧 Em progresso

 Validações fiscais e normalizações automáticas  🚧 Em progresso

 Modularidade: arquitetura desacoplada e extensível  🚧 Em progresso

 Console Web para simulação e testes locais  🚧 Em progresso

🧪 Simulador de transmissão real 🚧 Em progresso  

📄 DANFE em HTML e PDF 🚧 Em progresso


---

## 🧱 Arquitetura Modular


---

## 🔄 Ciclo de Emissão

1. 📥 Entrada de dados (objeto `Nfce` preenchido)
2. ✅ Validações estruturais (`nfce-core`)
3. 📄 Geração do XML (`nfce-xml`)
4. 🔐 Assinatura digital (`nfce-signature`)
5. 📡 Envio à SEFAZ (`nfce-soap`)
6. 📤 Retorno com autorização ou rejeição

---

## 🧪 Console de Testes Local

> O módulo `nfce-dev-tools-console` fornece uma interface web para simular a emissão de NFC-e localmente sem depender de ferramentas como Postman ou testes JUnit.

### 🔐 Acesso padrão:

- URL: http://localhost:8080/nfce-console  
- Usuário: admin  
- Senha: 1234


👨‍💻 Autor
Klylton Gomes 
