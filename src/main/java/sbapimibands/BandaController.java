package sbapimibands;


import br.com.mibands.Banda;
import br.com.mibands.BandaDto;
import br.com.mibands.BandaServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bandas")
public class BandaController {

    private BandaServicePort service;

    @Autowired
    public void setService(BandaServicePort service) {
        this.service = service;
    }

    @PostMapping
    public void cadastrar(@RequestBody BandaDto dto) {
        service.cadastrar(dto);
    }

    @GetMapping("/{nome}")
    public Banda procurarPorNome(@PathVariable("nome") String nome) {
        return service.procurarPorNome(nome);
    }

}