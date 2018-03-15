package io.github.jaxkodex.examples.simplemicroservice.service.impl;

import io.github.jaxkodex.examples.simplemicroservice.data.Orden;
import io.github.jaxkodex.examples.simplemicroservice.data.repository.OrdenRepository;
import io.github.jaxkodex.examples.simplemicroservice.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class OrdenServiceImpl implements OrdenService {
    private OrdenRepository ordenRepository;

    @Autowired
    public OrdenServiceImpl(OrdenRepository ordenRepository) {
        this.ordenRepository = ordenRepository;
    }

    @Override
    public Orden find(Long id) {
        Optional<Orden> o = ordenRepository.findById(id);
        return o.isPresent() ? null : o.get();
    }
}
