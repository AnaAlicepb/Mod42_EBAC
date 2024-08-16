<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Projeto ClienteServicoAna - Um serviço para gerenciar clientes em uma aplicação de vendas online">
    <meta name="keywords" content="Java, Spring Boot, MongoDB, API, Cliente, Vendas">
    <meta name="author" content="Ana Alice Rodrigues">
    </head>
<body>

<header>
    <h1>ClienteServicoAna</h1>
    </header>

<details>
    <summary>Índice</summary>
    <ol>
        <li><a href="#sobre-o-projeto">Sobre o projeto</a></li>
        <li><a href="#parte-tecnica">Parte Técnica</a></li>
        <li><a href="#estrutura-dos-arquivos">Estrutura dos Arquivos</a></li>
        <li><a href="#casos-de-uso">Casos de Uso</a></li>
        <li><a href="#ferramentas">Ferramentas</a></li>
        <li><a href="#contato">Contato</a></li>
    </ol>
</details>

<section id="sobre-o-projeto">
    <h2>Sobre o projeto</h2>
    <p>
        O ClienteServicoAna é um projeto desenvolvido em Java utilizando Spring Boot que implementa um serviço para gerenciar clientes em uma aplicação de vendas online. 
    </p>
    <p>
        Este serviço inclui funcionalidades como cadastro, atualização, e exclusão de clientes, além de tratamentos de erros e exceções personalizadas para garantir a robustez da aplicação.
    </p>
    <p>
        Proposta de Valor: Oferecer uma experiência de compra conveniente, com uma seleção diversificada de produtos, facilidade de navegação e processos de compra e entrega eficientes.
    </p>
</section>

<section id="parte-tecnica">
    <h2>Parte Técnica</h2>
    <ul>
        <li>Backend: Desenvolvido em Java utilizando Spring Boot para a lógica de negócios e gerenciamento de clientes.</li>
        <li>Banco de Dados: MongoDB para armazenar dados dos clientes e gerenciar as informações de forma escalável.</li>
        <li>API: A aplicação utiliza OpenAPI para documentação da API, facilitando a integração com outros serviços.</li>
        <li>Configurações: Inclui configurações customizadas para validações, manuseio de erros e documentação da API.</li>
    </ul>
</section>

<section id="estrutura-dos-arquivos">
    <h2>Estrutura dos Arquivos</h2>
    <ul>
        <li><strong>src/main/java/br/com/ana/vendas/onlineconfig/</strong></li>
        <ul>
            <li>MongConfig.java: Configuração do MongoDB</li>
            <li>OpenAPIConfig.java: Configuração do OpenAPI</li>
            <li>ValidatorConfig.java: Configuração para validações</li>
        </ul>
        <li><strong>src/main/java/br/com/anavendas/online/</strong></li>
        <ul>
            <li>ClienteServicoAnaApplication.java: Classe principal para execução da aplicação</li>
            <li><strong>domain/</strong></li>
            <ul>
                <li>Cliente.java: Classe de domínio representando o Cliente</li>
            </ul>
            <li><strong>errorhandling/</strong></li>
            <ul>
                <li>ApiError.java: Classe para tratamento de erros gerais</li>
                <li>ApiSubError.java: Classe para detalhamento de erros</li>
                <li>ApiValidationError.java: Classe para erros de validação</li>
            </ul>
            <li><strong>exception/</strong></li>
            <ul>
                <li>BadRequestException.java: Exceção para requisições inválidas</li>
                <li>EntityNotFoundException.java: Exceção para entidade não encontrada</li>
                <li>RestExceptionHandler.java: Handler para capturar exceções</li>
            </ul>
            <li><strong>repository/</strong></li>
            <ul>
                <li>IClienteRepository.java: Interface para interação com o banco de dados</li>
            </ul>
        </ul>
    </ul>
</section>

<section id="casos-de-uso">
    <h2>Casos de Uso</h2>
    <ul>
        <li>Cadastro de novos clientes</li>
        <li>Atualização de dados de clientes existentes</li>
        <li>Exclusão de clientes</li>
        <li>Tratamento de exceções em operações inválidas</li>
    </ul>
</section>

<section id="ferramentas">
    <h2>Ferramentas</h2>
    <ul>
        <li><img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Badge Java"></li>
        <li><img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Badge Spring Boot"></li>
        <li><img src="https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white" alt="Badge MongoDB"></li>
        <li><img src="https://img.shields.io/badge/Git-E44C30?style=for-the-badge&logo=git&logoColor=white" alt="Badge Git"></li>
    </ul>
</section>

<section id="contato">
    <h2>Contato</h2>
    <ul>
        <li><a href="https://linktr.ee/anaeanali5" target="_blank"><img src="https://img.shields.io/badge/Ana_Alice_Rodrigues-blue?style=for-the-badge" alt="Perfil de Ana Alice Rodrigues"></a></li>
    </ul>
</section>

</body>
</html>
