package ir.msdehghan.plugins.ansible.model.ansible.task;

import java.util.List;
import java.util.Map;
import java.util.Set;

class AnsibleModuleDto {
    public String name;
    public String category;
    public Set<String> returnFields;
    public String addedIn;
    public String shortDescription;
    public String description;
    public Deprecated deprecated;
    public String requirements;
    public String notes;
    public Map<String, Field> fields;

    static class Deprecated {
        public String alternative;
        public String why;
        public String removedIn;
    }

    static class Field {
        public List<String> aliases;
        public List<String> choices;
        public String description;
        public String elements;
        public Boolean required;
        public String type;
        public String versionAdded;
        public String defaultValue;
    }
}
