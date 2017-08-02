package br.com.desafiocoredata.model.blocos;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlocoByIdResponse implements Parcelable {

    @SerializedName("dado")
    @Expose
    private Dado dado;
    @SerializedName("link")
    @Expose
    private Link link;

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.dado, flags);
        dest.writeParcelable(this.link, flags);
    }

    public BlocoByIdResponse() {
    }

    protected BlocoByIdResponse(Parcel in) {
        this.dado = in.readParcelable(Dado.class.getClassLoader());
        this.link = in.readParcelable(Link.class.getClassLoader());
    }

    public static final Parcelable.Creator<BlocoByIdResponse> CREATOR = new Parcelable.Creator<BlocoByIdResponse>() {
        @Override
        public BlocoByIdResponse createFromParcel(Parcel source) {
            return new BlocoByIdResponse(source);
        }

        @Override
        public BlocoByIdResponse[] newArray(int size) {
            return new BlocoByIdResponse[size];
        }
    };
}