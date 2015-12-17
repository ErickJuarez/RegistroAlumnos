package Proyecto;

import java.io.Serializable;

/**
 *
 * @author Erick
 */
public class Cuestionario implements Serializable{

    String pregunta;
    String opcA;
    String opcB;
    String opcC;
    String opcD;
    String opcCorrecta;

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    String getPregunta() {
        return this.pregunta;
    }

    public void setOpcA(String opcA) {
        this.opcA = opcA;
    }

    String getOpcA() {
        return this.opcA;
    }

    public void setOpcB(String opcB) {
        this.opcB = opcB;
    }

    String getOpcB() {
        return this.opcB;
    }

    public void setOpcC(String opcC) {
        this.opcC = opcC;
    }

    String getOpcC() {
        return this.opcC;
    }

    public void setOpcD(String opcD) {
        this.opcD = opcD;
    }

    String getOpcD() {
        return this.opcD;
    }

    public void setOpcCorrecta(String opcCorrecta) {
        this.opcCorrecta = opcCorrecta;
    }

    String getOpcCorrecta() {
        return this.opcCorrecta;
    }
}
