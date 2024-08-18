package com.example.peliculas;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PeliculasController {
    private List<Peliculas> pelicula = new ArrayList<>();

    public PeliculasController(){
        pelicula.add(new Peliculas(1, "La naranja mecánica", 1967, "Stanley Kubrick", "Crimen", "Bla bla bla"));
        pelicula.add(new Peliculas(2, "Amélie", 2001, "Jean-Pierre Jeunet", "Comedia", "Bla bla bla"));
        pelicula.add(new Peliculas(3, "Ciudadano Kane", 1940, "Orson Welles", "Drama", "Bla bla bla"));
        pelicula.add(new Peliculas(4, "Oldboy", 2003, "Park Chan-wook", "Drama", "Bla bla bla"));
        pelicula.add(new Peliculas(5, "El resplandor", 1980, "Stanley Kubrick", "Horror", "Bla bla bla"));
        pelicula.add(new Peliculas(6, "WALL·E", 2008, "Andrew Stanton", "Familiar", "Bla bla bla"));
    }

    @GetMapping("/peliculas/{id}")
    public Peliculas getPeliculasByID(@PathVariable int id){
        for (Peliculas peli : pelicula){
            if(peli.getID() == id){
                return peli;
            }
        }
        return null;
    }

    @GetMapping("/peliculas")
    public List<Peliculas> peliculas(){
        return pelicula;
    }
    
}
