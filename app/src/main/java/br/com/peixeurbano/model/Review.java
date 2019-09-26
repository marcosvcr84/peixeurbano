
package br.com.peixeurbano.model;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("company_id")
    private Long mCompanyId;
    @SerializedName("reviews")
    private List<Review> mReviews;
    @SerializedName("reviews_count")
    private Long mReviewsCount;
    @SerializedName("score")
    private BigDecimal mScore;
    @SerializedName("show_score")
    private Boolean mShowScore;

    public Long getCompanyId() {
        return mCompanyId;
    }

    public void setCompanyId(Long companyId) {
        mCompanyId = companyId;
    }

    public List<Review> getReviews() {
        return mReviews;
    }

    public void setReviews(List<Review> reviews) {
        mReviews = reviews;
    }

    public Long getReviewsCount() {
        return mReviewsCount;
    }

    public void setReviewsCount(Long reviewsCount) {
        mReviewsCount = reviewsCount;
    }

    public BigDecimal getScore() {
        return mScore;
    }

    public void setScore(BigDecimal score) {
        mScore = score;
    }

    public Boolean getShowScore() {
        return mShowScore;
    }

    public void setShowScore(Boolean showScore) {
        mShowScore = showScore;
    }

}
