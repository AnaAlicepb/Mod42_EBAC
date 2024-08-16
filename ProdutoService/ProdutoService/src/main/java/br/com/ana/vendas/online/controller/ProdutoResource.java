package br.com.ana.vendas.online.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {
	
	private BuscaProduto buscaProduto;
	
	private CadastroProduto cadastroProduto;

}
