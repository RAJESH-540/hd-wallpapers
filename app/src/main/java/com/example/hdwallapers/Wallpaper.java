package com.example.hdwallapers;

import com.google.gson.annotations.SerializedName;

public class Wallpaper {
    private int id;
    private String width;
    private String height;
//    private FileType fileType;
    private String fileSize;

    @SerializedName("url_image")
    private String urlImage;
    private String urlThumb;
    private String urlPage;
    private String category;
    private String categoryID;
    private String subCategory;
    private String subCategoryID;


    @SerializedName("user_name")
    private String userName;
    private String userID;

    public int getID() { return id; }
    public void setID(int value) { this.id = value; }

    public String getWidth() { return width; }
    public void setWidth(String value) { this.width = value; }

    public String getHeight() { return height; }
    public void setHeight(String value) { this.height = value; }

//    public FileType getFileType() { return fileType; }
//    public void setFileType(FileType value) { this.fileType = value; }

    public String getFileSize() { return fileSize; }
    public void setFileSize(String value) { this.fileSize = value; }

    public String getURLImage() { return urlImage; }
    public void setURLImage(String value) { this.urlImage = value; }

    public String getURLThumb() { return urlThumb; }
    public void setURLThumb(String value) { this.urlThumb = value; }

    public String getURLPage() { return urlPage; }
    public void setURLPage(String value) { this.urlPage = value; }

    public String getCategory() { return category; }
    public void setCategory(String value) { this.category = value; }

    public String getCategoryID() { return categoryID; }
    public void setCategoryID(String value) { this.categoryID = value; }

    public String getSubCategory() { return subCategory; }
    public void setSubCategory(String value) { this.subCategory = value; }

    public String getSubCategoryID() { return subCategoryID; }
    public void setSubCategoryID(String value) { this.subCategoryID = value; }

    public String getUserName() { return userName; }
    public void setUserName(String value) { this.userName = value; }

    public String getUserID() { return userID; }
    public void setUserID(String value) { this.userID = value; }
}


