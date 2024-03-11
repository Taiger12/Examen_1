package com.codigo.examen.service;

import com.codigo.examen.Request.SignInRequest;
import com.codigo.examen.Request.SignUpRequest;
import com.codigo.examen.Response.AuthenticationResponse;
import com.codigo.examen.entity.Usuario;

public interface AuthenticationService {
    Usuario signUpUser(SignUpRequest signUpRequest);
    Usuario signUpAdmin(SignUpRequest signUpRequest);
    AuthenticationResponse signin(SignInRequest signInRequest);
}
