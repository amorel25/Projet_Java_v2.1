package GUI;

import java.util.ArrayList;

public class CaseModel {
    private int coordX;
    private int coordY;
    private ArrayList<ElemCaseModel> compElemCase;

    // Contructeur
    public CaseModel(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.compElemCase=new ArrayList<ElemCaseModel>();
    }

    public CaseModel(CaseModel caseM){
        this.coordX=caseM.coordX;
        this.coordY=caseM.coordY;
        this.compElemCase=caseM.compElemCase;
    }

    // Getters et Setters

    public int getCoordX() {
        return coordX;
    }


    public int getCoordY() {
        return coordY;
    }

    public ArrayList<ElemCaseModel> getCompElemCase() {
        return compElemCase;
    }

    public void setCompElemCase(ArrayList<ElemCaseModel> compElemCase) {
        this.compElemCase = compElemCase;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "CaseModele{" +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                ", compElemCase=" + compElemCase +
                '}';
    }
}
