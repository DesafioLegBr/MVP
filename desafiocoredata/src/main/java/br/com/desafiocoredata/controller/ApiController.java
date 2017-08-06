package br.com.desafiocoredata.controller;


import android.util.Log;

import br.com.desafiocoredata.api.Constants;
import br.com.desafiocoredata.api.DesafioApi;
import br.com.desafiocoredata.model.CombinedApiResponse;
import br.com.desafiocoredata.model.blocos.BlocosResponse;
import br.com.desafiocoredata.model.partidos.PartidosResponse;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

public class ApiController extends BaseController {

    private static final String TAG = "ApiController";

    public ApiController(CoreDataCallback callback) {
        super(callback);
    }

    @Override
    public void call() {
        DesafioApi service = getService(DesafioApi.class, Constants.ENDPOINT);

        Observable<BlocosResponse> blocos = service.getBlocos()
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io());

        Observable<PartidosResponse> partidos = service.getPartidos()
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io());


        Observable<CombinedApiResponse> combined = Observable.zip(blocos, partidos, new Func2<BlocosResponse, PartidosResponse, CombinedApiResponse>() {
            @Override
            public CombinedApiResponse call(BlocosResponse blocosResponse, PartidosResponse partidosResponse) {
                return new CombinedApiResponse(blocosResponse, partidosResponse);
            }
        });

        combined.subscribe(new Subscriber<CombinedApiResponse>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: Combined completed");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: Combined Error", e);

                if (callback != null) {
                    callback.onError(e.getMessage());
                }
            }

            @Override
            public void onNext(CombinedApiResponse combinedApiResponse) {
                Log.d(TAG, "onNext: Combined Next");
                if (callback != null) {
                    callback.onSuccess(combinedApiResponse);
                }
            }
        });

    }
}
