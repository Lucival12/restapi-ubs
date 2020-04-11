package com.desafio.apirest.repository;

import com.desafio.apirest.models.Unidade;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class UnidadeRepositoryTest {
    
    @Autowired
    private UnidadeRepository unidadeRepository;
    
    @Test
    public void testFindByPosi(){        
        List<Unidade> unidades = unidadeRepository.findByPosi(-23.5544024,-46.6934111);
        Assertions.assertThat(unidades.size()).isEqualTo(9);
    }
    
}
