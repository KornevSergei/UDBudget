package sample;

public class Subcontractors {
    protected String nameCategorySubcontractors;
    protected double costPlannedSubcontractors;
    protected double costCPSubcontractors;
    protected double costActualSubcontractors;
    protected double actualDifferenceSubcontractors;
    protected double paidSubcontractors;
    protected double residueSubcontractors;
    protected String plannedCPSubcontractors;
    protected String actualCPSubcontractors;
    protected String accountSubcontractors;
    protected String contactsSubcontractors;
    protected String notesSubcontractors;
    protected String characteristicsSubcontractors;

    public Subcontractors(String nameCategorySubcontractors, double costPlannedSubcontractors, double costCPSubcontractors, double costActualSubcontractors,
                          double actualDifferenceSubcontractors, double paidSubcontractors, double residueSubcontractors, String plannedCPSubcontractors,
                          String actualCPSubcontractors, String accountSubcontractors, String contactsSubcontractors, String notesSubcontractors,
                          String characteristicsSubcontractors) {
        this.nameCategorySubcontractors = nameCategorySubcontractors;
        this.costPlannedSubcontractors = costPlannedSubcontractors;
        this.costCPSubcontractors = costCPSubcontractors;
        this.costActualSubcontractors = costActualSubcontractors;
        this.actualDifferenceSubcontractors = actualDifferenceSubcontractors;
        this.paidSubcontractors = paidSubcontractors;
        this.residueSubcontractors = residueSubcontractors;
        this.plannedCPSubcontractors = plannedCPSubcontractors;
        this.actualCPSubcontractors = actualCPSubcontractors;
        this.accountSubcontractors = accountSubcontractors;
        this.contactsSubcontractors = contactsSubcontractors;
        this.notesSubcontractors = notesSubcontractors;
        this.characteristicsSubcontractors = characteristicsSubcontractors;
    }

    public void CalculateActualDifferenceSubcontractors() {
        actualDifferenceSubcontractors = costCPSubcontractors - costActualSubcontractors;
    }

    public void CalculateResidueSubcontractors() {
        residueSubcontractors = costActualSubcontractors - paidSubcontractors;
    }

    public String getNameCategorySubcontractors() {
        return nameCategorySubcontractors;
    }

    public void setNameCategorySubcontractors(String nameCategorySubcontractors) {
        this.nameCategorySubcontractors = nameCategorySubcontractors;
    }

    public String getCostPlannedSubcontractors() {
        return Double.toString(costPlannedSubcontractors);
    }

    public void setCostPlannedSubcontractors(double costPlannedSubcontractors) {
        this.costPlannedSubcontractors = costPlannedSubcontractors;

    }public void setCostPlannedSubcontractors(String costPlannedSubcontractors) {
        this.costPlannedSubcontractors = Double.parseDouble(costPlannedSubcontractors);
    }

    public String getCostCPSubcontractors() {
        return Double.toString(costCPSubcontractors);
    }

    public void setCostCPSubcontractors(double costCPSubcontractors) {
        this.costCPSubcontractors = costCPSubcontractors;
    }
    public void setCostCPSubcontractors(String costCPSubcontractors) {
        this.costCPSubcontractors = Double.parseDouble(costCPSubcontractors);
        CalculateActualDifferenceSubcontractors();
    }

    public String getCostActualSubcontractors() {
        return Double.toString(costActualSubcontractors);
    }

    public void setCostActualSubcontractors(double costActualSubcontractors) {
        this.costActualSubcontractors = costActualSubcontractors;
    }
    public void setCostActualSubcontractors(String costActualSubcontractors) {
        this.costActualSubcontractors = Double.parseDouble(costActualSubcontractors);
        CalculateActualDifferenceSubcontractors();
        CalculateResidueSubcontractors();
    }

    public String getActualDifferenceSubcontractors() {
        return Double.toString(actualDifferenceSubcontractors);
    }

    public void setActualDifferenceSubcontractors(double actualDifferenceSubcontractors) {
        this.actualDifferenceSubcontractors = actualDifferenceSubcontractors;
    }

    public void setActualDifferenceSubcontractors(String actualDifferenceSubcontractors) {
        this.actualDifferenceSubcontractors = Double.parseDouble(actualDifferenceSubcontractors);
    }

    public String getPaidSubcontractors() {
        return Double.toString(paidSubcontractors);
    }

    public void setPaidSubcontractors(double paidSubcontractors) {
        this.paidSubcontractors = paidSubcontractors;
    }
    public void setPaidSubcontractors(String paidSubcontractors) {
        this.paidSubcontractors = Double.parseDouble(paidSubcontractors);
        CalculateResidueSubcontractors();
    }

    public String getResidueSubcontractors() {
        return Double.toString(residueSubcontractors);
    }

    public void setResidueSubcontractors(double residueSubcontractors) {
        this.residueSubcontractors = residueSubcontractors;
    }
    public void setResidueSubcontractors(String residueSubcontractors) {
        this.residueSubcontractors = Double.parseDouble(residueSubcontractors);
    }

    public String getPlannedCPSubcontractors() {
        return plannedCPSubcontractors;
    }

    public void setPlannedCPSubcontractors(String plannedCPSubcontractors) {
        this.plannedCPSubcontractors = plannedCPSubcontractors;
    }

    public String getActualCPSubcontractors() {
        return actualCPSubcontractors;
    }

    public void setActualCPSubcontractors(String actualCPSubcontractors) {
        this.actualCPSubcontractors = actualCPSubcontractors;
    }

    public String getAccountSubcontractors() {
        return accountSubcontractors;
    }

    public void setAccountSubcontractors(String accountSubcontractors) {
        this.accountSubcontractors = accountSubcontractors;
    }

    public String getContactsSubcontractors() {
        return contactsSubcontractors;
    }

    public void setContactsSubcontractors(String contactsSubcontractors) {
        this.contactsSubcontractors = contactsSubcontractors;
    }

    public String getNotesSubcontractors() {
        return notesSubcontractors;
    }

    public void setNotesSubcontractors(String notesSubcontractors) {
        this.notesSubcontractors = notesSubcontractors;
    }

    public String getCharacteristicsSubcontractors() {
        return characteristicsSubcontractors;
    }

    public void setCharacteristicsSubcontractors(String characteristicsSubcontractors) {
        this.characteristicsSubcontractors = characteristicsSubcontractors;
    }
}
