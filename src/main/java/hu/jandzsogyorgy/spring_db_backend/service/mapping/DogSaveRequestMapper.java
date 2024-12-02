package hu.jandzsogyorgy.spring_db_backend.service.mapping;


import hu.jandzsogyorgy.spring_db_backend.bean.DogSaveDTO;
import hu.jandzsogyorgy.spring_db_backend.entity.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogSaveRequestMapper implements EntityMapper<DogSaveDTO, Dog> {

    @Override
    public Dog toEntity(DogSaveDTO dto) {
        if (dto == null)
            return null;

        Dog entity = new Dog();
        entity.setName(dto.name());
        return entity;
    }
}
