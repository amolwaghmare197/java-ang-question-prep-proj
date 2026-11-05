package com.example.crud_oct.Service;


import com.example.crud_oct.Entity.Technology;
import com.example.crud_oct.Repo.TechnologyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    public Technology save(Technology technology) {
        return technologyRepository.save(technology);
    }

    public List<Technology> getAll() {
        return technologyRepository.findAll();
    }

    public Technology getById(Long id) {
        return technologyRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Technology not found : " + id));
    }

    public Technology update(Long id, Technology technologyRequest) {

        Technology technology = getById(id);

        technology.setName(technologyRequest.getName());
        technology.setDescription(technologyRequest.getDescription());
        /*technology.setActive(technologyRequest.getActive());*/

        return technologyRepository.save(technology);
    }

    public void delete(Long id) {

        Technology technology = getById(id);

        technologyRepository.delete(technology);
    }
}
