package co.com.qaautomation.test.enums;

public enum Path {
    FILE("./src/test/resources/co/com/qaautomation/test/data/DataFile.xlsx"),
    SELECT("select * from "),
    NAME("Qvision"),
    WHERE(" where ID_Prueba = 1"),
    ;

    private String getPath;
    Path(String path) {this.getPath = path;}
    public String getPath() {return getPath;}

}
