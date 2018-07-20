package com.example.donna.newsapplication;

/**
 * An {@link Article} object contains information related to a single earthquake.
 */


public class Article {

    //** The section name of article */
    private String mSectionName;

    //** The publication date name of article */
    private String mWebPublicationDate;

    /**
     * The publication date name of article
     */
    private String mWebTitle;
    /**
     * The publication date name of article
     */
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param sectionName        is the section where the article belongs
     * @param webPublicationDate is the date whent article was published
     * @param webTitle           is the contributor of the article
     * @param url                is the website URL to find more details about the earthquake
     */

    public Article(String sectionName, String webPublicationDate, String webTitle, String url) {
        mSectionName = sectionName;
        mWebPublicationDate = webPublicationDate;
        mWebTitle = webTitle;

        mUrl = url;

    }

    /**
     * Returns the sectionName of the article.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the sectionName of the article.
     */
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the sectionName of the article.
     */
    public String getWebTitle() {
        return mWebTitle;

    }

    /**
     * Returns the  website URL to find more information about the article.
     */
    public String getUrl() {
        return mUrl;

    }
}
