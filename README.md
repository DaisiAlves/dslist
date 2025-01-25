# DSList

# Sobre o Projeto
DSList é um projeto de gerenciamento de coleções de jogos desenvolvido com Java Spring durante o Intensivão Java Spring do DevSuperior com o professor Nélio Alves. O sistema permite a criação e visualização de duas listas distintas de jogos: "Jogos de Aventura e RPG" e "Jogos de Plataforma". Cada lista armazena informações detalhadas sobre os jogos, facilitando a organização e consulta.

Funcionalidades
- Visualização de duas listas de jogos.

- Exibição de detalhes dos jogos em páginas individuais.

- Possibilidade de alterar a posição dos jogos na lista.

# Modelo Conceitual 

![image](https://github.com/user-attachments/assets/2330a077-5dc8-40e0-b9d3-659dc7b4fa22)


# Tecnologias Utilizadas

- Java Spring: Framework utilizado para construção do projeto backend.

- JPA/Hibernate: Implementação de ORM (Mapeamento Objeto-Relacional) para interação com o banco de dados.

- H2 Database: Banco de dados em memória utilizado para desenvolvimento e testes.

- PostgreSQL: Banco de dados relacional utilizado para armazenamento persistente.

- Docker: Ferramenta de contêinerização usada para criar e gerenciar ambientes de desenvolvimento e produção.

- Postman: Ferramenta para testes de API.

# Estrutura do Projeto

- Entidades e ORM: Classes de domínio e mapeamento com o banco de dados.

- Database Seeding: População inicial do banco de dados com dados pré-definidos.

- Padrão de Camadas: Arquitetura de projeto dividida em camadas (Controller, Service, Repository) para melhor organização e manutenção.

- DTO (Data Transfer Object): Padrão utilizado para transferência de dados entre as camadas da aplicação.

# Como Usar
Pré requisito: Java 17

```bash
# clonar repositório
git clone https://github.com/seu-usuario/dslist.git

# Navegue até o diretório do projeto:
cd dslist

# executar o projeto
./mvnw spring-boot:run
```
