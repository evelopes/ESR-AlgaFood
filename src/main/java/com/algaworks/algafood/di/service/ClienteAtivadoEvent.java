package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
    private Cliente client;

    public Cliente getClient() {
        return client;
    }

    public ClienteAtivadoEvent(Cliente client) {
        this.client = client;
    }
}
