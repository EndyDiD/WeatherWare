package lt.codeacademy.javau8.weatherware.services;

import lt.codeacademy.javau8.weatherware.repositories.CoordinateRepository;

public class CoordinatesService {

    private CoordinateRepository cRepo;

    public CoordinatesService(CoordinateRepository cRepo) {
        this.cRepo = cRepo;
    }

}
