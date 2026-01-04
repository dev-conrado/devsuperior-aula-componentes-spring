# Projeto Aula - DevSuperior (Spring Professional)

Este repositório contém a solução funcional para a aula de **Componentes e Injeção de Dependência**, já com as correções para erros comuns de versão e estrutura.

## 🔧 Correções aplicadas neste projeto

Se você está travado na aula, este código resolve os seguintes problemas:

### 1. Erro de Versão (`UnsupportedClassVersionError`)
O projeto foi configurado para rodar com **Java 21** (compatível com Java 17+), resolvendo o conflito entre o código compilado e a versão do runner da IDE.

### 2. Estrutura de Pacotes
Muitos alunos enfrentam erro de "package does not exist".
- **Correção:** Todos os arquivos foram movidos corretamente para dentro do pacote `com.devsuperior.aula`.
- Os `imports` e declarações de `package` foram ajustados em todos os arquivos (`SalaryService`, `PensionService`, etc.).

### 3. Classe `Employee`
A classe `Employee` original estava incompleta.
- Foi adicionado o construtor correto: `Employee(String name, double grossSalary)`.
- Foi adicionado o método `getGrossSalary()` que é utilizado pelo `SalaryService` para o cálculo.

## 🚀 Como rodar
1. Clone este repositório.
2. Abra no IntelliJ ou Eclipse.
3. Aguarde o Maven baixar as dependências.
4. Execute a classe `AulaApplication.java`.