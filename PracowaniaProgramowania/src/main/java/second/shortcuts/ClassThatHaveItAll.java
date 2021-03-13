package second.shortcuts;

import java.util.List;

public class ClassThatHaveItAll implements InterfaceOne {

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ClassThatHaveItAll.class);

    List<Long> list;
    String name;
    Integer number;

    public ClassThatHaveItAll(List<Long> list) {
        this.list = list;
    }

    public void setList(List<Long> list) {
        this.list = list;
    }

    public List<Long> getList() {
        return list;
    }

    public void printMe(String info) {
        logger.info(info);
    }

    public void usageOfPrint() {
        printMe("Hi");
    }
}
