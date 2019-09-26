
package br.com.peixeurbano.model;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("attributes")
    private List<String> mAttributes;
    @SerializedName("available_units")
    private Long mAvailableUnits;
    @SerializedName("booking_required")
    private Boolean mBookingRequired;
    @SerializedName("booking_required_fields")
    private List<Object> mBookingRequiredFields;
    @SerializedName("buy_deal_ids")
    private List<Object> mBuyDealIds;
    @SerializedName("buying_options")
    private List<BuyingOption> mBuyingOptions;
    @SerializedName("canonical_url")
    private String mCanonicalUrl;
    @SerializedName("contract_id")
    private String mContractId;
    @SerializedName("contract_number")
    private String mContractNumber;
    @SerializedName("coupon_cancel_auto")
    private Boolean mCouponCancelAuto;
    @SerializedName("coupon_cancel_transaction_acquirer")
    private Boolean mCouponCancelTransactionAcquirer;
    @SerializedName("coupon_print_required")
    private Boolean mCouponPrintRequired;
    @SerializedName("cpf_required")
    private Boolean mCpfRequired;
    @SerializedName("deal_category")
    private String mDealCategory;
    @SerializedName("deal_city")
    private String mDealCity;
    @SerializedName("deal_disclosure")
    private String mDealDisclosure;
    @SerializedName("deal_format")
    private String mDealFormat;
    @SerializedName("deal_id")
    private String mDealId;
    @SerializedName("dealImage")
    private String mDealImage;
    @SerializedName("dealOriginalImage")
    private String mDealOriginalImage;
    @SerializedName("deal_type")
    private String mDealType;
    @SerializedName("email_subject")
    private String mEmailSubject;
    @SerializedName("enabled_domain")
    private List<String> mEnabledDomain;
    @SerializedName("exact_search")
    private List<Object> mExactSearch;
    @SerializedName("expiration_date")
    private String mExpirationDate;
    @SerializedName("fine_print")
    private String mFinePrint;
    @SerializedName("first_publishing_date")
    private String mFirstPublishingDate;
    @SerializedName("formatted_url")
    private String mFormattedUrl;
    @SerializedName("full_price")
    private BigDecimal mFullPrice;
    @SerializedName("highlights")
    private String mHighlights;
    @SerializedName("hotel_booking")
    private Boolean mHotelBooking;
    @SerializedName("images")
    private List<Image> mImages;
    @SerializedName("label_first_level")
    private String mLabelFirstLevel;
    @SerializedName("label_second_level")
    private String mLabelSecondLevel;
    @SerializedName("label_third_level")
    private String mLabelThirdLevel;
    @SerializedName("legacy_formatted_url")
    private String mLegacyFormattedUrl;
    @SerializedName("local")
    private Boolean mLocal;
    @SerializedName("location")
    private List<Location> mLocation;
    @SerializedName("locations")
    private List<Location> mLocations;
    @SerializedName("marketing_campaign")
    private String mMarketingCampaign;
    @SerializedName("minRefDistance")
    private String mMinRefDistance;
    @SerializedName("minRefDistanceLong")
    private Long mMinRefDistanceLong;
    @SerializedName("min_sale_price")
    private BigDecimal mMinSalePrice;
    @SerializedName("mobile_recharge")
    private Boolean mMobileRecharge;
    @SerializedName("needish_addresses")
    private List<Object> mNeedishAddresses;
    @SerializedName("one_year_promotion")
    private Boolean mOneYearPromotion;
    @SerializedName("option_end")
    private String mOptionEnd;
    @SerializedName("option_type")
    private String mOptionType;
    @SerializedName("page")
    private List<String> mPage;
    @SerializedName("page_id")
    private String mPageId;
    @SerializedName("partner")
    private Partner mPartner;
    @SerializedName("percentage_saved")
    private String mPercentageSaved;
    @SerializedName("pre_booking_mandatory")
    private Boolean mPreBookingMandatory;
    @SerializedName("pre_booking_required")
    private Boolean mPreBookingRequired;
    @SerializedName("product")
    private Boolean mProduct;
    @SerializedName("public")
    private Boolean mPublic;
    @SerializedName("publishing_date")
    private String mPublishingDate;
    @SerializedName("remaining_units")
    private Long mRemainingUnits;
    @SerializedName("replace_rules")
    private List<Object> mReplaceRules;
    @SerializedName("sale_price")
    private BigDecimal mSalePrice;
    @SerializedName("sales_forecast_number")
    private Long mSalesForecastNumber;
    @SerializedName("salesforce_deal_id")
    private String mSalesforceDealId;
    @SerializedName("shipping_address_required")
    private Boolean mShippingAddressRequired;
    @SerializedName("short_title")
    private String mShortTitle;
    @SerializedName("shortened_url")
    private String mShortenedUrl;
    @SerializedName("show_address")
    private Boolean mShowAddress;
    @SerializedName("show_cart_confirmation")
    private Boolean mShowCartConfirmation;
    @SerializedName("show_discount")
    private Boolean mShowDiscount;
    @SerializedName("show_select_levels")
    private Boolean mShowSelectLevels;
    @SerializedName("sold_out")
    private Boolean mSoldOut;
    @SerializedName("sold_units")
    private Long mSoldUnits;
    @SerializedName("sold_units_by_contract")
    private Long mSoldUnitsByContract;
    @SerializedName("symbolic_deal")
    private Boolean mSymbolicDeal;
    @SerializedName("tag_categories")
    private List<String> mTagCategories;
    @SerializedName("tag_categories_names")
    private List<String> mTagCategoriesNames;
    @SerializedName("tag_marketing")
    private List<String> mTagMarketing;
    @SerializedName("tag_regions")
    private List<Object> mTagRegions;
    @SerializedName("tag_regions_names")
    private List<Object> mTagRegionsNames;
    @SerializedName("tag_subcategories")
    private List<String> mTagSubcategories;
    @SerializedName("tag_subcategories_names")
    private List<String> mTagSubcategoriesNames;
    @SerializedName("tags")
    private List<String> mTags;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("travel")
    private Boolean mTravel;
    @SerializedName("ultra_brief_description")
    private String mUltraBriefDescription;
    @SerializedName("unified_discount_id")
    private Long mUnifiedDiscountId;
    @SerializedName("validity_message")
    private String mValidityMessage;
    @SerializedName("webview_cart")
    private Boolean mWebviewCart;

    public List<String> getAttributes() {
        return mAttributes;
    }

    public void setAttributes(List<String> attributes) {
        mAttributes = attributes;
    }

    public Long getAvailableUnits() {
        return mAvailableUnits;
    }

    public void setAvailableUnits(Long availableUnits) {
        mAvailableUnits = availableUnits;
    }

    public Boolean getBookingRequired() {
        return mBookingRequired;
    }

    public void setBookingRequired(Boolean bookingRequired) {
        mBookingRequired = bookingRequired;
    }

    public List<Object> getBookingRequiredFields() {
        return mBookingRequiredFields;
    }

    public void setBookingRequiredFields(List<Object> bookingRequiredFields) {
        mBookingRequiredFields = bookingRequiredFields;
    }

    public List<Object> getBuyDealIds() {
        return mBuyDealIds;
    }

    public void setBuyDealIds(List<Object> buyDealIds) {
        mBuyDealIds = buyDealIds;
    }

    public List<BuyingOption> getBuyingOptions() {
        return mBuyingOptions;
    }

    public void setBuyingOptions(List<BuyingOption> buyingOptions) {
        mBuyingOptions = buyingOptions;
    }

    public String getCanonicalUrl() {
        return mCanonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        mCanonicalUrl = canonicalUrl;
    }

    public String getContractId() {
        return mContractId;
    }

    public void setContractId(String contractId) {
        mContractId = contractId;
    }

    public String getContractNumber() {
        return mContractNumber;
    }

    public void setContractNumber(String contractNumber) {
        mContractNumber = contractNumber;
    }

    public Boolean getCouponCancelAuto() {
        return mCouponCancelAuto;
    }

    public void setCouponCancelAuto(Boolean couponCancelAuto) {
        mCouponCancelAuto = couponCancelAuto;
    }

    public Boolean getCouponCancelTransactionAcquirer() {
        return mCouponCancelTransactionAcquirer;
    }

    public void setCouponCancelTransactionAcquirer(Boolean couponCancelTransactionAcquirer) {
        mCouponCancelTransactionAcquirer = couponCancelTransactionAcquirer;
    }

    public Boolean getCouponPrintRequired() {
        return mCouponPrintRequired;
    }

    public void setCouponPrintRequired(Boolean couponPrintRequired) {
        mCouponPrintRequired = couponPrintRequired;
    }

    public Boolean getCpfRequired() {
        return mCpfRequired;
    }

    public void setCpfRequired(Boolean cpfRequired) {
        mCpfRequired = cpfRequired;
    }

    public String getDealCategory() {
        return mDealCategory;
    }

    public void setDealCategory(String dealCategory) {
        mDealCategory = dealCategory;
    }

    public String getDealCity() {
        return mDealCity;
    }

    public void setDealCity(String dealCity) {
        mDealCity = dealCity;
    }

    public String getDealDisclosure() {
        return mDealDisclosure;
    }

    public void setDealDisclosure(String dealDisclosure) {
        mDealDisclosure = dealDisclosure;
    }

    public String getDealFormat() {
        return mDealFormat;
    }

    public void setDealFormat(String dealFormat) {
        mDealFormat = dealFormat;
    }

    public String getDealId() {
        return mDealId;
    }

    public void setDealId(String dealId) {
        mDealId = dealId;
    }

    public String getDealImage() {
        return mDealImage;
    }

    public void setDealImage(String dealImage) {
        mDealImage = dealImage;
    }

    public String getDealOriginalImage() {
        return mDealOriginalImage;
    }

    public void setDealOriginalImage(String dealOriginalImage) {
        mDealOriginalImage = dealOriginalImage;
    }

    public String getDealType() {
        return mDealType;
    }

    public void setDealType(String dealType) {
        mDealType = dealType;
    }

    public String getEmailSubject() {
        return mEmailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        mEmailSubject = emailSubject;
    }

    public List<String> getEnabledDomain() {
        return mEnabledDomain;
    }

    public void setEnabledDomain(List<String> enabledDomain) {
        mEnabledDomain = enabledDomain;
    }

    public List<Object> getExactSearch() {
        return mExactSearch;
    }

    public void setExactSearch(List<Object> exactSearch) {
        mExactSearch = exactSearch;
    }

    public String getExpirationDate() {
        return mExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        mExpirationDate = expirationDate;
    }

    public String getFinePrint() {
        return mFinePrint;
    }

    public void setFinePrint(String finePrint) {
        mFinePrint = finePrint;
    }

    public String getFirstPublishingDate() {
        return mFirstPublishingDate;
    }

    public void setFirstPublishingDate(String firstPublishingDate) {
        mFirstPublishingDate = firstPublishingDate;
    }

    public String getFormattedUrl() {
        return mFormattedUrl;
    }

    public void setFormattedUrl(String formattedUrl) {
        mFormattedUrl = formattedUrl;
    }

    public BigDecimal getFullPrice() {
        return mFullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        mFullPrice = fullPrice;
    }

    public String getHighlights() {
        return mHighlights;
    }

    public void setHighlights(String highlights) {
        mHighlights = highlights;
    }

    public Boolean getHotelBooking() {
        return mHotelBooking;
    }

    public void setHotelBooking(Boolean hotelBooking) {
        mHotelBooking = hotelBooking;
    }

    public List<Image> getImages() {
        return mImages;
    }

    public void setImages(List<Image> images) {
        mImages = images;
    }

    public String getLabelFirstLevel() {
        return mLabelFirstLevel;
    }

    public void setLabelFirstLevel(String labelFirstLevel) {
        mLabelFirstLevel = labelFirstLevel;
    }

    public String getLabelSecondLevel() {
        return mLabelSecondLevel;
    }

    public void setLabelSecondLevel(String labelSecondLevel) {
        mLabelSecondLevel = labelSecondLevel;
    }

    public String getLabelThirdLevel() {
        return mLabelThirdLevel;
    }

    public void setLabelThirdLevel(String labelThirdLevel) {
        mLabelThirdLevel = labelThirdLevel;
    }

    public String getLegacyFormattedUrl() {
        return mLegacyFormattedUrl;
    }

    public void setLegacyFormattedUrl(String legacyFormattedUrl) {
        mLegacyFormattedUrl = legacyFormattedUrl;
    }

    public Boolean getLocal() {
        return mLocal;
    }

    public void setLocal(Boolean local) {
        mLocal = local;
    }

    public List<Location> getLocation() {
        return mLocation;
    }

    public void setLocation(List<Location> location) {
        mLocation = location;
    }

    public List<Location> getLocations() {
        return mLocations;
    }

    public void setLocations(List<Location> locations) {
        mLocations = locations;
    }

    public String getMarketingCampaign() {
        return mMarketingCampaign;
    }

    public void setMarketingCampaign(String marketingCampaign) {
        mMarketingCampaign = marketingCampaign;
    }

    public String getMinRefDistance() {
        return mMinRefDistance;
    }

    public void setMinRefDistance(String minRefDistance) {
        mMinRefDistance = minRefDistance;
    }

    public Long getMinRefDistanceLong() {
        return mMinRefDistanceLong;
    }

    public void setMinRefDistanceLong(Long minRefDistanceLong) {
        mMinRefDistanceLong = minRefDistanceLong;
    }

    public BigDecimal getMinSalePrice() {
        return mMinSalePrice;
    }

    public void setMinSalePrice(BigDecimal minSalePrice) {
        mMinSalePrice = minSalePrice;
    }

    public Boolean getMobileRecharge() {
        return mMobileRecharge;
    }

    public void setMobileRecharge(Boolean mobileRecharge) {
        mMobileRecharge = mobileRecharge;
    }

    public List<Object> getNeedishAddresses() {
        return mNeedishAddresses;
    }

    public void setNeedishAddresses(List<Object> needishAddresses) {
        mNeedishAddresses = needishAddresses;
    }

    public Boolean getOneYearPromotion() {
        return mOneYearPromotion;
    }

    public void setOneYearPromotion(Boolean oneYearPromotion) {
        mOneYearPromotion = oneYearPromotion;
    }

    public String getOptionEnd() {
        return mOptionEnd;
    }

    public void setOptionEnd(String optionEnd) {
        mOptionEnd = optionEnd;
    }

    public String getOptionType() {
        return mOptionType;
    }

    public void setOptionType(String optionType) {
        mOptionType = optionType;
    }

    public List<String> getPage() {
        return mPage;
    }

    public void setPage(List<String> page) {
        mPage = page;
    }

    public String getPageId() {
        return mPageId;
    }

    public void setPageId(String pageId) {
        mPageId = pageId;
    }

    public Partner getPartner() {
        return mPartner;
    }

    public void setPartner(Partner partner) {
        mPartner = partner;
    }

    public String getPercentageSaved() {
        return mPercentageSaved;
    }

    public void setPercentageSaved(String percentageSaved) {
        mPercentageSaved = percentageSaved;
    }

    public Boolean getPreBookingMandatory() {
        return mPreBookingMandatory;
    }

    public void setPreBookingMandatory(Boolean preBookingMandatory) {
        mPreBookingMandatory = preBookingMandatory;
    }

    public Boolean getPreBookingRequired() {
        return mPreBookingRequired;
    }

    public void setPreBookingRequired(Boolean preBookingRequired) {
        mPreBookingRequired = preBookingRequired;
    }

    public Boolean getProduct() {
        return mProduct;
    }

    public void setProduct(Boolean product) {
        mProduct = product;
    }



    public String getPublishingDate() {
        return mPublishingDate;
    }

    public void setPublishingDate(String publishingDate) {
        mPublishingDate = publishingDate;
    }

    public Long getRemainingUnits() {
        return mRemainingUnits;
    }

    public void setRemainingUnits(Long remainingUnits) {
        mRemainingUnits = remainingUnits;
    }

    public List<Object> getReplaceRules() {
        return mReplaceRules;
    }

    public void setReplaceRules(List<Object> replaceRules) {
        mReplaceRules = replaceRules;
    }

    public BigDecimal getSalePrice() {
        return mSalePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        mSalePrice = salePrice;
    }

    public Long getSalesForecastNumber() {
        return mSalesForecastNumber;
    }

    public void setSalesForecastNumber(Long salesForecastNumber) {
        mSalesForecastNumber = salesForecastNumber;
    }

    public String getSalesforceDealId() {
        return mSalesforceDealId;
    }

    public void setSalesforceDealId(String salesforceDealId) {
        mSalesforceDealId = salesforceDealId;
    }

    public Boolean getShippingAddressRequired() {
        return mShippingAddressRequired;
    }

    public void setShippingAddressRequired(Boolean shippingAddressRequired) {
        mShippingAddressRequired = shippingAddressRequired;
    }

    public String getShortTitle() {
        return mShortTitle;
    }

    public void setShortTitle(String shortTitle) {
        mShortTitle = shortTitle;
    }

    public String getShortenedUrl() {
        return mShortenedUrl;
    }

    public void setShortenedUrl(String shortenedUrl) {
        mShortenedUrl = shortenedUrl;
    }

    public Boolean getShowAddress() {
        return mShowAddress;
    }

    public void setShowAddress(Boolean showAddress) {
        mShowAddress = showAddress;
    }

    public Boolean getShowCartConfirmation() {
        return mShowCartConfirmation;
    }

    public void setShowCartConfirmation(Boolean showCartConfirmation) {
        mShowCartConfirmation = showCartConfirmation;
    }

    public Boolean getShowDiscount() {
        return mShowDiscount;
    }

    public void setShowDiscount(Boolean showDiscount) {
        mShowDiscount = showDiscount;
    }

    public Boolean getShowSelectLevels() {
        return mShowSelectLevels;
    }

    public void setShowSelectLevels(Boolean showSelectLevels) {
        mShowSelectLevels = showSelectLevels;
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

    public Long getSoldUnitsByContract() {
        return mSoldUnitsByContract;
    }

    public void setSoldUnitsByContract(Long soldUnitsByContract) {
        mSoldUnitsByContract = soldUnitsByContract;
    }

    public Boolean getSymbolicDeal() {
        return mSymbolicDeal;
    }

    public void setSymbolicDeal(Boolean symbolicDeal) {
        mSymbolicDeal = symbolicDeal;
    }

    public List<String> getTagCategories() {
        return mTagCategories;
    }

    public void setTagCategories(List<String> tagCategories) {
        mTagCategories = tagCategories;
    }

    public List<String> getTagCategoriesNames() {
        return mTagCategoriesNames;
    }

    public void setTagCategoriesNames(List<String> tagCategoriesNames) {
        mTagCategoriesNames = tagCategoriesNames;
    }

    public List<String> getTagMarketing() {
        return mTagMarketing;
    }

    public void setTagMarketing(List<String> tagMarketing) {
        mTagMarketing = tagMarketing;
    }

    public List<Object> getTagRegions() {
        return mTagRegions;
    }

    public void setTagRegions(List<Object> tagRegions) {
        mTagRegions = tagRegions;
    }

    public List<Object> getTagRegionsNames() {
        return mTagRegionsNames;
    }

    public void setTagRegionsNames(List<Object> tagRegionsNames) {
        mTagRegionsNames = tagRegionsNames;
    }

    public List<String> getTagSubcategories() {
        return mTagSubcategories;
    }

    public void setTagSubcategories(List<String> tagSubcategories) {
        mTagSubcategories = tagSubcategories;
    }

    public List<String> getTagSubcategoriesNames() {
        return mTagSubcategoriesNames;
    }

    public void setTagSubcategoriesNames(List<String> tagSubcategoriesNames) {
        mTagSubcategoriesNames = tagSubcategoriesNames;
    }

    public List<String> getTags() {
        return mTags;
    }

    public void setTags(List<String> tags) {
        mTags = tags;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Boolean getTravel() {
        return mTravel;
    }

    public void setTravel(Boolean travel) {
        mTravel = travel;
    }

    public String getUltraBriefDescription() {
        return mUltraBriefDescription;
    }

    public void setUltraBriefDescription(String ultraBriefDescription) {
        mUltraBriefDescription = ultraBriefDescription;
    }

    public Long getUnifiedDiscountId() {
        return mUnifiedDiscountId;
    }

    public void setUnifiedDiscountId(Long unifiedDiscountId) {
        mUnifiedDiscountId = unifiedDiscountId;
    }

    public String getValidityMessage() {
        return mValidityMessage;
    }

    public void setValidityMessage(String validityMessage) {
        mValidityMessage = validityMessage;
    }

    public Boolean getWebviewCart() {
        return mWebviewCart;
    }

    public void setWebviewCart(Boolean webviewCart) {
        mWebviewCart = webviewCart;
    }

}
