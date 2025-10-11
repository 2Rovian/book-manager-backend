# 📚 BookManager - Backend

Backend do projeto **BookManager**, desenvolvido com **Java Spring Boot** e **PostgreSQL**. Fornece uma API RESTful para gerenciamento de livros e autores, consumida pelo frontend do projeto.

> Este backend foi desenvolvido como parte do [Full Stack Developer Challenge da Infoxchange](https://github.com/infoxchange/full-stack-developer-challenge?tab=readme-ov-file#backend-implementation).

## 🛠 Tecnologias

- **Java Spring Boot**
- **PostgreSQL**
- **Flyway Migration**
- **Maven** (gerenciamento de dependências)
- **Spring Data JPA** (integração com banco)
- **Lombok** (redução de boilerplate)
- **Spring Web** (para criação da API REST)

## 🧠 Endpoints

| Método | Endpoint       | Descrição                                                                                                                        | Resposta Esperada             |
| ------ | -------------- | --------------------------------------------------------------------- | ----------------------------- |
| GET    | /books/        | Retorna uma lista de livros cadastrados.                              | Lista de livros               |
| GET    | /books/{id}/   | Retorna os detalhes de um livro específico, incluindo dados do autor. | —                                                                                | Objeto do livro               |
| POST   | /books/        | Cria um novo livro com os dados especificados.                        |  Livro criado                  |
| PUT    | /books/{id}/   | Atualiza os dados de um livro existente.                              |  Livro atualizado              |
| DELETE | /books/{id}/   | Deleta um livro específico.                                           |  Mensagem de sucesso ou status |
| GET    | /authors/      | Retorna uma lista de autores cadastrados.                             |  Lista de autores              |
| GET    | /authors/{id}/ | Retorna os detalhes de um autor específico.                           |  Objeto do autor               |
| POST   | /authors/      | Cria um novo autor com os dados especificados.                        |  Autor criado                  |
| PUT    | /authors/{id}/ | Atualiza os dados de um autor existente.                              |  Autor atualizado              |
| DELETE | /authors/{id}/ | Deleta um autor específico.                                           |  Mensagem de sucesso ou status |



## 🚀 Instalação

### 1️⃣ Clone o repositório:

```
git clone https://github.com/2rovian/book-manager-backend.git
```

### 2️⃣ Configurar variáveis de ambiente

Configure o application.properties ou application.yml em src/main/resources com a configuração do banco:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/book-manager-db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
### 3️⃣ Build e execução
Se estiver usando Maven:
```
mvn clean install
mvn spring-boot:run
```

### 🔗 Conexão com o frontend
👉 [BookManager Frontend](https://github.com/2Rovian/book-manager-frontend)
