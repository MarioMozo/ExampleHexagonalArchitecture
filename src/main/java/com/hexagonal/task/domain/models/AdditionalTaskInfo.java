package com.hexagonal.task.domain.models;

public class AdditionalTaskInfo {
    //Se van a crear constantes, ya que la información no se setea, sino se accede a ella desde un servicio externo
    //Se tienen que crear con sus constructores
    //Solo se crean sus getters, ya que solo se va a acceder a ellos
    // A TODO ESTO SE LE LLAMA INMUTABILIDAD
    //Inmutabilidad: propiedad de los objetos, los cuales no se pueden modificar despues de su creación.

    private final Long userId;
    private final String userName;
    private final String userEmail;

    public AdditionalTaskInfo(Long userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
