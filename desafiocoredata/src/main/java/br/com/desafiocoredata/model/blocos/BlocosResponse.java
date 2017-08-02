
package br.com.desafiocoredata.model.blocos;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlocosResponse implements Parcelable {

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
        dest.writeList(this.dados);
        dest.writeList(this.links);
    }

    public BlocosResponse() {
    }

    protected BlocosResponse(Parcel in) {
        this.dados = new ArrayList<Dado>();
        in.readList(this.dados, Dado.class.getClassLoader());
        this.links = new ArrayList<Link>();
        in.readList(this.links, Link.class.getClassLoader());
    }

    public static final Parcelable.Creator<BlocosResponse> CREATOR = new Parcelable.Creator<BlocosResponse>() {
        @Override
        public BlocosResponse createFromParcel(Parcel source) {
            return new BlocosResponse(source);
        }

        @Override
        public BlocosResponse[] newArray(int size) {
            return new BlocosResponse[size];
        }
    };
}
