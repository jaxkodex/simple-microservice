package io.github.jaxkodex.examples.simplemicroservice.service;

import io.github.jaxkodex.examples.simplemicroservice.data.Orden;

public interface OrdenService {

    Orden find(Long id);
}
