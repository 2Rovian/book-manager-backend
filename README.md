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

### 1️⃣ Clone o repositório do frontend

```
git clone https://github.com/2rovian/book-manager-frontend.git
```

### 2️⃣ Clone o repositório do backend

```
git clone https://github.com/2rovian/book-manager-backend.git
```

### 3️⃣ Renomeie os diretórios

```
mv book-manager-frontend frontend
```
```
mv book-manager-backend backend
```

### 4️⃣ Acesse o diretório do backend
```
cd backend
```
### 5️⃣ Rode os containers
```
docker-compose up --build
```

### 🔗 Repo do frontend
👉 [BookManager Frontend](https://github.com/2Rovian/book-manager-frontend)
