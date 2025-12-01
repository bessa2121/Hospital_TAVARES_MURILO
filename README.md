# 🏥 Hospital 

Sistema hospitalar desenvolvido em **Java com Spring Boot**, com arquitetura baseada no padrão **MVC (Model-View-Controller)**.  
O projeto tem como objetivo gerenciar informações hospitalares como **pacientes, funcionários, consultas, receitas, salas e estoques**, de forma organizada e segura.

---

## 🧩 Estrutura do Projeto

```
Hospital_TAVARES_MURILO/
├── pom.xml                 # Arquivo de configuração do Maven
├── src/
│   └── main/
│       └── java/br/com/hospital/
│           ├── HospitalApplication.java     # Classe principal
│           ├── config/                      # Configurações iniciais e beans
│           ├── controller/                  # Controladores REST
│           ├── dto/                         # Objetos de transferência de dados
│           ├── mapper/                      # Conversores entre DTOs e Models
│           ├── model/                       # Entidades do sistema (JPA)
│           ├── repository/                  # Interfaces de acesso ao banco de dados
│           ├── security/                    # Configurações de segurança (Spring Security)
│           └── service/                     # Lógica de negócio
└── .idea/                                   # Configurações do IntelliJ IDEA
```

---

## 🚀 Tecnologias Utilizadas

| Categoria | Tecnologias |
|------------|--------------|
| Linguagem | ☕ Java 17+ |
| Framework | 🧱 Spring Boot |
| Banco de Dados | 🗃️ JPA / Hibernate (compatível com H2, MySQL, PostgreSQL) |
| Segurança | 🔐 Spring Security |
| Gerenciador de Dependências | 📦 Maven |
| Mapeamento de Dados | 🧩 DTOs e Mappers |
| IDE Recomendadas | IntelliJ IDEA / VS Code / Eclipse |

---

## ⚙️ Funcionalidades Principais

✅ Cadastro, listagem, atualização e exclusão de:
- **Pacientes**
- **Funcionários**
- **Cargos**
- **Consultas**
- **Salas**
- **Receitas e remédios**
- **Estoque hospitalar**

✅ Autenticação e segurança com Spring Security  
✅ Inicialização automática de dados (DataInitializer / DataLoader)  
✅ Organização modular e escalável  

---

## 🧠 Estrutura Lógica (MVC)

| Camada | Função |
|--------|--------|
| **Model** | Representa as entidades do sistema e suas relações no banco de dados. |
| **DTO (Data Transfer Object)** | Simplifica o transporte de dados entre o cliente e o servidor. |
| **Mapper** | Converte entre entidades e DTOs. |
| **Repository** | Acesso direto aos dados (camada de persistência). |
| **Service** | Regras de negócio e validações. |
| **Controller** | Endpoints REST que expõem os serviços da aplicação. |

---

## 🧰 Como Executar o Projeto

### 🔧 Pré-requisitos

Antes de rodar o projeto, verifique se possui instalado:

- [Java 17+](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/)
- (Opcional) [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [VS Code](https://code.visualstudio.com/)

---

### ▶️ Passos para rodar

1. **Clonar o repositório**
   ```bash
   git clone https://github.com/seuusuario/Hospital_TAVARES_MURILO.git
   ```

2. **Acessar a pasta do projeto**
   ```bash
   cd Hospital_TAVARES_MURILO
   ```

3. **Baixar dependências**
   ```bash
   mvn clean install
   ```

4. **Executar a aplicação**
   ```bash
   mvn spring-boot:run
   ```

5. **Acessar no navegador**
   ```
   http://localhost:8080
   ```

---

## 🧑‍💻 Estrutura de Pacotes

| Pacote | Descrição |
|--------|------------|
| `br.com.hospital.config` | Configuração do Spring e inicialização de dados |
| `br.com.hospital.controller` | Endpoints REST dos módulos |
| `br.com.hospital.dto` | Objetos de transferência entre client/server |
| `br.com.hospital.mapper` | Conversão entre DTOs e entidades |
| `br.com.hospital.model` | Entidades JPA representando as tabelas |
| `br.com.hospital.repository` | Interfaces que herdam de `JpaRepository` |
| `br.com.hospital.security` | Configurações de autenticação e autorização |
| `br.com.hospital.service` | Camada de lógica de negócio |

---

## 🧑‍⚕️ Exemplos de Entidades

Algumas das principais entidades:
- `Paciente`
- `Funcionario`
- `Consulta`
- `Receita` / `ReceitaRemedio`
- `Remedio`
- `Sala`
- `Cargo`
- `Estoque`
- `Usuario` / `User`

Cada uma delas está mapeada via **JPA** e conectada aos repositórios correspondentes.

---

## 🧾 Inicialização Automática

As classes `DataInitializer` e `DataLoader` garantem que, ao iniciar a aplicação, alguns dados de exemplo sejam automaticamente carregados no banco.

---

## 🔐 Segurança

A classe `WebSecurityConfig` configura a autenticação e autorização do sistema, protegendo rotas sensíveis e definindo regras de acesso para usuários.

---

## 🧪 Testes e Ambiente

O projeto pode ser facilmente adaptado para rodar com:
- Banco de dados **H2 (memória)** para testes
- Banco **MySQL/PostgreSQL** para produção

Basta ajustar as configurações em `application.properties` ou `application.yml`.

---

## 🧱 Possíveis Melhorias Futuras

- Criação de front-end em React ou Angular  
- Integração com API de terceiros (ex: farmácias, planos de saúde)  
- Sistema de relatórios PDF  
- Painel administrativo com gráficos  

---

## 💡 Autor

👤 **Davi Tavares**  
📧 [github.com/bessa2121](https://github.com/bessa2121)  
💻 Projeto acadêmico desenvolvido para fins educacionais.

---

## 🏁 Licença

Este projeto é de uso **educacional e livre**.  
Sinta-se à vontade para estudar, modificar e melhorar. ✨

---

### 📸 Preview (opcional)

#### 🔐 Tela de Login
<img width="1916" height="898" alt="preview" src="https://github.com/user-attachments/assets/8354d81c-0235-411e-9e93-91f10a50af2d" />

#### 🏥 Tela Inicial
<img width="1914" height="903" alt="preview2" src="https://github.com/user-attachments/assets/acbe05ab-6e1a-42eb-bb00-2583c1d8a087" />
