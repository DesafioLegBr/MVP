package br.com.desafiocoredata.api;

import br.com.desafiocoredata.model.blocos.BlocoByIdResponse;
import br.com.desafiocoredata.model.blocos.BlocosResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by root-matheus on 01/08/17.
 */

public interface DesafioApi {

    //BLOCOS
    @GET("/blocos")
    Call<BlocosResponse> getBlocos();

    @GET("/blocos/{id}")
    Call<BlocoByIdResponse> getBloco(@Path("id") String id);

    //VOTAÇÕES
    @GET("/votacoes/{id}")
    Call<> getVoteInfoById(@Path("id") String id);

    @GET("/proposicoes/{id}/votacoes")
    Call<> getVotesFromProposicao(@Path("id") String id);

    @GET("/votacoes/{id}/votos")
    Call<> getVoteCountById(@Path("id") String id); //TODO implementar paginação

    //PARTIDOS
    @GET("/partidos")
    Call<> getPartidos();

    @GET("/partidos/{id}")
    Call<> getPartidoById(@Path("id") String id);

    //DEPUTADOS
    @GET("/deputados")
    Call<> getDeputados();

    @GET("/deputados/{id}")
    Call<> getDeputadoInfoById(@Path("id") String id); //TODO implementar paginação e filtro

    @GET("/deputados/{id}/despesas")
    Call<> getPartidoById(@Path("id") String id); //TODO implementar paginação e filtro

    @GET("/deputados/{id}/eventos")
    Call<> getPartidoById(@Path("id") String id); //TODO implementar paginação e filtro

    @GET("/deputados/{id}/orgaos")
    Call<> getPartidoById(@Path("id") String id); //TODO implementar paginação e filtro

}
