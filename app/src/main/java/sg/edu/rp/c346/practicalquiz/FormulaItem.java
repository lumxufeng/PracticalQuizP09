package sg.edu.rp.c346.practicalquiz;

/**
 * Created by 16043921 on 16/7/2018.
 */

public class FormulaItem {

    private String title;
    private String formula;
    private String description;

    public FormulaItem(String title, String formula, String description) {
        this.title = title;
        this.formula = formula;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FormulaItem{" +
                "title='" + title + '\'' +
                ", formula='" + formula + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
