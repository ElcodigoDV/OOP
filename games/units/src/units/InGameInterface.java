package units;

public interface InGameInterface {
    void step();
    String getInfo(){
        return this.name;
    };
}
