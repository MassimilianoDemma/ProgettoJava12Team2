package com.Team2Java12.MechAppoint.servicies;

import com.Team2Java12.MechAppoint.Exception.NotFoundException;
import com.Team2Java12.MechAppoint.controllers.DTO.*;
import com.Team2Java12.MechAppoint.controllers.DTO.Magazzino.CreateMagazzinoRequestDTO;
import com.Team2Java12.MechAppoint.controllers.DTO.Magazzino.DeleteMagazzinoRequestDTO;
import com.Team2Java12.MechAppoint.controllers.DTO.Magazzino.GetMagazzinoDTO;
import com.Team2Java12.MechAppoint.controllers.DTO.Magazzino.UpdateMagazzinoRequestDTO;
import com.Team2Java12.MechAppoint.dataStatus.ValidationEnum;
import com.Team2Java12.MechAppoint.entities.Magazzino;

import com.Team2Java12.MechAppoint.entities.Officina;
import com.Team2Java12.MechAppoint.repositories.MagazzinoRepository;

import com.Team2Java12.MechAppoint.repositories.OfficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class MagazzinoService {

    @Autowired
    private MagazzinoRepository magazzinoRepository;
    @Autowired
    private OfficinaRepository officinaRepository;

    public BaseResponse createMagazzino(CreateMagazzinoRequestDTO magazzinoDTO) {
        Magazzino magazzino = new Magazzino();
        magazzino.setNomeMagazzino(magazzinoDTO.getNomeMagazzino());
        magazzino.setInventario(magazzinoDTO.getInventario());
        magazzino.setStatus(ValidationEnum.ACTIVE);
        Optional<Officina> Oofficina = officinaRepository.findById(magazzinoDTO.getOfficinaId());
        Officina officina = Oofficina.get();
        magazzino.setOfficina(officina);
        magazzinoRepository.save(magazzino);
        BaseResponse baseResponse = new BaseResponse();
        return baseResponse;
    }

    public GetMagazzinoDTO getMagazzino(Integer magazzinoId) {
        Optional<Magazzino> aMagazzino = magazzinoRepository.findById(magazzinoId);

        if (aMagazzino.isPresent()) {
            Magazzino magazzino = aMagazzino.get();
            GetMagazzinoDTO magazzinoDTO = new GetMagazzinoDTO();
            magazzinoDTO.setNomeOfficina(magazzino.getNomeMagazzino());
            magazzinoDTO.getInventario(magazzino.getInventario());
            return magazzinoDTO;
        } else {
            throw new NotFoundException("NOT_FOUD");
        }

    }

    public BaseResponse updateMagazzino(UpdateMagazzinoRequestDTO updateMagazzinoRequestDTO) {
        Optional<Magazzino> optionalMagazzino = magazzinoRepository.findById(updateMagazzinoRequestDTO.getId());
        if (optionalMagazzino.isEmpty()) {
            throw new RuntimeException();
        }
        Magazzino magazzino = optionalMagazzino.get();
        magazzino.setNomeMagazzino(updateMagazzinoRequestDTO.getNomeOfficina());
        magazzino.setInventario(updateMagazzinoRequestDTO.getInventario());
        magazzinoRepository.save(magazzino);
        return new BaseResponse();
    }

    public BaseResponse deleteMagazzino(DeleteMagazzinoRequestDTO deleteMagazzinoRequestDTO) {
        Optional<Magazzino> optionalMagazzino = magazzinoRepository.findById(deleteMagazzinoRequestDTO.getId());
        if (optionalMagazzino.isEmpty()) {
            throw new RuntimeException();
        }
        Magazzino magazzino = optionalMagazzino.get();
        magazzino.setStatus(ValidationEnum.DELETED);
        magazzinoRepository.save(magazzino);

        return new BaseResponse();
    }
}

