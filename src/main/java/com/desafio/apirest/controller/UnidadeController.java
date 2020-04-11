
package com.desafio.apirest.controller;

import com.desafio.apirest.repository.UnidadeRepository;
import com.desafio.apirest.viewmodel.UnidadeViewModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST UBS")
public class UnidadeController {
            
    @Autowired
    UnidadeRepository unidadeRepository;  
    
    @ApiOperation(value="Retorna uma lista de UBS Proxima a localização informada")
    @GetMapping("/find_ubs/{latitude}/{longitude}")
    public List<UnidadeViewModel> getUnidade(@PathVariable(value="latitude") double latitude,
                                    @PathVariable(value="longitude") double longitude){
        
        var UnidadesReturn = new ArrayList<UnidadeViewModel>();
        var returnAux = unidadeRepository.findByPosi(latitude, longitude);
        
        returnAux.forEach((item) -> {             
            UnidadesReturn.add(new UnidadeViewModel(item));
        });
        
        return UnidadesReturn;        
    }        
}
