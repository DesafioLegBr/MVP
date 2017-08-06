package br.com.desafiocoredata.model;


import android.os.Parcel;
import android.os.Parcelable;

import br.com.desafiocoredata.model.blocos.BlocosResponse;
import br.com.desafiocoredata.model.partidos.PartidosResponse;

public class CombinedApiResponse implements Parcelable {

    private BlocosResponse blocosResponse;
    private PartidosResponse partidosResponse;

    public CombinedApiResponse() {
    }

    public CombinedApiResponse(BlocosResponse blocosResponse, PartidosResponse partidosResponse) {
        this.blocosResponse = blocosResponse;
        this.partidosResponse = partidosResponse;
    }

    public BlocosResponse getBlocosResponse() {
        return blocosResponse;
    }

    public void setBlocosResponse(BlocosResponse blocosResponse) {
        this.blocosResponse = blocosResponse;
    }

    public PartidosResponse getPartidosResponse() {
        return partidosResponse;
    }

    public void setPartidosResponse(PartidosResponse partidosResponse) {
        this.partidosResponse = partidosResponse;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.blocosResponse, flags);
        dest.writeParcelable(this.partidosResponse, flags);
    }

    protected CombinedApiResponse(Parcel in) {
        this.blocosResponse = in.readParcelable(BlocosResponse.class.getClassLoader());
        this.partidosResponse = in.readParcelable(PartidosResponse.class.getClassLoader());
    }

    public static final Parcelable.Creator<CombinedApiResponse> CREATOR = new Parcelable.Creator<CombinedApiResponse>() {
        @Override
        public CombinedApiResponse createFromParcel(Parcel source) {
            return new CombinedApiResponse(source);
        }

        @Override
        public CombinedApiResponse[] newArray(int size) {
            return new CombinedApiResponse[size];
        }
    };
}
