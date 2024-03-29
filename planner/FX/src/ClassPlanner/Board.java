package ClassPlanner;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toky
 */
public class Board implements XMLizable {

    private final String name;
    private final List<Section> sections;

    Board(String name) {
        this.sections = new ArrayList<>();
        this.name = name;
    }

    String getName(){
        return name;
    }

    List<Section> getSections() {
        return sections;
    }
    void addSection(Section t) {
        this.sections.add(t);
    }

    @Override
    public String toXML() {
        String sectionStr = "";
        for (Section s : sections) {
            sectionStr += s.toXML();
        }
        String res = "<board name='" + this.name + "'>\n" + sectionStr + "</board>\n";
        return res;
    }



}
