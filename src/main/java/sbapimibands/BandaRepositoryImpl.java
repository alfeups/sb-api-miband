package sbapimibands;

import br.com.mibands.Banda;
import br.com.mibands.BandaRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandaRepositoryImpl implements BandaRepositoryPort {

    private BandaRepository repository;

    @Autowired
    public void setRepository(BandaRepository repository){
        this.repository = repository;
    }

    @Override
    public void salvar(Banda banda){
        var model = new BandaModel(banda.getNome(), banda.getNome());
        repository.save(model);
    }

    @Override
    public Banda procurarPorNome(String nome){
        var model = repository.findById(nome);
        return new Banda(model.get().getNome(), model.get().getNome());
    }
}
