package br.com.desafiocoredata.model.blocos;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dado implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("idLegislatura")
    @Expose
    private String idLegislatura;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("uri")
    @Expose
    private String uri;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdLegislatura() {
        return idLegislatura;
    }

    public void setIdLegislatura(String idLegislatura) {
        this.idLegislatura = idLegislatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.idLegislatura);
        dest.writeString(this.nome);
        dest.writeString(this.uri);
    }

    public Dado() {
    }

    protected Dado(Parcel in) {
        this.id = in.readString();
        this.idLegislatura = in.readString();
        this.nome = in.readString();
        this.uri = in.readString();
    }

    public static final Parcelable.Creator<Dado> CREATOR = new Parcelable.Creator<Dado>() {
        @Override
        public Dado createFromParcel(Parcel source) {
            return new Dado(source);
        }

        @Override
        public Dado[] newArray(int size) {
            return new Dado[size];
        }
    };
}
