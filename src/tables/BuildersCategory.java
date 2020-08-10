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

    public double getConstructionWorksBuildersCategory() {
        return constructionWorksBuildersCategory;
    }

    public void setConstructionWorksBuildersCategory(double constructionWorksBuildersCategory) {
        this.constructionWorksBuildersCategory = constructionWorksBuildersCategory;
    }

    public double getDraftMaterialBuildersCategory() {
        return draftMaterialBuildersCategory;
    }

    public void setDraftMaterialBuildersCategory(double draftMaterialBuildersCategory) {
        this.draftMaterialBuildersCategory = draftMaterialBuildersCategory;
    }
}
