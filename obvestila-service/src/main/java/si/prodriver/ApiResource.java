package si.prodriver;

import si.prodriver.model.Obvestilo;
import si.prodriver.model.ObvestiloInput;

import java.util.UUID;

public class ApiResource implements ObvestilaApi{

    @Override
    public Obvestilo uporabnikUporabnikIdObvestilaPost(UUID uporabnikId, ObvestiloInput obvestiloInput) {
        return null;
    }
}
