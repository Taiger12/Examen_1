package com.codigo.examen.controller;


import com.codigo.examen.Request.SignInRequest;
import com.codigo.examen.Request.SignUpRequest;
import com.codigo.examen.Response.AuthenticationResponse;
import com.codigo.examen.entity.Usuario;
import com.codigo.examen.service.AuthenticationService;
import com.codigo.examen.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms-examen/v1/usuarios/autenticacion")
@RequiredArgsConstructor
public class AutenticacionController {

    private final AuthenticationService authenticationService;
    private final UsuarioService usuarioService;



    @PostMapping("/signin")
    public ResponseEntity<AuthenticationResponse> signin(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signin(signInRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(id,usuario);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUsuario(@PathVariable Long id) {
        return usuarioService.deleteUsuario(id);
    }

    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

}
