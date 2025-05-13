# ScreenMatch - Consumindo API, Gravando Arquivos e Lidando com Erros em Java

## Descrição do Projeto
ScreenMatch é uma aplicação Java desenvolvida durante o curso da Alura que demonstra como:
- Consumir dados de uma API externa (OMDb API)
- Processar e transformar esses dados
- Gravar informações em arquivos JSON
- Implementar tratamento de erros robusto
- Trabalhar com records e outras features modernas do Java

## Funcionalidades Principais
- 🔍 Busca de filmes por título na OMDb API
- 🔄 Conversão de dados JSON para objetos Java
- 💾 Armazenamento local dos dados em arquivos JSON
- ⚠️ Gerenciamento de erros e exceções
- 🎬 Exibição formatada dos dados dos filmes

## Tecnologias Utilizadas
| Tecnologia       | Descrição                                  |
|------------------|--------------------------------------------|
| Java 17+         | Com records, HttpClient e outras features  |
| OMDb API         | API pública de informações sobre filmes    |
| Jackson          | Biblioteca para processamento de JSON      |
| Maven            | Gerenciamento de dependências              |

## Pré-requisitos
- ☑️ JDK 17 ou superior
- ☑️ Maven instalado
- ☑️ Chave de API válida para a OMDb API

## Configuração
1. Clone o repositório:
   ```bash
   git clone https://github.com/Josmarm4/ScreenMatch.git
2. Acesse o diretório:
   cd ScreenMatch
3. Configure sua chave API:
    // Em src/main/java/br/com/alura/screenmatch/main/Main.java
   private static final String API_KEY = "sua_chave_aqui";

## Como Executar
- mvn compile
- mvn exec:java -Dexec.mainClass="br.com.alura.screenmatch.main.Main"

## Aprendizados Implementados
✅ Consumo de APIs REST com HttpClient

✅ Processamento de JSON com Jackson

✅ Uso de records para modelagem de dados

✅ Tratamento robusto de exceções

✅ Manipulação de arquivos JSON

## Roadmap
- Adicionar interface gráfica

- Implementar busca múltipla

- Criar sistema de favoritos

- Desenvolver testes unitários

## Contribuição
Sugestões são bem-vindas! Abra uma issue ou envie um PR.

## Licença
MIT © Josmarm4
