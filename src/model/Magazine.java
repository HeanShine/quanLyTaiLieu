package model;

public class Magazine extends Document {
    private int monthRelease;

    public Magazine() {
        super();
    }

    public Magazine(String nameDocument, int numberRelease, int monthRelease) {
        super(nameDocument, numberRelease);
        this.monthRelease = monthRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "idDocument=" + getIdDocument() +
                ", nameDocument='" + getNameDocument() + '\'' +
                ", numberRelease=" + getNumberRelease() +
                "monthRelease=" + monthRelease +
                '}';
    }
}
