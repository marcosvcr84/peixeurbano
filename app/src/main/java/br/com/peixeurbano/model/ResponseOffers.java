
package br.com.peixeurbano.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseOffers {

    @SerializedName("code")
    private Long mCode;
    @SerializedName("response")
    private List<Response> mResponse;

    public Long getCode() {
        return mCode;
    }

    public void setCode(Long code) {
        mCode = code;
    }

    public List<Response> getResponse() {
        return mResponse;
    }

    public void setResponse(List<Response> response) {
        mResponse = response;
    }

}
