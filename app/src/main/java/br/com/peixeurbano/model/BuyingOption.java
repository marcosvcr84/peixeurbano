
package br.com.peixeurbano.model;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BuyingOption {

    @SerializedName("active")
    private Boolean mActive;
    @SerializedName("available_units")
    private Long mAvailableUnits;
    @SerializedName("booking_enabled")
    private Boolean mBookingEnabled;
    @SerializedName("buying_option_id")
    private String mBuyingOptionId;
    @SerializedName("contracting_party_fee")
    private Double mContractingPartyFee;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("disclosure")
    private String mDisclosure;
    @SerializedName("ecommerce_info")
    private EcommerceInfo mEcommerceInfo;
    @SerializedName("end")
    private String mEnd;
    @SerializedName("fees")
    private List<Object> mFees;
    @SerializedName("full_price")
    private BigDecimal mFullPrice;
    @SerializedName("monthly_installment")
    private Long mMonthlyInstallment;
    @SerializedName("option_type")
    private String mOptionType;
    @SerializedName("order")
    private Long mOrder;
    @SerializedName("percentage_saved")
    private Long mPercentageSaved;
    @SerializedName("price_version")
    private BigDecimal mPriceVersion;
    @SerializedName("price_version_coupons_qty")
    private BigDecimal mPriceVersionCouponsQty;
    @SerializedName("sale_price")
    private BigDecimal mSalePrice;
    @SerializedName("shipping_fees")
    private List<Object> mShippingFees;
    @SerializedName("sold_out")
    private Boolean mSoldOut;
    @SerializedName("sold_units")
    private Long mSoldUnits;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("title_first_level")
    private String mTitleFirstLevel;
    @SerializedName("title_fourth_level")
    private String mTitleFourthLevel;
    @SerializedName("title_second_level")
    private String mTitleSecondLevel;
    @SerializedName("title_third_level")
    private String mTitleThirdLevel;

    public Boolean getActive() {
        return mActive;
    }

    public void setActive(Boolean active) {
        mActive = active;
    }

    public Long getAvailableUnits() {
        return mAvailableUnits;
    }

    public void setAvailableUnits(Long availableUnits) {
        mAvailableUnits = availableUnits;
    }

    public Boolean getBookingEnabled() {
        return mBookingEnabled;
    }

    public void setBookingEnabled(Boolean bookingEnabled) {
        mBookingEnabled = bookingEnabled;
    }

    public String getBuyingOptionId() {
        return mBuyingOptionId;
    }

    public void setBuyingOptionId(String buyingOptionId) {
        mBuyingOptionId = buyingOptionId;
    }

    public Double getContractingPartyFee() {
        return mContractingPartyFee;
    }

    public void setContractingPartyFee(Double contractingPartyFee) {
        mContractingPartyFee = contractingPartyFee;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDisclosure() {
        return mDisclosure;
    }

    public void setDisclosure(String disclosure) {
        mDisclosure = disclosure;
    }

    public EcommerceInfo getEcommerceInfo() {
        return mEcommerceInfo;
    }

    public void setEcommerceInfo(EcommerceInfo ecommerceInfo) {
        mEcommerceInfo = ecommerceInfo;
    }

    public String getEnd() {
        return mEnd;
    }

    public void setEnd(String end) {
        mEnd = end;
    }

    public List<Object> getFees() {
        return mFees;
    }

    public void setFees(List<Object> fees) {
        mFees = fees;
    }

    public BigDecimal getFullPrice() {
        return mFullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        mFullPrice = fullPrice;
    }

    public Long getMonthlyInstallment() {
        return mMonthlyInstallment;
    }

    public void setMonthlyInstallment(Long monthlyInstallment) {
        mMonthlyInstallment = monthlyInstallment;
    }

    public String getOptionType() {
        return mOptionType;
    }

    public void setOptionType(String optionType) {
        mOptionType = optionType;
    }

    public Long getOrder() {
        return mOrder;
    }

    public void setOrder(Long order) {
        mOrder = order;
    }

    public Long getPercentageSaved() {
        return mPercentageSaved;
    }

    public void setPercentageSaved(Long percentageSaved) {
        mPercentageSaved = percentageSaved;
    }

    public BigDecimal getPriceVersion() {
        return mPriceVersion;
    }

    public void setPriceVersion(BigDecimal priceVersion) {
        mPriceVersion = priceVersion;
    }

    public BigDecimal getPriceVersionCouponsQty() {
        return mPriceVersionCouponsQty;
    }

    public void setPriceVersionCouponsQty(BigDecimal priceVersionCouponsQty) {
        mPriceVersionCouponsQty = priceVersionCouponsQty;
    }

    public BigDecimal getSalePrice() {
        return mSalePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        mSalePrice = salePrice;
    }

    public List<Object> getShippingFees() {
        return mShippingFees;
    }

    public void setShippingFees(List<Object> shippingFees) {
        mShippingFees = shippingFees;
    }

    public Boolean getSoldOut() {
        return mSoldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        mSoldOut = soldOut;
    }

    public Long getSoldUnits() {
        return mSoldUnits;
    }

    public void setSoldUnits(Long soldUnits) {
        mSoldUnits = soldUnits;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitleFirstLevel() {
        return mTitleFirstLevel;
    }

    public void setTitleFirstLevel(String titleFirstLevel) {
        mTitleFirstLevel = titleFirstLevel;
    }

    public String getTitleFourthLevel() {
        return mTitleFourthLevel;
    }

    public void setTitleFourthLevel(String titleFourthLevel) {
        mTitleFourthLevel = titleFourthLevel;
    }

    public String getTitleSecondLevel() {
        return mTitleSecondLevel;
    }

    public void setTitleSecondLevel(String titleSecondLevel) {
        mTitleSecondLevel = titleSecondLevel;
    }

    public String getTitleThirdLevel() {
        return mTitleThirdLevel;
    }

    public void setTitleThirdLevel(String titleThirdLevel) {
        mTitleThirdLevel = titleThirdLevel;
    }

}
