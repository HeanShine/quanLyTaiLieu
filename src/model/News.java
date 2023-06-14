package model;

public class News extends Document {
    private int dayRelease;

    public News() {
        super();
    }

    public News(String nameDocument, int numberRelease, int dayRelease) {
        super(nameDocument, numberRelease);
        this.dayRelease = dayRelease;
    }

    public int getDayRelease() {
        return dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    @Override
    public String toString() {
        return "News{" +
                "idDocument=" + getIdDocument() +
                ", nameDocument='" + getNameDocument() + '\'' +
                ", numberRelease=" + getNumberRelease() +
                "dayRelease=" + dayRelease +
                '}';
    }
}
