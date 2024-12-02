package hu.jandzsogyorgy.spring_db_backend.controller;

import hu.jandzsogyorgy.spring_db_backend.bean.DogDTO;
import hu.jandzsogyorgy.spring_db_backend.bean.DogSaveDTO;
import hu.jandzsogyorgy.spring_db_backend.service.DogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/dog", produces = MediaType.APPLICATION_JSON_VALUE)
@ApiResponse(responseCode = "200", description = "Successful request")
@ApiResponse(responseCode = "500", description = "Internal server error")
public class DogController {
    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    // List
    @GetMapping
    @Operation(summary = "All dogs", description = "List all dogs")
    public List<DogDTO> getAll() {
        return this.dogService.listAll();
    }

    // Save
    @PostMapping
    public DogDTO create(@RequestBody DogSaveDTO request) {
        return this.dogService.save(request);
    }


}
