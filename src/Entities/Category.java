package Entities;

public class Category {
    private String id;
    private String categoryName;

    public Category(){

    }
    public Category(String id, String categoryName){
        this.id = id;
        this.categoryName =categoryName;
    }

    public String getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setId(String id) {
        this.id = id;
    }
}
