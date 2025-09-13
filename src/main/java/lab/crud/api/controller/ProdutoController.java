package lab.crud.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.crud.api.model.Produto;

@RestController
public class ProdutoController {

	//@RequestMapping(method = RequestMethod.POST, path = "/produto")
	@PostMapping("/produto")
	public ResponseEntity<Produto> novo(Produto produto) {
		
		
		return null;
	}
	
}
