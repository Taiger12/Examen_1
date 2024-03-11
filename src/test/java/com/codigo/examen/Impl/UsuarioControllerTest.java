package com.codigo.examen.Impl;

import com.codigo.examen.entity.Rol;
import com.codigo.examen.entity.Usuario;
import com.codigo.examen.repository.RolRepository;
import com.codigo.examen.repository.UsuarioRepository;
import com.codigo.examen.service.impl.UsuarioServiceImpl;
import jakarta.persistence.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.html.Option;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

public class UsuarioControllerTest {

    @Mock
    private UsuarioRepository usuarioRepository;
    @Mock
    private RolRepository rolRepository;
    @Mock
    private Usuario usuario;
    @Mock
    private Rol rol;

    @InjectMocks
    private UsuarioServiceImpl uarioServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);


    }
    @Test
    void createUsuariOutSuccess(){

        Long id = 1L;
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(id);
        usuario.setUsername("Fredy");
        usuario.setPassword("XXXXXXX");
        usuario.setEmail("Tai@sds.com");
        usuario.setTelefono("87898564");
        usuario.setEnabled(true);
        usuario.setAccountnonexpire(false);
        usuario.setAccountnonlocked(false);
        usuario.setCredentialsnonexpired(false);

        Optional<Usuario> ExisteUsuario = usuarioRepository.findByUsername("Fredy");
        when(ExisteUsuario.isPresent()).thenReturn(Boolean.TRUE);

        assertEquals(usuario.getUsername(),ExisteUsuario.get().getUsername());
    }

    @Test
    void getUsuarioByIdSuccess(){

        Long id = 1L;

        Optional<Usuario> ExisteUsuario = usuarioRepository.findById(id);
        when(ExisteUsuario.isPresent()).thenReturn(Boolean.TRUE);

        assertEquals(id,ExisteUsuario.get().getIdUsuario());

    }

    @Test
    void gupdateUsuarioSuccess(){

        Long id = 1L;
        String nombre = "Fredy";

        Optional<Usuario> ExisteUsuario = usuarioRepository.findById(id);
        when(ExisteUsuario.isPresent()).thenReturn(Boolean.TRUE);

        assertEquals(id,ExisteUsuario.get().getIdUsuario());

    }




}
