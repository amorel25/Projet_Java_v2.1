package GUI;

import javax.swing.*;
import java.awt.*;

public class ElemCaseModel {
    private ImageIcon image;
    private JLabel nb;
    private CaseModel caseM;

    // Contructeur
    public ElemCaseModel(ImageIcon image, CaseModel caseM) {
        this.image = image;
        this.caseM = caseM;
    }
    public ElemCaseModel(JLabel nb, CaseModel caseM) {
        this.nb = nb;
        this.caseM = caseM;
    }

    // Getters et Setters


    public JLabel getNb() {
        return nb;
    }

    public void setNb(JLabel nb) {
        this.nb = nb;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public CaseModel getCaseM() {
        return caseM;
    }

    public void setCaseM(CaseModel caseM) {
        this.caseM = caseM;
    }

    @Override
    public String toString() {
        return "ElemCaseModele{" +
                "image=" + image +
                ", case=" + caseM +
                '}';
    }
}
