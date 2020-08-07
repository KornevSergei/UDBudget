package tables;

public class Project {
    protected String nameProject;

    public Project() {
    }

    public Project(String colNameProject) {
        this.nameProject = colNameProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }
}

