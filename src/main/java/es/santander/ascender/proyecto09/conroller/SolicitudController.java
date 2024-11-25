package es.santander.ascender.proyecto09.conroller;

import java.util.List;

import org.springframework.web.bind.annatocion.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import es.santander.ascender.proyecto09.Solicitud;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/solicitud")

public class SolicitudController {
    public Solicitud leer(long id) {

    }
public void borrar(long id) {
    throw new UnsupportedOperationException("Pdte");
}

public void modificar(Solicitud solicitud) {
    throw new 
    }

@GetMapping("/{id}")    
public Solicitud leer (@RequestParam("id") long)
}
