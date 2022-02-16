package exercise1;

public class Names {
    int indexName;
    String name;

     public Names(int indexName, String name) {
         this.indexName = indexName;
         this.name = name;

     }

    public int getIndexName() {
        return indexName;
    }

    public void setIndexName(int indexName) {
        this.indexName = indexName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Names{" +
                "indexName=" + indexName +
                ", name='" + name + '\'' +
                '}';
    }
}
