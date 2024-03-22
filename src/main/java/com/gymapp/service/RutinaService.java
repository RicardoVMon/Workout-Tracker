package com.gymapp.service;

import com.gymapp.domain.Rutina;
import com.gymapp.domain.Usuario;
import java.util.List;

public interface RutinaService {

    public List<Rutina> encontrarRutinasPorUsuario(Usuario usuario);

}
