package com.example.idiomas.data;

import android.content.Intent;

import com.example.idiomas.Informacion;
import com.example.idiomas.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Clase que maneja la autenticación con credenciales de inicio de sesión y recupera información del usuario.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication

            // array de usuarios
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");

            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
