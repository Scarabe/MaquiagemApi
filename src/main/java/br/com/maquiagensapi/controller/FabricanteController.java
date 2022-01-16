package br.com.maquiagensapi.controller;

import br.com.maquiagensapi.controller.request.FabricanteRequest;
import br.com.maquiagensapi.controller.response.FabricanteResponse;
import br.com.maquiagensapi.exception.NotFound;
import br.com.maquiagensapi.mapper.FabricanteMapper;
import br.com.maquiagensapi.service.FabricanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class FabricanteController {

    private final FabricanteService fabricanteService;


    @GetMapping("/fabricante/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FabricanteResponse byId(@PathVariable Long id) throws NotFound {
        throw new NotFound();
        //return FabricanteMapper.toResponse(fabricanteService.getById(id));
    }

    @GetMapping("/fabricante")
    @ResponseStatus(HttpStatus.OK)
    public List<FabricanteResponse> findAll() {
        return FabricanteMapper.toResponse(fabricanteService.findAll());
    }

    @DeleteMapping("/fabricante/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void bydeleteByIdId(@PathVariable Long id) {
       fabricanteService.deleteById(id);
    }

    @PostMapping("/fabricante")
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody FabricanteRequest fabricanteRequest){
        fabricanteService.insert(FabricanteMapper.toVO(fabricanteRequest));
    }
}
