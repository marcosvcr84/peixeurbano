
package br.com.peixeurbano.model;

import com.google.gson.annotations.SerializedName;

public class Partner {

    @SerializedName("account_id")
    private String mAccountId;
    @SerializedName("additional_address_info")
    private String mAdditionalAddressInfo;
    @SerializedName("address")
    private String mAddress;
    @SerializedName("canonical_url")
    private String mCanonicalUrl;
    @SerializedName("city")
    private String mCity;
    @SerializedName("city_slug")
    private String mCitySlug;
    @SerializedName("cnpj")
    private String mCnpj;
    @SerializedName("company_name")
    private String mCompanyName;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("formatted_url")
    private String mFormattedUrl;
    @SerializedName("image")
    private String mImage;
    @SerializedName("name")
    private String mName;
    @SerializedName("neighborhood")
    private String mNeighborhood;
    @SerializedName("neighborhood_slug_name")
    private String mNeighborhoodSlugName;
    @SerializedName("number")
    private String mNumber;
    @SerializedName("phone_number")
    private String mPhoneNumber;
    @SerializedName("place_name")
    private String mPlaceName;
    @SerializedName("review")
    private Review mReview;
    @SerializedName("state")
    private String mState;
    @SerializedName("website")
    private String mWebsite;
    @SerializedName("zip_code")
    private String mZipCode;

    public String getAccountId() {
        return mAccountId;
    }

    public void setAccountId(String accountId) {
        mAccountId = accountId;
    }

    public String getAdditionalAddressInfo() {
        return mAdditionalAddressInfo;
    }

    public void setAdditionalAddressInfo(String additionalAddressInfo) {
        mAdditionalAddressInfo = additionalAddressInfo;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getCanonicalUrl() {
        return mCanonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        mCanonicalUrl = canonicalUrl;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getCitySlug() {
        return mCitySlug;
    }

    public void setCitySlug(String citySlug) {
        mCitySlug = citySlug;
    }

    public String getCnpj() {
        return mCnpj;
    }

    public void setCnpj(String cnpj) {
        mCnpj = cnpj;
    }

    public String getCompanyName() {
        return mCompanyName;
    }

    public void setCompanyName(String companyName) {
        mCompanyName = companyName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getFormattedUrl() {
        return mFormattedUrl;
    }

    public void setFormattedUrl(String formattedUrl) {
        mFormattedUrl = formattedUrl;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNeighborhood() {
        return mNeighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        mNeighborhood = neighborhood;
    }

    public String getNeighborhoodSlugName() {
        return mNeighborhoodSlugName;
    }

    public void setNeighborhoodSlugName(String neighborhoodSlugName) {
        mNeighborhoodSlugName = neighborhoodSlugName;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceName(String placeName) {
        mPlaceName = placeName;
    }

    public Review getReview() {
        return mReview;
    }

    public void setReview(Review review) {
        mReview = review;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

    public String getZipCode() {
        return mZipCode;
    }

    public void setZipCode(String zipCode) {
        mZipCode = zipCode;
    }

}
