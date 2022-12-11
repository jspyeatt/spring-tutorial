package my.spring.core.collections;

import java.util.*;

public class CollectionHolder {
    private List<String> myList;
    private Set<String> myset;
    private Map<String, String> mymap;
    private Properties myProperties;

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Set<String> getMyset() {
        return myset;
    }

    public void setMyset(Set<String> myset) {
        this.myset = myset;
    }

    public Map<String, String> getMymap() {
        return mymap;
    }

    public void setMymap(Map<String, String> mymap) {
        this.mymap = mymap;
    }

    public Properties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CollectionHolder.class.getSimpleName() + "[", "]")
                .add("myList=" + myList)
                .add("myset=" + myset)
                .add("mymap=" + mymap)
                .add("myProperties=" + myProperties)
                .toString();
    }
}
