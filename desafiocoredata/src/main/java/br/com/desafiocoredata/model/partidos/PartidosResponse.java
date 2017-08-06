package br.com.desafiocoredata.model.partidos;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PartidosResponse implements Parcelable {

    @SerializedName("dados")
    @Expose
    private List<Dado> dados = null;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;

    public List<Dado> getDados() {
        return dados;
    }

    public void setDados(List<Dado> dados) {
        this.dados = dados;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.dados);
        dest.writeTypedList(this.links);
    }

    public PartidosResponse() {
    }

    protected PartidosResponse(Parcel in) {
        this.dados = in.createTypedArrayList(Dado.CREATOR);
        this.links = in.createTypedArrayList(Link.CREATOR);
    }

    public static final Parcelable.Creator<PartidosResponse> CREATOR = new Parcelable.Creator<PartidosResponse>() {
        @Override
        public PartidosResponse createFromParcel(Parcel source) {
            return new PartidosResponse(source);
        }

        @Override
        public PartidosResponse[] newArray(int size) {
            return new PartidosResponse[size];
        }
    };
}