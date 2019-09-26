
package br.com.peixeurbano.model;

import com.google.gson.annotations.SerializedName;

public class EcommerceInfo {

    @SerializedName("origin_zip_code")
    private String mOriginZipCode;

    public String getOriginZipCode() {
        return mOriginZipCode;
    }

    public void setOriginZipCode(String originZipCode) {
        mOriginZipCode = originZipCode;
    }

}
