package tables;

public class BuildersCategory {
    public String categoryBuildersCategory;
    public double constructionWorksBuildersCategory;
    public double draftMaterialBuildersCategory;

    public BuildersCategory(String categoryBuildersCategory, double constructionWorksBuildersCategory, double draftMaterialBuildersCategory) {
        this.categoryBuildersCategory = categoryBuildersCategory;
        this.constructionWorksBuildersCategory = constructionWorksBuildersCategory;
        this.draftMaterialBuildersCategory = draftMaterialBuildersCategory;
    }


    public String getCategoryBuildersCategory() {
        return categoryBuildersCategory;
    }
    public void setCategoryBuildersCategory(String categoryBuildersCategory) {
        this.categoryBuildersCategory = categoryBuildersCategory;
    }



    public String getConstructionWorksBuildersCategory() {
        return Double.toString(constructionWorksBuildersCategory);
    }
    public void setConstructionWorksBuildersCategory(double constructionWorksBuildersCategory) {
        this.constructionWorksBuildersCategory = constructionWorksBuildersCategory;
    }
    public void setConstructionWorksBuildersCategory(String constructionWorksBuildersCategory) {
        this.constructionWorksBuildersCategory = Double.parseDouble(constructionWorksBuildersCategory);
    }



    public String getDraftMaterialBuildersCategory() {
        return Double.toString(draftMaterialBuildersCategory);
    }
    public void setDraftMaterialBuildersCategory(double draftMaterialBuildersCategory) {
        this.draftMaterialBuildersCategory = draftMaterialBuildersCategory;
    }
    public void setDraftMaterialBuildersCategory(String draftMaterialBuildersCategory) {
        this.draftMaterialBuildersCategory = Double.parseDouble(draftMaterialBuildersCategory);
    }
}
