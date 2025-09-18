package lab.crud.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lab.crud.api.model.Produto;

@RestController
public class ProdutoController {

	
	//curl -X POST http://localhost:8080/produtos -H "Content-Type: application/json; Charset=utf-8" -d @produto-pao.json
	
	//@RequestMapping(method = RequestMethod.POST, path = "/produto")
	@PostMapping("/produtos")
	public ResponseEntity<Produto> novo(
			@RequestBody Produto produto) {
		
		System.out.println("nome:" + produto.getNome());
		System.out.println("mês:" + produto.getDataCriacao().getMonthValue());
		
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(produto);
	}
	
}
