package br.com.desafiocoredata.controller;


import br.com.desafiocoredata.model.CombinedApiResponse;

public interface CoreDataCallback {

    void onSuccess(CombinedApiResponse response);
    void onError(String message);
}
