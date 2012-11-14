package org.mael.chan4j;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FourChanPost {

	@Expose
	@SerializedName("no")
	private Long postNumber;

	@Expose
	@SerializedName("resto")
	private Long replyTo;

	@Expose
	@SerializedName("sticky")
	private Integer sticky;

	@Expose
	@SerializedName("closed")
	private Integer closed;

	@Expose
	@SerializedName("now")
	private String dateAndTime;

	@Expose
	@SerializedName("time")
	private Integer unixTimeStamp;

	@Expose
	@SerializedName("name")
	private String name;

	@Expose
	@SerializedName("trip")
	private String tripFag;

	@Expose
	@SerializedName("id")
	private String userId;

	@Expose
	@SerializedName("capcode")
	private String capcode;

	@Expose
	@SerializedName("country")
	private String country;

	@Expose
	@SerializedName("country_name")
	private String countryName;

	@Expose
	@SerializedName("email")
	private String email;

	@Expose
	@SerializedName("sub")
	private String subject;

	@Expose
	@SerializedName("com")
	private String comment;

	@Expose
	@SerializedName("tim")
	private Long renamedFileName;

	@Expose
	@SerializedName("filename")
	private String fileName;

	@Expose
	@SerializedName("ext")
	private String fileExtension;

	@Expose
	@SerializedName("fsize")
	private Integer fileSize;

	@Expose
	@SerializedName("md5")
	private String md5;

	@Expose
	@SerializedName("w")
	private Integer imageWidth;

	@Expose
	@SerializedName("h")
	private Integer imageHeight;

	@Expose
	@SerializedName("tn_w")
	private Integer thumbnailWidth;

	@Expose
	@SerializedName("tn_h")
	private Integer thumbnailHeight;

	@Expose
	@SerializedName("filedeleted")
	private Integer fileDeleted;

	@Expose
	@SerializedName("spoiler")
	private Integer spoiler;

	@Expose
	@SerializedName("custom_spoiler")
	private Integer customSpoiler;

	@Expose
	@SerializedName("omitted_posts")
	private Integer omittedPosts;

	@Expose
	@SerializedName("omitted_images")
	private Integer omittedImages;

	public FourChanPost() {

	}

	@Override
	public String toString() {

		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public Long getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(Long postNumber) {
		this.postNumber = postNumber;
	}

	public Long getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(Long replyTo) {
		this.replyTo = replyTo;
	}

	public Integer getSticky() {
		return sticky;
	}

	public void setSticky(Integer sticky) {
		this.sticky = sticky;
	}

	public Integer getClosed() {
		return closed;
	}

	public void setClosed(Integer closed) {
		this.closed = closed;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public Integer getUnixTimeStamp() {
		return unixTimeStamp;
	}

	public void setUnixTimeStamp(Integer unixTimeStamp) {
		this.unixTimeStamp = unixTimeStamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTripFag() {
		return tripFag;
	}

	public void setTripFag(String tripFag) {
		this.tripFag = tripFag;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCapcode() {
		return capcode;
	}

	public void setCapcode(String capcode) {
		this.capcode = capcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Long getRenamedFileName() {
		return renamedFileName;
	}

	public void setRenamedFileName(Long renamedFileName) {
		this.renamedFileName = renamedFileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public Integer getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}

	public Integer getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}

	public Integer getThumbnailWidth() {
		return thumbnailWidth;
	}

	public void setThumbnailWidth(Integer thumbnailWidth) {
		this.thumbnailWidth = thumbnailWidth;
	}

	public Integer getThumbnailHeight() {
		return thumbnailHeight;
	}

	public void setThumbnailHeight(Integer thumbnailHeight) {
		this.thumbnailHeight = thumbnailHeight;
	}

	public Integer getFileDeleted() {
		return fileDeleted;
	}

	public void setFileDeleted(Integer fileDeleted) {
		this.fileDeleted = fileDeleted;
	}

	public Integer getSpoiler() {
		return spoiler;
	}

	public void setSpoiler(Integer spoiler) {
		this.spoiler = spoiler;
	}

	public Integer getCustomSpoiler() {
		return customSpoiler;
	}

	public void setCustomSpoiler(Integer customSpoiler) {
		this.customSpoiler = customSpoiler;
	}

	public Integer getOmittedPosts() {
		return omittedPosts;
	}

	public void setOmittedPosts(Integer omittedPosts) {
		this.omittedPosts = omittedPosts;
	}

	public Integer getOmittedImages() {
		return omittedImages;
	}

	public void setOmittedImages(Integer omittedImages) {
		this.omittedImages = omittedImages;
	}

}