package sbapimibands;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banda")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BandaModel {

    @Id
    private String nome;
    private String genero;

}
