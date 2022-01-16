package br.com.maquiagensapi.controller;

import br.com.maquiagensapi.controller.request.ProdutoRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProdutoController {

    @PostMapping("produto")
    public String teste(ProdutoRequest produtoRequest){
        return "Teste";
    }
}
