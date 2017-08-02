
package br.com.desafiocoredata.model.blocos;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link implements Parcelable {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("rel")
    @Expose
    private String rel;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.href);
        dest.writeString(this.rel);
    }

    public Link() {
    }

    protected Link(Parcel in) {
        this.href = in.readString();
        this.rel = in.readString();
    }

    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>() {
        @Override
        public Link createFromParcel(Parcel source) {
            return new Link(source);
        }

        @Override
        public Link[] newArray(int size) {
            return new Link[size];
        }
    };
}
