package hu.jandzsogyorgy.spring_db_backend.service.mapping;


import hu.jandzsogyorgy.spring_db_backend.bean.DogDTO;
import hu.jandzsogyorgy.spring_db_backend.entity.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogMapper implements DtoMapper<Dog, DogDTO> {

    @Override
    public DogDTO toDto(Dog entity) {
        return new DogDTO(
                entity.getId(),
                entity.getName()
        );
    }
}
