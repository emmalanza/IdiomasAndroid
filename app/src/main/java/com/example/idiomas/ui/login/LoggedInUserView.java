package com.example.idiomas.ui.login;

/**
 * Clase que expone detalles de usuarios autenticados a la IU.
 */
class LoggedInUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}
