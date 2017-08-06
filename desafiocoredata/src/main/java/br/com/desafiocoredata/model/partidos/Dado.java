package br.com.desafiocoredata.model.partidos;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dado implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sigla")
    @Expose
    private String sigla;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("uri")
    @Expose
    private String uri;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
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
        dest.writeValue(this.id);
        dest.writeString(this.sigla);
        dest.writeString(this.nome);
        dest.writeString(this.uri);
    }

    public Dado() {
    }

    protected Dado(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.sigla = in.readString();
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