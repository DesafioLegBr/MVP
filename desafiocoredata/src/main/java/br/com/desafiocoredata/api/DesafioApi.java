package br.com.desafiocoredata.api;

import br.com.desafiocoredata.model.blocos.BlocoByIdResponse;
import br.com.desafiocoredata.model.blocos.BlocosResponse;
import br.com.desafiocoredata.model.partidos.PartidosResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface DesafioApi {

    //BLOCOS
    @GET("/api/v2//blocos")
    Observable<BlocosResponse> getBlocos();

    @GET("/api/v2//blocos/{id}")
    Observable<BlocoByIdResponse> getBloco(@Path("id") String id);

//    //VOTAÇÕES
//    @GET("/votacoes/{id}")
//    Call<> getVoteInfoById(@Path("id") String id);
//
//    @GET("/proposicoes/{id}/votacoes")
//    Call<> getVotesFromProposicao(@Path("id") String id);
//
//    @GET("/votacoes/{id}/votos")
//    Call<> getVoteCountById(@Path("id") String id); //TODO implementar paginação
//
//    //PARTIDOS
    @GET("/api/v2/partidos")
    Observable<PartidosResponse> getPartidos();
//
//    @GET("/partidos/{id}")
//    Call<> getPartidoById(@Path("id") String id);
//
//    //DEPUTADOS
//    @GET("/deputados")
//    Call<> getDeputados();
//
//    @GET("/deputados/{id}")
//    Call<> getDeputadoInfoById(@Path("id") String id); //TODO implementar paginação e filtro
//
//    @GET("/deputados/{id}/despesas")
//    Call<> getPartidoById(@Path("id") String id); //TODO implementar paginação e filtro
//
//    @GET("/deputados/{id}/eventos")
//    Call<> getPartidoById(@Path("id") String id); //TODO implementar paginação e filtro
//
//    @GET("/deputados/{id}/orgaos")
//    Call<> getPartidoById(@Path("id") String id); //TODO implementar paginação e filtro
//
//    @GET("/legislaturas/{id}/mesa")
//    Call<> getDeputadosFromMesa(@Path("id") String id); //TODO implementar paginação e filtro
//
//    //LEGISLATURA
//    @GET("/legislaturas")
//    Call<> getLegislaturas(); //TODO implementar paginação e filtro
//
//    @GET("/legislaturas/{id}")
//    Call<> getLegislaturaInfoById(@Path("id") String id);
//
//    @GET("/legislaturas/{id}/mesa")
//    Call<> getDeputadosFromLegislatura(@Path("id") String id);


}
