package hu.jandzsogyorgy.spring_db_backend.service;

import hu.jandzsogyorgy.spring_db_backend.bean.DogDTO;
import hu.jandzsogyorgy.spring_db_backend.bean.DogSaveDTO;
import hu.jandzsogyorgy.spring_db_backend.database.DogRepository;
import hu.jandzsogyorgy.spring_db_backend.service.mapping.DogMapper;
import hu.jandzsogyorgy.spring_db_backend.service.mapping.DogSaveRequestMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DogService {

    private final DogRepository dogRepository;
    private final DogMapper dogMapper;
    private final DogSaveRequestMapper dogSaveRequestMapper;

    // List
    public List<DogDTO> listAll() {
        return this.dogMapper.toDto(this.dogRepository.findAll());
    }

    // Save
    public DogDTO save(DogSaveDTO request) {
        var entity = this.dogSaveRequestMapper.toEntity(request);

        return this.dogMapper.toDto(this.dogRepository.save(entity));
    }



}
