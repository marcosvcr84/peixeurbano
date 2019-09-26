
package br.com.peixeurbano.model;

import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("image")
    private String mImage;
    @SerializedName("original")
    private String mOriginal;
    @SerializedName("thumb")
    private String mThumb;

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getOriginal() {
        return mOriginal;
    }

    public void setOriginal(String original) {
        mOriginal = original;
    }

    public String getThumb() {
        return mThumb;
    }

    public void setThumb(String thumb) {
        mThumb = thumb;
    }

}
